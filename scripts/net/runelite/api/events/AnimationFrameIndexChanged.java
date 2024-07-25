/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class AnimationFrameIndexChanged {
    private Actor actor;

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AnimationFrameIndexChanged)) {
            return false;
        }
        AnimationFrameIndexChanged other = (AnimationFrameIndexChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AnimationFrameIndexChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "AnimationFrameIndexChanged(actor=" + this.getActor() + ")";
    }
}

