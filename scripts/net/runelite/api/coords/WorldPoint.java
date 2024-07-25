/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.coords;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import net.runelite.api.Client;
import net.runelite.api.Scene;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;

public final class WorldPoint {
    private static final int[] REGION_MIRRORS = new int[]{12894, 8755, 12895, 8756, 13150, 9011, 13151, 9012};
    private final int x;
    private final int y;
    private final int plane;

    public WorldPoint dx(int dx2) {
        return new WorldPoint(this.x + dx2, this.y, this.plane);
    }

    public WorldPoint dy(int dy2) {
        return new WorldPoint(this.x, this.y + dy2, this.plane);
    }

    public WorldPoint dz(int dz2) {
        return new WorldPoint(this.x, this.y, this.plane + dz2);
    }

    public static boolean isInScene(Scene scene, int x, int y) {
        int baseX = scene.getBaseX();
        int baseY = scene.getBaseY();
        int maxX = baseX + 104;
        int maxY = baseY + 104;
        return x >= baseX && x < maxX && y >= baseY && y < maxY;
    }

    public static boolean isInScene(Client client2, int x, int y) {
        int baseX = client2.getBaseX();
        int baseY = client2.getBaseY();
        int maxX = baseX + 104;
        int maxY = baseY + 104;
        return x >= baseX && x < maxX && y >= baseY && y < maxY;
    }

    public boolean isInScene(Client client2) {
        return client2.getPlane() == this.plane && WorldPoint.isInScene(client2, this.x, this.y);
    }

    public static WorldPoint fromLocal(Client client2, LocalPoint local) {
        return WorldPoint.fromLocal(client2, local.getX(), local.getY(), client2.getPlane());
    }

    public static WorldPoint fromLocal(Scene scene, int x, int y, int plane) {
        return new WorldPoint((x >>> 7) + scene.getBaseX(), (y >>> 7) + scene.getBaseY(), plane);
    }

    public static WorldPoint fromLocal(Client client2, int x, int y, int plane) {
        return new WorldPoint((x >>> 7) + client2.getBaseX(), (y >>> 7) + client2.getBaseY(), plane);
    }

    public static WorldPoint fromLocalInstance(Client client2, LocalPoint localPoint) {
        return WorldPoint.fromLocalInstance(client2.getScene(), localPoint, client2.getPlane());
    }

    public static WorldPoint fromLocalInstance(Client client2, LocalPoint localPoint, int plane) {
        if (client2.isInInstancedRegion()) {
            return WorldPoint.fromLocalInstance(client2.getInstanceTemplateChunks(), localPoint, plane);
        }
        return WorldPoint.fromLocal(client2, localPoint.getX(), localPoint.getY(), plane);
    }

    public static WorldPoint fromLocalInstance(Scene scene, LocalPoint localPoint, int plane) {
        if (scene.isInstance()) {
            return WorldPoint.fromLocalInstance(scene.getInstanceTemplateChunks(), localPoint, plane);
        }
        return WorldPoint.fromLocal(scene, localPoint.getX(), localPoint.getY(), plane);
    }

    private static WorldPoint fromLocalInstance(int[][][] instanceTemplateChunks, LocalPoint localPoint, int plane) {
        int sceneX = localPoint.getSceneX();
        int sceneY = localPoint.getSceneY();
        int chunkX = sceneX / 8;
        int chunkY = sceneY / 8;
        int templateChunk = instanceTemplateChunks[plane][chunkX][chunkY];
        int rotation = templateChunk >> 1 & 3;
        int templateChunkY = (templateChunk >> 3 & 0x7FF) * 8;
        int templateChunkX = (templateChunk >> 14 & 0x3FF) * 8;
        int templateChunkPlane = templateChunk >> 24 & 3;
        int x = templateChunkX + (sceneX & 7);
        int y = templateChunkY + (sceneY & 7);
        return WorldPoint.rotate(new WorldPoint(x, y, templateChunkPlane), 4 - rotation);
    }

    public static Collection<WorldPoint> toLocalInstance(Client client2, WorldPoint worldPoint) {
        if (client2.isInInstancedRegion()) {
            return WorldPoint.toLocalInstance(client2.getInstanceTemplateChunks(), client2.getBaseX(), client2.getBaseY(), worldPoint);
        }
        return Collections.singleton(worldPoint);
    }

    public static Collection<WorldPoint> toLocalInstance(Scene scene, WorldPoint worldPoint) {
        if (scene.isInstance()) {
            return WorldPoint.toLocalInstance(scene.getInstanceTemplateChunks(), scene.getBaseX(), scene.getBaseY(), worldPoint);
        }
        return Collections.singleton(worldPoint);
    }

