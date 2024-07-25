/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class GraphicChanged {
    private Actor actor;
    private int slot;
    private int id;
    private int height;
    private int delay;

    public Actor getActor() {
        return this.actor;
    }

    public int getSlot() {
        return this.slot;
    }

    public int getId() {
        return this.id;
    }

    public int getHeight() {
        return this.height;
    }

    public int getDelay() {
        return this.delay;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setId(int id2) {
        this.id = id2;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GraphicChanged)) {
            return false;
        }
        GraphicChanged other = (GraphicChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getSlot() != other.getSlot()) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getHeight() != other.getHeight()) {
            return false;
        }
        if (this.getDelay() != other.getDelay()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    protected boolean canEqual(Object other) {
        return other instanceof GraphicChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getSlot();
        result = result * 59 + this.getId();
        result = result * 59 + this.getHeight();
        result = result * 59 + this.getDelay();
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "GraphicChanged(actor=" + this.getActor() + ", slot=" + this.getSlot() + ", id=" + this.getId() + ", height=" + this.getHeight() + ", delay=" + this.getDelay() + ")";
    }
}

