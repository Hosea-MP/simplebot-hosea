/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class HintArrowEvent {
    private final int playerIndex;
    private final int npcIndex;
    private final int hintArrowX;
    private final int hintArrowY;
    private final int hintArrowHeight;

    public HintArrowEvent(int playerIndex, int npcIndex, int hintArrowX, int hintArrowY, int hintArrowHeight) {
        this.playerIndex = playerIndex;
        this.npcIndex = npcIndex;
        this.hintArrowX = hintArrowX;
        this.hintArrowY = hintArrowY;
        this.hintArrowHeight = hintArrowHeight;
    }

    public int getPlayerIndex() {
        return this.playerIndex;
    }

    public int getNpcIndex() {
        return this.npcIndex;
    }

    public int getHintArrowX() {
        return this.hintArrowX;
    }

    public int getHintArrowY() {
        return this.hintArrowY;
    }

    public int getHintArrowHeight() {
        return this.hintArrowHeight;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HintArrowEvent)) {
            return false;
        }
        HintArrowEvent other = (HintArrowEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getPlayerIndex() != other.getPlayerIndex()) {
            return false;
        }
        if (this.getNpcIndex() != other.getNpcIndex()) {
            return false;
        }
        if (this.getHintArrowX() != other.getHintArrowX()) {
            return false;
        }
        if (this.getHintArrowY() != other.getHintArrowY()) {
            return false;
        }
        return this.getHintArrowHeight() == other.getHintArrowHeight();
    }

    protected boolean canEqual(Object other) {
        return other instanceof HintArrowEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getPlayerIndex();
        result = result * 59 + this.getNpcIndex();
        result = result * 59 + this.getHintArrowX();
        result = result * 59 + this.getHintArrowY();
        result = result * 59 + this.getHintArrowHeight();
        return result;
    }

    public String toString() {
        return "HintArrowEvent(playerIndex=" + this.getPlayerIndex() + ", npcIndex=" + this.getNpcIndex() + ", hintArrowX=" + this.getHintArrowX() + ", hintArrowY=" + this.getHintArrowY() + ", hintArrowHeight=" + this.getHintArrowHeight() + ")";
    }
}

