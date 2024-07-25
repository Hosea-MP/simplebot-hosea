/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public final class ActorBaseAnimChanged {
    private final Actor actor;
    private final int baseAnimIndex;
    private final int value;

    public ActorBaseAnimChanged(Actor actor, int baseAnimIndex, int value) {
        this.actor = actor;
        this.baseAnimIndex = baseAnimIndex;
        this.value = value;
    }

    public Actor getActor() {
        return this.actor;
    }

    public int getBaseAnimIndex() {
        return this.baseAnimIndex;
    }

    public int getValue() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ActorBaseAnimChanged)) {
            return false;
        }
        ActorBaseAnimChanged other = (ActorBaseAnimChanged)o;
        if (this.getBaseAnimIndex() != other.getBaseAnimIndex()) {
            return false;
        }
        if (this.getValue() != other.getValue()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getBaseAnimIndex();
        result = result * 59 + this.getValue();
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "ActorBaseAnimChanged(actor=" + this.getActor() + ", baseAnimIndex=" + this.getBaseAnimIndex() + ", value=" + this.getValue() + ")";
    }
}

