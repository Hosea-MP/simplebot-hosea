/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class JinglePlayed {
    private final int jingleId;

    public JinglePlayed(int jingleId) {
        this.jingleId = jingleId;
    }

    public int getJingleId() {
        return this.jingleId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof JinglePlayed)) {
            return false;
        }
        JinglePlayed other = (JinglePlayed)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getJingleId() == other.getJingleId();
    }

    protected boolean canEqual(Object other) {
        return other instanceof JinglePlayed;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getJingleId();
        return result;
    }

    public String toString() {
        return "JinglePlayed(jingleId=" + this.getJingleId() + ")";
    }
}

