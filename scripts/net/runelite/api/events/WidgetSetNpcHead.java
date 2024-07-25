/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetSetNpcHead {
    private final int npcId;

    public WidgetSetNpcHead(int npcId) {
        this.npcId = npcId;
    }

    public int getNpcId() {
        return this.npcId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetSetNpcHead)) {
            return false;
        }
        WidgetSetNpcHead other = (WidgetSetNpcHead)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getNpcId() == other.getNpcId();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetSetNpcHead;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getNpcId();
        return result;
    }

    public String toString() {
        return "WidgetSetNpcHead(npcId=" + this.getNpcId() + ")";
    }
}

