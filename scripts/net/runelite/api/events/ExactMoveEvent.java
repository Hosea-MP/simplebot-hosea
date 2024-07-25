/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class ExactMoveEvent {
    private final Actor actor;
    private final int exactMoveDeltaX1;
    private final int exactMoveDeltaX2;
    private final int exactMoveDeltaY1;
    private final int exactMoveDeltaY2;
    private final int exactMoveArrive1Cycle;
    private final int exactMoveArrive2Cycle;
    private final int exactMoveDirection;
    private final int cycle;

    public ExactMoveEvent(Actor actor, int exactMoveDeltaX1, int exactMoveDeltaX2, int exactMoveDeltaY1, int exactMoveDeltaY2, int exactMoveArrive1Cycle, int exactMoveArrive2Cycle, int exactMoveDirection, int cycle) {
        this.actor = actor;
        this.exactMoveDeltaX1 = exactMoveDeltaX1;
        this.exactMoveDeltaX2 = exactMoveDeltaX2;
        this.exactMoveDeltaY1 = exactMoveDeltaY1;
        this.exactMoveDeltaY2 = exactMoveDeltaY2;
        this.exactMoveArrive1Cycle = exactMoveArrive1Cycle;
        this.exactMoveArrive2Cycle = exactMoveArrive2Cycle;
        this.exactMoveDirection = exactMoveDirection;
        this.cycle = cycle;
    }

    public Actor getActor() {
        return this.actor;
    }

    public int getExactMoveDeltaX1() {
        return this.exactMoveDeltaX1;
    }

    public int getExactMoveDeltaX2() {
        return this.exactMoveDeltaX2;
    }

    public int getExactMoveDeltaY1() {
        return this.exactMoveDeltaY1;
    }

    public int getExactMoveDeltaY2() {
        return this.exactMoveDeltaY2;
    }

    public int getExactMoveArrive1Cycle() {
        return this.exactMoveArrive1Cycle;
    }

    public int getExactMoveArrive2Cycle() {
        return this.exactMoveArrive2Cycle;
    }

    public int getExactMoveDirection() {
        return this.exactMoveDirection;
    }

    public int getCycle() {
        return this.cycle;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ExactMoveEvent)) {
            return false;
        }
        ExactMoveEvent other = (ExactMoveEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getExactMoveDeltaX1() != other.getExactMoveDeltaX1()) {
            return false;
        }
        if (this.getExactMoveDeltaX2() != other.getExactMoveDeltaX2()) {
            return false;
        }
        if (this.getExactMoveDeltaY1() != other.getExactMoveDeltaY1()) {
            return false;
        }
        if (this.getExactMoveDeltaY2() != other.getExactMoveDeltaY2()) {
            return false;
        }
        if (this.getExactMoveArrive1Cycle() != other.getExactMoveArrive1Cycle()) {
            return false;
        }
        if (this.getExactMoveArrive2Cycle() != other.getExactMoveArrive2Cycle()) {
            return false;
        }
        if (this.getExactMoveDirection() != other.getExactMoveDirection()) {
            return false;
        }
        if (this.getCycle() != other.getCycle()) {
            return false;
        }
        Actor this$actor = this.getActor();
        Actor other$actor = other.getActor();
        return !(this$actor == null ? other$actor != null : !this$actor.equals(other$actor));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ExactMoveEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getExactMoveDeltaX1();
        result = result * 59 + this.getExactMoveDeltaX2();
        result = result * 59 + this.getExactMoveDeltaY1();
        result = result * 59 + this.getExactMoveDeltaY2();
        result = result * 59 + this.getExactMoveArrive1Cycle();
        result = result * 59 + this.getExactMoveArrive2Cycle();
        result = result * 59 + this.getExactMoveDirection();
        result = result * 59 + this.getCycle();
        Actor $actor = this.getActor();
        result = result * 59 + ($actor == null ? 43 : $actor.hashCode());
        return result;
    }

    public String toString() {
        return "ExactMoveEvent(actor=" + this.getActor() + ", exactMoveDeltaX1=" + this.getExactMoveDeltaX1() + ", exactMoveDeltaX2=" + this.getExactMoveDeltaX2() + ", exactMoveDeltaY1=" + this.getExactMoveDeltaY1() + ", exactMoveDeltaY2=" + this.getExactMoveDeltaY2() + ", exactMoveArrive1Cycle=" + this.getExactMoveArrive1Cycle() + ", exactMoveArrive2Cycle=" + this.getExactMoveArrive2Cycle() + ", exactMoveDirection=" + this.getExactMoveDirection() + ", cycle=" + this.getCycle() + ")";
    }
}

