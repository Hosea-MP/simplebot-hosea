/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetModelRotate {
    private final int rotation;

    public WidgetModelRotate(int rotation) {
        this.rotation = rotation;
    }

    public int getRotation() {
        return this.rotation;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetModelRotate)) {
            return false;
        }
        WidgetModelRotate other = (WidgetModelRotate)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getRotation() == other.getRotation();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetModelRotate;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getRotation();
        return result;
    }

    public String toString() {
        return "WidgetModelRotate(rotation=" + this.getRotation() + ")";
    }
}

