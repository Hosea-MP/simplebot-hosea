/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class DynamicObjectAnimationChanged {
    private int object;
    private int animation;
    private int x;
    private int y;

    public int getObject() {
        return this.object;
    }

    public int getAnimation() {
        return this.animation;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setObject(int object) {
        this.object = object;
    }

    public void setAnimation(int animation) {
        this.animation = animation;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DynamicObjectAnimationChanged)) {
            return false;
        }
        DynamicObjectAnimationChanged other = (DynamicObjectAnimationChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getObject() != other.getObject()) {
            return false;
        }
        if (this.getAnimation() != other.getAnimation()) {
            return false;
        }
        if (this.getX() != other.getX()) {
            return false;
        }
        return this.getY() == other.getY();
    }

    protected boolean canEqual(Object other) {
        return other instanceof DynamicObjectAnimationChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getObject();
        result = result * 59 + this.getAnimation();
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        return result;
    }

    public String toString() {
        return "DynamicObjectAnimationChanged(object=" + this.getObject() + ", animation=" + this.getAnimation() + ", x=" + this.getX() + ", y=" + this.getY() + ")";
    }
}

