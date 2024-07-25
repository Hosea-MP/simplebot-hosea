/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class PendingSpawnUpdated {
    private final int plane;
    private final int x;
    private final int y;
    private final int type;
    private final int id;
    private final int shape;
    private final int orientation;
    private final int opflags;
    private final int delay;
    private final int hitpoints;

    public PendingSpawnUpdated(int plane, int x, int y, int type, int id2, int shape, int orientation, int opflags, int delay, int hitpoints) {
        this.plane = plane;
        this.x = x;
        this.y = y;
        this.type = type;
        this.id = id2;
        this.shape = shape;
        this.orientation = orientation;
        this.opflags = opflags;
        this.delay = delay;
        this.hitpoints = hitpoints;
    }

    public int getPlane() {
        return this.plane;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public int getShape() {
        return this.shape;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public int getOpflags() {
        return this.opflags;
    }

    public int getDelay() {
        return this.delay;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PendingSpawnUpdated)) {
            return false;
        }
        PendingSpawnUpdated other = (PendingSpawnUpdated)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getPlane() != other.getPlane()) {
            return false;
        }
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        if (this.getType() != other.getType()) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getShape() != other.getShape()) {
            return false;
        }
        if (this.getOrientation() != other.getOrientation()) {
            return false;
        }
        if (this.getOpflags() != other.getOpflags()) {
            return false;
        }
        if (this.getDelay() != other.getDelay()) {
            return false;
        }
        return this.getHitpoints() == other.getHitpoints();
    }

    protected boolean canEqual(Object other) {
        return other instanceof PendingSpawnUpdated;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getPlane();
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getType();
        result = result * 59 + this.getId();
        result = result * 59 + this.getShape();
        result = result * 59 + this.getOrientation();
        result = result * 59 + this.getOpflags();
        result = result * 59 + this.getDelay();
        result = result * 59 + this.getHitpoints();
        return result;
    }

    public String toString() {
        return "PendingSpawnUpdated(plane=" + this.getPlane() + ", x=" + this.getX() + ", y=" + this.getY() + ", type=" + this.getType() + ", id=" + this.getId() + ", shape=" + this.getShape() + ", orientation=" + this.getOrientation() + ", opflags=" + this.getOpflags() + ", delay=" + this.getDelay() + ", hitpoints=" + this.getHitpoints() + ")";
    }
}

