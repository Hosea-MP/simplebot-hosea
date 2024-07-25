/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetVisibilityChange {
    private final boolean hidden;

    public WidgetVisibilityChange(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetVisibilityChange)) {
            return false;
        }
        WidgetVisibilityChange other = (WidgetVisibilityChange)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.isHidden() == other.isHidden();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetVisibilityChange;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isHidden() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "WidgetVisibilityChange(hidden=" + this.isHidden() + ")";
    }
}

