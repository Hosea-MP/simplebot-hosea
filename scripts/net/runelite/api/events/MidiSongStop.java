/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class MidiSongStop {
    private final int fadeOutDelay;
    private final int fadeOutSpeed;

    public MidiSongStop(int fadeOutDelay, int fadeOutSpeed) {
        this.fadeOutDelay = fadeOutDelay;
        this.fadeOutSpeed = fadeOutSpeed;
    }

    public int getFadeOutDelay() {
        return this.fadeOutDelay;
    }

    public int getFadeOutSpeed() {
        return this.fadeOutSpeed;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MidiSongStop)) {
            return false;
        }
        MidiSongStop other = (MidiSongStop)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getFadeOutDelay() != other.getFadeOutDelay()) {
            return false;
        }
        return this.getFadeOutSpeed() == other.getFadeOutSpeed();
    }

    protected boolean canEqual(Object other) {
        return other instanceof MidiSongStop;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getFadeOutDelay();
        result = result * 59 + this.getFadeOutSpeed();
        return result;
    }

    public String toString() {
        return "MidiSongStop(fadeOutDelay=" + this.getFadeOutDelay() + ", fadeOutSpeed=" + this.getFadeOutSpeed() + ")";
    }
}

