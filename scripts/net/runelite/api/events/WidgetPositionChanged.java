/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetPositionChanged {
    private final int x;
    private final int y;

    public WidgetPositionChanged(int x, int y) {
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
        if (!(o instanceof WidgetPositionChanged)) {
            return false;
        }
        WidgetPositionChanged other = (WidgetPositionChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getX() != other.getX()) {
            return false;
        }
        return this.getY() == other.getY();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetPositionChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        return result;
    }

    public String toString() {
        return "WidgetPositionChanged(x=" + this.getX() + ", y=" + this.getY() + ")";
    }
}