    private static Collection<WorldPoint> toLocalInstance(int[][][] instanceTemplateChunks, int baseX, int baseY, WorldPoint worldPoint) {
        ArrayList<WorldPoint> worldPoints = new ArrayList<WorldPoint>();
        for (int z = 0; z < instanceTemplateChunks.length; ++z) {
            for (int x = 0; x < instanceTemplateChunks[z].length; ++x) {
                for (int y = 0; y < instanceTemplateChunks[z][x].length; ++y) {
                    int chunkData = instanceTemplateChunks[z][x][y];
                    int rotation = chunkData >> 1 & 3;
                    int templateChunkY = (chunkData >> 3 & 0x7FF) * 8;
                    int templateChunkX = (chunkData >> 14 & 0x3FF) * 8;
                    int plane = chunkData >> 24 & 3;
                    if (worldPoint.getX() < templateChunkX || worldPoint.getX() >= templateChunkX + 8 || worldPoint.getY() < templateChunkY || worldPoint.getY() >= templateChunkY + 8 || plane != worldPoint.getPlane()) continue;
                    WorldPoint p = new WorldPoint(baseX + x * 8 + (worldPoint.getX() & 7), baseY + y * 8 + (worldPoint.getY() & 7), z);
                    p = WorldPoint.rotate(p, rotation);
                    worldPoints.add(p);
                }
            }
        }
        return worldPoints;
    }

    private static WorldPoint rotate(WorldPoint point, int rotation) {
        int chunkX = point.getX() & 0xFFFFFFF8;
        int chunkY = point.getY() & 0xFFFFFFF8;
        int x = point.getX() & 7;
        int y = point.getY() & 7;
        switch (rotation) {
            case 1: {
                return new WorldPoint(chunkX + y, chunkY + (7 - x), point.getPlane());
            }
            case 2: {
                return new WorldPoint(chunkX + (7 - x), chunkY + (7 - y), point.getPlane());
            }
            case 3: {
                return new WorldPoint(chunkX + (7 - y), chunkY + x, point.getPlane());
            }
        }
        return point;
    }

    public int distanceTo(WorldArea other) {
        return this.toWorldArea().distanceTo(other);
    }

    public int distanceTo(WorldPoint other) {
        if (other.plane != this.plane) {
            return Integer.MAX_VALUE;
        }
        return this.distanceTo2D(other);
    }

    public int distanceTo2D(WorldPoint other) {
        return Math.max(Math.abs(this.getX() - other.getX()), Math.abs(this.getY() - other.getY()));
    }

    public static WorldPoint fromScene(Client client2, int x, int y, int plane) {
        return WorldPoint.fromScene(client2.getScene(), x, y, plane);
    }

    public static WorldPoint fromScene(Scene scene, int x, int y, int plane) {
        return new WorldPoint(x + scene.getBaseX(), y + scene.getBaseY(), plane);
    }

    public int getRegionID() {
        return this.x >> 6 << 8 | this.y >> 6;
    }

    public static WorldPoint fromRegion(int regionId, int regionX, int regionY, int plane) {
        return new WorldPoint((regionId >>> 8 << 6) + regionX, ((regionId & 0xFF) << 6) + regionY, plane);
    }

    public int getRegionX() {
        return WorldPoint.getRegionOffset(this.x);
    }

    public int getRegionY() {
        return WorldPoint.getRegionOffset(this.y);
    }

    private static int getRegionOffset(int position) {
        return position & 0x3F;
    }

    public static WorldPoint getMirrorPoint(WorldPoint worldPoint, boolean toOverworld) {
        int region = worldPoint.getRegionID();
        for (int i = 0; i < REGION_MIRRORS.length; i += 2) {
            int real = REGION_MIRRORS[i];
            int overworld = REGION_MIRRORS[i + 1];
            if (region != (toOverworld ? real : overworld)) continue;
            return WorldPoint.fromRegion(toOverworld ? overworld : real, worldPoint.getRegionX(), worldPoint.getRegionY(), worldPoint.getPlane());
        }
        return worldPoint;
    }

    public boolean isInArea(WorldArea ... worldAreas) {
        for (WorldArea area : worldAreas) {
            if (!area.contains(this)) continue;
            return true;
        }
        return false;
    }

    public boolean isInArea2D(WorldArea ... worldAreas) {
        for (WorldArea area : worldAreas) {
            if (!area.contains2D(this)) continue;
            return true;
        }
        return false;
    }

    public WorldArea toWorldArea() {
        return new WorldArea(this, 1, 1);
    }

    public WorldPoint(int x, int y, int plane) {
        this.x = x;
        this.y = y;
        this.plane = plane;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getPlane() {
        return this.plane;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WorldPoint)) {
            return false;
        }
        WorldPoint other = (WorldPoint)o;
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        return this.getPlane() == other.getPlane();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getPlane();
        return result;
    }

    public String toString() {
        return "WorldPoint(x=" + this.getX() + ", y=" + this.getY() + ", plane=" + this.getPlane() + ")";
    }
}

