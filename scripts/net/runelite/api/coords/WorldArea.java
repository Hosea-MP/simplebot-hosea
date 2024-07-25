/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.coords;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

public class WorldArea {
    private int x;
    private int y;
    private int width;
    private int height;
    private int plane;

    public WorldArea(int x, int y, int width, int height, int plane) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.plane = plane;
    }

    public WorldArea(WorldPoint location, int width, int height) {
        this.x = location.getX();
        this.y = location.getY();
        this.plane = location.getPlane();
        this.width = width;
        this.height = height;
    }

    private Point getAxisDistances(WorldArea other) {
        Point p1 = this.getComparisonPoint(other);
        Point p2 = other.getComparisonPoint(this);
        return new Point(Math.abs(p1.getX() - p2.getX()), Math.abs(p1.getY() - p2.getY()));
    }

    public int distanceTo(WorldArea other) {
        if (this.getPlane() != other.getPlane()) {
            return Integer.MAX_VALUE;
        }
        return this.distanceTo2D(other);
    }

    public int distanceTo(WorldPoint other) {
        return this.distanceTo(other.toWorldArea());
    }

    public int distanceTo2D(WorldArea other) {
        Point distances = this.getAxisDistances(other);
        return Math.max(distances.getX(), distances.getY());
    }

    public int distanceTo2D(WorldPoint other) {
        return this.distanceTo2D(other.toWorldArea());
    }

    public boolean contains(WorldPoint worldPoint) {
        return this.distanceTo(worldPoint) == 0;
    }

    public boolean contains2D(WorldPoint worldPoint) {
        return this.distanceTo2D(worldPoint) == 0;
    }

    public boolean isInMeleeDistance(WorldArea other) {
        if (other == null || this.getPlane() != other.getPlane()) {
            return false;
        }
        Point distances = this.getAxisDistances(other);
        return distances.getX() + distances.getY() == 1;
    }

    public boolean isInMeleeDistance(WorldPoint other) {
        return this.isInMeleeDistance(other.toWorldArea());
    }

    public boolean intersectsWith(WorldArea other) {
        if (this.getPlane() != other.getPlane()) {
            return false;
        }
        Point distances = this.getAxisDistances(other);
        return distances.getX() + distances.getY() == 0;
    }

    public boolean canTravelInDirection(Client client2, int dx2, int dy2) {
        return this.canTravelInDirection(client2, dx2, dy2, x -> true);
    }

    public boolean canTravelInDirection(Client client2, int dx2, int dy2, Predicate<? super WorldPoint> extraCondition) {
        CollisionData[] collisionData;
        dx2 = Integer.signum(dx2);
        dy2 = Integer.signum(dy2);
        if (dx2 == 0 && dy2 == 0) {
            return true;
        }
        LocalPoint lp2 = LocalPoint.fromWorld(client2, this.x, this.y);
        int startX = lp2.getSceneX() + dx2;
        int startY = lp2.getSceneY() + dy2;
        int checkX = startX + (dx2 > 0 ? this.width - 1 : 0);
        int checkY = startY + (dy2 > 0 ? this.height - 1 : 0);
        int endX = startX + this.width - 1;
        int endY = startY + this.height - 1;
        int xFlags = 2359552;
        int yFlags = 2359552;
        int xyFlags = 2359552;
        int xWallFlagsSouth = 2359552;
        int xWallFlagsNorth = 2359552;
        int yWallFlagsWest = 2359552;
        int yWallFlagsEast = 2359552;
        if (dx2 < 0) {
            xFlags |= 8;
            xWallFlagsSouth |= 0x30;
            xWallFlagsNorth |= 6;
        }
        if (dx2 > 0) {
            xFlags |= 0x80;
            xWallFlagsSouth |= 0x60;
            xWallFlagsNorth |= 3;
        }
        if (dy2 < 0) {
            yFlags |= 2;
            yWallFlagsWest |= 0x81;
            yWallFlagsEast |= 0xC;
        }
        if (dy2 > 0) {
            yFlags |= 0x20;
            yWallFlagsWest |= 0xC0;
            yWallFlagsEast |= 0x18;
        }
        if (dx2 < 0 && dy2 < 0) {
            xyFlags |= 4;
        }
        if (dx2 < 0 && dy2 > 0) {
            xyFlags |= 0x10;
        }
        if (dx2 > 0 && dy2 < 0) {
            xyFlags |= 1;
        }
        if (dx2 > 0 && dy2 > 0) {
            xyFlags |= 0x40;
        }
        if ((collisionData = client2.getCollisionMaps()) == null) {
            return false;
        }
        int[][] collisionDataFlags = collisionData[this.plane].getFlags();
        if (dx2 != 0) {
            int y;
            for (y = startY; y <= endY; ++y) {
                if ((collisionDataFlags[checkX][y] & xFlags) == 0 && extraCondition.test(WorldPoint.fromScene(client2, checkX, y, this.plane))) continue;
                return false;
            }
            for (y = startY + 1; y <= endY; ++y) {
                if ((collisionDataFlags[checkX][y] & xWallFlagsSouth) == 0) continue;
                return false;
            }
            for (y = endY - 1; y >= startY; --y) {
                if ((collisionDataFlags[checkX][y] & xWallFlagsNorth) == 0) continue;
                return false;
            }
        }
        if (dy2 != 0) {
            int x;
            for (x = startX; x <= endX; ++x) {
                if ((collisionDataFlags[x][checkY] & yFlags) == 0 && extraCondition.test(WorldPoint.fromScene(client2, x, checkY, client2.getPlane()))) continue;
                return false;
            }
            for (x = startX + 1; x <= endX; ++x) {
                if ((collisionDataFlags[x][checkY] & yWallFlagsWest) == 0) continue;
                return false;
            }
            for (x = endX - 1; x >= startX; --x) {
                if ((collisionDataFlags[x][checkY] & yWallFlagsEast) == 0) continue;
                return false;
            }
        }
        if (dx2 != 0 && dy2 != 0) {
            if ((collisionDataFlags[checkX][checkY] & xyFlags) != 0 || !extraCondition.test(WorldPoint.fromScene(client2, checkX, checkY, client2.getPlane()))) {
                return false;
            }
            if (this.width == 1 && (collisionDataFlags[checkX][checkY - dy2] & xFlags) != 0 && extraCondition.test(WorldPoint.fromScene(client2, checkX, startY, client2.getPlane()))) {
                return false;
            }
            if (this.height == 1 && (collisionDataFlags[checkX - dx2][checkY] & yFlags) != 0 && extraCondition.test(WorldPoint.fromScene(client2, startX, checkY, client2.getPlane()))) {
                return false;
            }
        }
        return true;
    }

    private Point getComparisonPoint(WorldArea other) {
        int x = other.x <= this.x ? this.x : (other.x >= this.x + this.width - 1 ? this.x + this.width - 1 : other.x);
        int y = other.y <= this.y ? this.y : (other.y >= this.y + this.height - 1 ? this.y + this.height - 1 : other.y);
        return new Point(x, y);
    }

    public boolean hasLineOfSightTo(Client client2, WorldArea other) {
        if (this.plane != other.getPlane()) {
            return false;
        }
        LocalPoint sourceLp = LocalPoint.fromWorld(client2, this.x, this.y);
        LocalPoint targetLp = LocalPoint.fromWorld(client2, other.getX(), other.getY());
        if (sourceLp == null || targetLp == null) {
            return false;
        }
        int thisX = sourceLp.getSceneX();
        int thisY = sourceLp.getSceneY();
        int otherX = targetLp.getSceneX();
        int otherY = targetLp.getSceneY();
        int cmpThisX = otherX <= thisX ? thisX : (otherX >= thisX + this.width - 1 ? thisX + this.width - 1 : otherX);
        int cmpThisY = otherY <= thisY ? thisY : (otherY >= thisY + this.height - 1 ? thisY + this.height - 1 : otherY);
        int cmpOtherX = thisX <= otherX ? otherX : (thisX >= otherX + other.getWidth() - 1 ? otherX + other.getWidth() - 1 : thisX);
        int cmpOtherY = thisY <= otherY ? otherY : (thisY >= otherY + other.getHeight() - 1 ? otherY + other.getHeight() - 1 : thisY);
        Tile[][][] tiles = client2.getScene().getTiles();
        Tile sourceTile = tiles[this.plane][cmpThisX][cmpThisY];
        Tile targetTile = tiles[other.getPlane()][cmpOtherX][cmpOtherY];
        if (sourceTile == null || targetTile == null) {
            return false;
        }
        return sourceTile.hasLineOfSightTo(targetTile);
    }

    public boolean hasLineOfSightTo(Client client2, WorldPoint other) {
        return this.hasLineOfSightTo(client2, other.toWorldArea());
    }

    public WorldPoint toWorldPoint() {
        return new WorldPoint(this.x, this.y, this.plane);
    }

    public List<WorldPoint> toWorldPointList() {
        ArrayList<WorldPoint> list = new ArrayList<WorldPoint>(this.width * this.height);
        for (int x = 0; x < this.width; ++x) {
            for (int y = 0; y < this.height; ++y) {
                list.add(new WorldPoint(this.getX() + x, this.getY() + y, this.getPlane()));
            }
        }
        return list;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPlane() {
        return this.plane;
    }
}

