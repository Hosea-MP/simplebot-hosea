/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public final class FacedDirectionChanged {
    private final Actor source;
    private final int direction;
    private final boolean instant;

    public FacedDirectionChanged(Actor source, int direction, boolean instant) {
        this.source = source;
        this.direction = direction;
        this.instant = instant;
    }

    public Actor getSource() {
        return this.source;
    }

    public int getDirection() {
        return this.direction;
    }

    public boolean isInstant() {
        return this.instant;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FacedDirectionChanged)) {
            return false;
        }
        FacedDirectionChanged other = (FacedDirectionChanged)o;
        if (this.getDirection() != other.getDirection()) {
            return false;
        }
        if (this.isInstant() != other.isInstant()) {
            return false;
        }
        Actor this$source = this.getSource();
        Actor other$source = other.getSource();
        return !(this$source == null ? other$source != null : !this$source.equals(other$source));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getDirection();
        result = result * 59 + (this.isInstant() ? 79 : 97);
        Actor $source = this.getSource();
        result = result * 59 + ($source == null ? 43 : $source.hashCode());
        return result;
    }

    public String toString() {
        return "FacedDirectionChanged(source=" + this.getSource() + ", direction=" + this.getDirection() + ", instant=" + this.isInstant() + ")";
    }
}

