/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetSetPlayerHead {
    private static final WidgetSetPlayerHead INSTANCE = new WidgetSetPlayerHead();

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetSetPlayerHead)) {
            return false;
        }
        WidgetSetPlayerHead other = (WidgetSetPlayerHead)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetSetPlayerHead;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "WidgetSetPlayerHead()";
    }
}

