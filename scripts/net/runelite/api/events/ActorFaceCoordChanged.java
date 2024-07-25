/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class ActorFaceCoordChanged {
    private final Actor actor;
    private final int faceCoordX;
    private final int faceCoordY;
    private final boolean instant;

    public ActorFaceCoordChanged(Actor actor, int faceCoordX, int faceCoordY, boolean instant) {
        this.actor = actor;
        this.faceCoordX = faceCoordX;
        this.faceCoordY = faceCoordY;
        this.instant = instant;
    }

    public Actor getActor() {
        return this.actor;
    }

    public int getFaceCoordX() {
        return this.faceCoordX;
    }

    public int getFaceCoordY() {
        return this.faceCoordY;
    }

    public boolean isInstant() {
        return this.instant;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ActorFaceCoordChanged)) {
            return false;
        }
        ActorFaceCoordChanged other = (ActorFaceCoordChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getFaceCoordX() != other.getFaceCoordX()) {
            return false;
        }
        if (this.getFaceCoordY() != other.getFaceCoordY()) {
            return false;
        }
        if (this.isInstant() != other.isInstant()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ActorFaceCoordChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getFaceCoordX();
        result = result * 59 + this.getFaceCoordY();
        result = result * 59 + (this.isInstant() ? 79 : 97);
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "ActorFaceCoordChanged(actor=" + this.getActor() + ", faceCoordX=" + this.getFaceCoordX() + ", faceCoordY=" + this.getFaceCoordY() + ", instant=" + this.isInstant() + ")";
    }
}

