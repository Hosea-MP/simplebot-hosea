/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class RebuildRegionEvent {
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RebuildRegionEvent)) {
            return false;
        }
        RebuildRegionEvent other = (RebuildRegionEvent)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof RebuildRegionEvent;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "RebuildRegionEvent()";
    }
}

