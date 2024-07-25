/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public final class HeadBarCreated {
    private final Actor source;
    private final int id;
    private final int currentGameCycle;
    private final int timespan;
    private final int delay;
    private final int start;
    private final int end;

    public HeadBarCreated(Actor source, int id2, int currentGameCycle, int timespan, int delay, int start, int end) {
        this.source = source;
        this.id = id2;
        this.currentGameCycle = currentGameCycle;
        this.timespan = timespan;
        this.delay = delay;
        this.start = start;
        this.end = end;
    }

    public Actor getSource() {
        return this.source;
    }

    public int getId() {
        return this.id;
    }

    public int getCurrentGameCycle() {
        return this.currentGameCycle;
    }

    public int getTimespan() {
        return this.timespan;
    }

    public int getDelay() {
        return this.delay;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HeadBarCreated)) {
            return false;
        }
        HeadBarCreated other = (HeadBarCreated)o;
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getCurrentGameCycle() != other.getCurrentGameCycle()) {
            return false;
        }
        if (this.getTimespan() != other.getTimespan()) {
            return false;
        }
        if (this.getDelay() != other.getDelay()) {
            return false;
        }
        if (this.getStart() != other.getStart()) {
            return false;
        }
        if (this.getEnd() != other.getEnd()) {
            return false;
        }
        Actor this$source = this.getSource();
        Actor other$source = other.getSource();
        return !(this$source == null ? other$source != null : !this$source.equals(other$source));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getCurrentGameCycle();
        result = result * 59 + this.getTimespan();
        result = result * 59 + this.getDelay();
        result = result * 59 + this.getStart();
        result = result * 59 + this.getEnd();
        Actor $source = this.getSource();
        result = result * 59 + ($source == null ? 43 : $source.hashCode());
        return result;
    }

    public String toString() {
        return "HeadBarCreated(source=" + this.getSource() + ", id=" + this.getId() + ", currentGameCycle=" + this.getCurrentGameCycle() + ", timespan=" + this.getTimespan() + ", delay=" + this.getDelay() + ", start=" + this.getStart() + ", end=" + this.getEnd() + ")";
    }
}

