/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetColorChanged {
    private final int color;

    public WidgetColorChanged(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetColorChanged)) {
            return false;
        }
        WidgetColorChanged other = (WidgetColorChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getColor() == other.getColor();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetColorChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getColor();
        return result;
    }

    public String toString() {
        return "WidgetColorChanged(color=" + this.getColor() + ")";
    }
}

