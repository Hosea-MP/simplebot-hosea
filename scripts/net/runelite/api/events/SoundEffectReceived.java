/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class SoundEffectReceived {
    private int id;
    private int repetitions;
    private int delay;

    public int getId() {
        return this.id;
    }

    public int getRepetitions() {
        return this.repetitions;
    }

    public int getDelay() {
        return this.delay;
    }

    public void setId(int id2) {
        this.id = id2;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SoundEffectReceived)) {
            return false;
        }
        SoundEffectReceived other = (SoundEffectReceived)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getRepetitions() != other.getRepetitions()) {
            return false;
        }
        return this.getDelay() == other.getDelay();
    }

    protected boolean canEqual(Object other) {
        return other instanceof SoundEffectReceived;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getRepetitions();
        result = result * 59 + this.getDelay();
        return result;
    }

    public String toString() {
        return "SoundEffectReceived(id=" + this.getId() + ", repetitions=" + this.getRepetitions() + ", delay=" + this.getDelay() + ")";
    }
}

