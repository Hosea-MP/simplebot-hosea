/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import java.util.List;

public class MidiSongPlayed {
    private final List<Integer> songs;
    private final int fadeOutDelay;
    private final int fadeOutSpeed;
    private final int fadeInDelay;
    private final int fadeInSpeed;

    public MidiSongPlayed(List<Integer> songs, int fadeOutDelay, int fadeOutSpeed, int fadeInDelay, int fadeInSpeed) {
        this.songs = songs;
        this.fadeOutDelay = fadeOutDelay;
        this.fadeOutSpeed = fadeOutSpeed;
        this.fadeInDelay = fadeInDelay;
        this.fadeInSpeed = fadeInSpeed;
    }

    public List<Integer> getSongs() {
        return this.songs;
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
        if (!(o instanceof MidiSongPlayed)) {
            return false;
        }
        MidiSongPlayed other = (MidiSongPlayed)o;
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
        if (this.getFadeInSpeed() != other.getFadeInSpeed()) {
            return false;
        }
        List<Integer> this$songs = this.getSongs();
        List<Integer> other$songs = other.getSongs();
        return !(this$songs == null ? other$songs != null : !((Object)this$songs).equals(other$songs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MidiSongPlayed;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getFadeOutDelay();
        result = result * 59 + this.getFadeOutSpeed();
        result = result * 59 + this.getFadeInDelay();
        result = result * 59 + this.getFadeInSpeed();
        List<Integer> $songs = this.getSongs();
        result = result * 59 + ($songs == null ? 43 : ((Object)$songs).hashCode());
        return result;
    }

    public String toString() {
        return "MidiSongPlayed(songs=" + this.getSongs() + ", fadeOutDelay=" + this.getFadeOutDelay() + ", fadeOutSpeed=" + this.getFadeOutSpeed() + ", fadeInDelay=" + this.getFadeInDelay() + ", fadeInSpeed=" + this.getFadeInSpeed() + ")";
    }
}

