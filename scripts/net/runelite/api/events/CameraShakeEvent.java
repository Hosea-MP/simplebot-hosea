/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class CameraShakeEvent {
    private final int type;
    private final int shakeIntensity;
    private final int movementIntensity;
    private final int speed;

    public CameraShakeEvent(int type, int shakeIntensity, int movementIntensity, int speed) {
        this.type = type;
        this.shakeIntensity = shakeIntensity;
        this.movementIntensity = movementIntensity;
        this.speed = speed;
    }

    public int getType() {
        return this.type;
    }

    public int getShakeIntensity() {
        return this.shakeIntensity;
    }

    public int getMovementIntensity() {
        return this.movementIntensity;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CameraShakeEvent)) {
            return false;
        }
        CameraShakeEvent other = (CameraShakeEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getType() != other.getType()) {
            return false;
        }
        if (this.getShakeIntensity() != other.getShakeIntensity()) {
            return false;
        }
        if (this.getMovementIntensity() != other.getMovementIntensity()) {
            return false;
        }
        return this.getSpeed() == other.getSpeed();
    }

    protected boolean canEqual(Object other) {
        return other instanceof CameraShakeEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getType();
        result = result * 59 + this.getShakeIntensity();
        result = result * 59 + this.getMovementIntensity();
        result = result * 59 + this.getSpeed();
        return result;
    }

    public String toString() {
        return "CameraShakeEvent(type=" + this.getType() + ", shakeIntensity=" + this.getShakeIntensity() + ", movementIntensity=" + this.getMovementIntensity() + ", speed=" + this.getSpeed() + ")";
    }
}

