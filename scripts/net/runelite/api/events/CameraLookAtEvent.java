/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class CameraLookAtEvent {
    private final int cameraLookAtX;
    private final int cameraLookAtY;
    private final int cameraLookAtHeight;
    private final int cameraLookAtSpeed;
    private final int cameraLookAtAcceleration;

    public CameraLookAtEvent(int cameraLookAtX, int cameraLookAtY, int cameraLookAtHeight, int cameraLookAtSpeed, int cameraLookAtAcceleration) {
        this.cameraLookAtX = cameraLookAtX;
        this.cameraLookAtY = cameraLookAtY;
        this.cameraLookAtHeight = cameraLookAtHeight;
        this.cameraLookAtSpeed = cameraLookAtSpeed;
        this.cameraLookAtAcceleration = cameraLookAtAcceleration;
    }

    public int getCameraLookAtX() {
        return this.cameraLookAtX;
    }

    public int getCameraLookAtY() {
        return this.cameraLookAtY;
    }

    public int getCameraLookAtHeight() {
        return this.cameraLookAtHeight;
    }

    public int getCameraLookAtSpeed() {
        return this.cameraLookAtSpeed;
    }

    public int getCameraLookAtAcceleration() {
        return this.cameraLookAtAcceleration;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CameraLookAtEvent)) {
            return false;
        }
        CameraLookAtEvent other = (CameraLookAtEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getCameraLookAtX() != other.getCameraLookAtX()) {
            return false;
        }
        if (this.getCameraLookAtY() != other.getCameraLookAtY()) {
            return false;
        }
        if (this.getCameraLookAtHeight() != other.getCameraLookAtHeight()) {
            return false;
        }
        if (this.getCameraLookAtSpeed() != other.getCameraLookAtSpeed()) {
            return false;
        }
        return this.getCameraLookAtAcceleration() == other.getCameraLookAtAcceleration();
    }

    protected boolean canEqual(Object other) {
        return other instanceof CameraLookAtEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getCameraLookAtX();
        result = result * 59 + this.getCameraLookAtY();
        result = result * 59 + this.getCameraLookAtHeight();
        result = result * 59 + this.getCameraLookAtSpeed();
        result = result * 59 + this.getCameraLookAtAcceleration();
        return result;
    }

    public String toString() {
        return "CameraLookAtEvent(cameraLookAtX=" + this.getCameraLookAtX() + ", cameraLookAtY=" + this.getCameraLookAtY() + ", cameraLookAtHeight=" + this.getCameraLookAtHeight() + ", cameraLookAtSpeed=" + this.getCameraLookAtSpeed() + ", cameraLookAtAcceleration=" + this.getCameraLookAtAcceleration() + ")";
    }
}

