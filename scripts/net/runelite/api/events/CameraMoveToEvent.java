/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class CameraMoveToEvent {
    private final int cameraMoveToX;
    private final int cameraMoveToY;
    private final int cameraMoveToHeight;
    private final int cameraMoveToSpeed;
    private final int cameraMoveToAcceleration;

    public CameraMoveToEvent(int cameraMoveToX, int cameraMoveToY, int cameraMoveToHeight, int cameraMoveToSpeed, int cameraMoveToAcceleration) {
        this.cameraMoveToX = cameraMoveToX;
        this.cameraMoveToY = cameraMoveToY;
        this.cameraMoveToHeight = cameraMoveToHeight;
        this.cameraMoveToSpeed = cameraMoveToSpeed;
        this.cameraMoveToAcceleration = cameraMoveToAcceleration;
    }

    public int getCameraMoveToX() {
        return this.cameraMoveToX;
    }

    public int getCameraMoveToY() {
        return this.cameraMoveToY;
    }

    public int getCameraMoveToHeight() {
        return this.cameraMoveToHeight;
    }

    public int getCameraMoveToSpeed() {
        return this.cameraMoveToSpeed;
    }

    public int getCameraMoveToAcceleration() {
        return this.cameraMoveToAcceleration;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CameraMoveToEvent)) {
            return false;
        }
        CameraMoveToEvent other = (CameraMoveToEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getCameraMoveToX() != other.getCameraMoveToX()) {
            return false;
        }
        if (this.getCameraMoveToY() != other.getCameraMoveToY()) {
            return false;
        }
        if (this.getCameraMoveToHeight() != other.getCameraMoveToHeight()) {
            return false;
        }
        if (this.getCameraMoveToSpeed() != other.getCameraMoveToSpeed()) {
            return false;
        }
        return this.getCameraMoveToAcceleration() == other.getCameraMoveToAcceleration();
    }

    protected boolean canEqual(Object other) {
        return other instanceof CameraMoveToEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getCameraMoveToX();
        result = result * 59 + this.getCameraMoveToY();
        result = result * 59 + this.getCameraMoveToHeight();
        result = result * 59 + this.getCameraMoveToSpeed();
        result = result * 59 + this.getCameraMoveToAcceleration();
        return result;
    }

    public String toString() {
        return "CameraMoveToEvent(cameraMoveToX=" + this.getCameraMoveToX() + ", cameraMoveToY=" + this.getCameraMoveToY() + ", cameraMoveToHeight=" + this.getCameraMoveToHeight() + ", cameraMoveToSpeed=" + this.getCameraMoveToSpeed() + ", cameraMoveToAcceleration=" + this.getCameraMoveToAcceleration() + ")";
    }
}

