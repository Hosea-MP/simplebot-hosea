/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class CombatLevelChangeEvent {
    private final Actor actor;
    private final int oldCombatLevel;
    private final int newCombatLevel;

    public CombatLevelChangeEvent(Actor actor, int oldCombatLevel, int newCombatLevel) {
        this.actor = actor;
        this.oldCombatLevel = oldCombatLevel;
        this.newCombatLevel = newCombatLevel;
    }

    public Actor getActor() {
        return this.actor;
    }

    public int getOldCombatLevel() {
        return this.oldCombatLevel;
    }

    public int getNewCombatLevel() {
        return this.newCombatLevel;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CombatLevelChangeEvent)) {
            return false;
        }
        CombatLevelChangeEvent other = (CombatLevelChangeEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getOldCombatLevel() != other.getOldCombatLevel()) {
            return false;
        }
        if (this.getNewCombatLevel() != other.getNewCombatLevel()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CombatLevelChangeEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getOldCombatLevel();
        result = result * 59 + this.getNewCombatLevel();
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "CombatLevelChangeEvent(actor=" + this.getActor() + ", oldCombatLevel=" + this.getOldCombatLevel() + ", newCombatLevel=" + this.getNewCombatLevel() + ")";
    }
}

