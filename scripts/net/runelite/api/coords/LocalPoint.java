/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.coords;

import javax.annotation.Nullable;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

public final class LocalPoint {
    private final int x;
    private final int y;

    @Nullable
    public static LocalPoint fromWorld(Client client2, WorldPoint world) {
        if (client2.getPlane() != world.getPlane()) {
            return null;
        }
        return LocalPoint.fromWorld(client2, world.getX(), world.getY());
    }

    public static LocalPoint fromWorld(Client client2, int x, int y) {
        if (!WorldPoint.isInScene(client2, x, y)) {
            return null;
        }
        int baseX = client2.getBaseX();
        int baseY = client2.getBaseY();
        return LocalPoint.fromScene(x - baseX, y - baseY);
    }

    public int distanceTo(LocalPoint other) {
        return (int)Math.hypot(this.getX() - other.getX(), this.getY() - other.getY());
    }

    public boolean isInScene() {
        return this.x >= 0 && this.x < 13312 && this.y >= 0 && this.y < 13312;
    }

    public static LocalPoint fromScene(int x, int y) {
        return new LocalPoint((x << 7) + 64, (y << 7) + 64);
    }

    public int getSceneX() {
        return this.x >> 7;
    }

    public int getSceneY() {
        return this.y >> 7;
    }

    public LocalPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LocalPoint)) {
            return false;
        }
        LocalPoint other = (LocalPoint)o;
        if (this.getX() != other.getX()) {
            return false;
        }
        return this.getY() == other.getY();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        return result;
    }

    public String toString() {
        return "LocalPoint(x=" + this.getX() + ", y=" + this.getY() + ")";
    }
}

