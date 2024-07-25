/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class NameChangeEvent {
    private final Actor actor;
    private final String oldName;
    private final String newName;

    public NameChangeEvent(Actor actor, String oldName, String newName) {
        this.actor = actor;
        this.oldName = oldName;
        this.newName = newName;
    }

    public Actor getActor() {
        return this.actor;
    }

    public String getOldName() {
        return this.oldName;
    }

    public String getNewName() {
        return this.newName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NameChangeEvent)) {
            return false;
        }
        NameChangeEvent other = (NameChangeEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        if (this$actor == null ? other$actor != null : !this$actor.equals(other$actor)) {
            return false;
        }
        String this$oldName = this.getOldName();
        String other$oldName = other.getOldName();
        if (this$oldName == null ? other$oldName != null : !this$oldName.equals(other$oldName)) {
            return false;
        }
        String this$newName = this.getNewName();
        String other$newName = other.getNewName();
        return !(this$newName == null ? other$newName != null : !this$newName.equals(other$newName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NameChangeEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        String $oldName = this.getOldName();
        result = result * 59 + ($oldName == null ? 43 : $oldName.hashCode());
        String $newName = this.getNewName();
        result = result * 59 + ($newName == null ? 43 : $newName.hashCode());
        return result;
    }

    public String toString() {
        return "NameChangeEvent(actor=" + this.getActor() + ", oldName=" + this.getOldName() + ", newName=" + this.getNewName() + ")";
    }
}

