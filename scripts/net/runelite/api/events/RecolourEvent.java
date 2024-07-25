/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class RecolourEvent {
    private final Actor actor;
    private final int recolourStartCycle;
    private final int recolourEndCycle;
    private final int recolourHue;
    private final int recolourSaturation;
    private final int recolourLuminance;
    private final int recolourAmount;
    private final int currentCycle;

    public RecolourEvent(Actor actor, int recolourStartCycle, int recolourEndCycle, int recolourHue, int recolourSaturation, int recolourLuminance, int recolourAmount, int currentCycle) {
        this.actor = actor;
        this.recolourStartCycle = recolourStartCycle;
        this.recolourEndCycle = recolourEndCycle;
        this.recolourHue = recolourHue;
        this.recolourSaturation = recolourSaturation;
        this.recolourLuminance = recolourLuminance;
        this.recolourAmount = recolourAmount;
        this.currentCycle = currentCycle;
    }

    public Actor getActor() {
        return this.actor;
    }

    public int getRecolourStartCycle() {
        return this.recolourStartCycle;
    }

    public int getRecolourEndCycle() {
        return this.recolourEndCycle;
    }

    public int getRecolourHue() {
        return this.recolourHue;
    }

    public int getRecolourSaturation() {
        return this.recolourSaturation;
    }

    public int getRecolourLuminance() {
        return this.recolourLuminance;
    }

    public int getRecolourAmount() {
        return this.recolourAmount;
    }

    public int getCurrentCycle() {
        return this.currentCycle;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RecolourEvent)) {
            return false;
        }
        RecolourEvent other = (RecolourEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getRecolourStartCycle() != other.getRecolourStartCycle()) {
            return false;
        }
        if (this.getRecolourEndCycle() != other.getRecolourEndCycle()) {
            return false;
        }
        if (this.getRecolourHue() != other.getRecolourHue()) {
            return false;
        }
        if (this.getRecolourSaturation() != other.getRecolourSaturation()) {
            return false;
        }
        if (this.getRecolourLuminance() != other.getRecolourLuminance()) {
            return false;
        }
        if (this.getRecolourAmount() != other.getRecolourAmount()) {
            return false;
        }
        if (this.getCurrentCycle() != other.getCurrentCycle()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    protected boolean canEqual(Object other) {
        return other instanceof RecolourEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getRecolourStartCycle();
        result = result * 59 + this.getRecolourEndCycle();
        result = result * 59 + this.getRecolourHue();
        result = result * 59 + this.getRecolourSaturation();
        result = result * 59 + this.getRecolourLuminance();
        result = result * 59 + this.getRecolourAmount();
        result = result * 59 + this.getCurrentCycle();
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "RecolourEvent(actor=" + this.getActor() + ", recolourStartCycle=" + this.getRecolourStartCycle() + ", recolourEndCycle=" + this.getRecolourEndCycle() + ", recolourHue=" + this.getRecolourHue() + ", recolourSaturation=" + this.getRecolourSaturation() + ", recolourLuminance=" + this.getRecolourLuminance() + ", recolourAmount=" + this.getRecolourAmount() + ", currentCycle=" + this.getCurrentCycle() + ")";
    }
}

