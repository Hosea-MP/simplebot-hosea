/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetScrollHeightChanged {
    private final int scrollY;

    public WidgetScrollHeightChanged(int scrollY) {
        this.scrollY = scrollY;
    }

    public int getScrollY() {
        return this.scrollY;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetScrollHeightChanged)) {
            return false;
        }
        WidgetScrollHeightChanged other = (WidgetScrollHeightChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getScrollY() == other.getScrollY();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetScrollHeightChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getScrollY();
        return result;
    }

    public String toString() {
        return "WidgetScrollHeightChanged(scrollY=" + this.getScrollY() + ")";
    }
}

