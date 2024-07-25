/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class MinimapStateChange {
    private final int state;

    public MinimapStateChange(int state) {
        this.state = state;
    }

    public int getState() {
        return this.state;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MinimapStateChange)) {
            return false;
        }
        MinimapStateChange other = (MinimapStateChange)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getState() == other.getState();
    }

    protected boolean canEqual(Object other) {
        return other instanceof MinimapStateChange;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getState();
        return result;
    }

    public String toString() {
        return "MinimapStateChange(state=" + this.getState() + ")";
    }
}

