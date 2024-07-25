/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class MidiSongSwap {
    private final int fadeOutDelay;
    private final int fadeOutSpeed;
    private final int fadeInDelay;
    private final int fadeInSpeed;

    public MidiSongSwap(int fadeOutDelay, int fadeOutSpeed, int fadeInDelay, int fadeInSpeed) {
        this.fadeOutDelay = fadeOutDelay;
        this.fadeOutSpeed = fadeOutSpeed;
        this.fadeInDelay = fadeInDelay;
        this.fadeInSpeed = fadeInSpeed;
    }

    public int getFadeOutDelay() {
        return this.fadeOutDelay;
    }

    public int getFadeOutSpeed() {
        return this.fadeOutSpeed;
    }

    public int getFadeInDelay() {
        return this.fadeInDelay;
    }

    public int getFadeInSpeed() {
        return this.fadeInSpeed;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MidiSongSwap)) {
            return false;
        }
        MidiSongSwap other = (MidiSongSwap)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getFadeOutDelay() != other.getFadeOutDelay()) {
            return false;
        }
        if (this.getFadeOutSpeed() != other.getFadeOutSpeed()) {
            return false;
        }
        if (this.getFadeInDelay() != other.getFadeInDelay()) {
            return false;
        }
        return this.getFadeInSpeed() == other.getFadeInSpeed();
    }

    protected boolean canEqual(Object other) {
        return other instanceof MidiSongSwap;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getFadeOutDelay();
        result = result * 59 + this.getFadeOutSpeed();
        result = result * 59 + this.getFadeInDelay();
        result = result * 59 + this.getFadeInSpeed();
        return result;
    }

    public String toString() {
        return "MidiSongSwap(fadeOutDelay=" + this.getFadeOutDelay() + ", fadeOutSpeed=" + this.getFadeOutSpeed() + ", fadeInDelay=" + this.getFadeInDelay() + ", fadeInSpeed=" + this.getFadeInSpeed() + ")";
    }
}

