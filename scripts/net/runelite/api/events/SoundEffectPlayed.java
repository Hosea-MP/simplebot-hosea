/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import javax.annotation.Nullable;
import net.runelite.api.Actor;

public class SoundEffectPlayed {
    @Nullable
    private final Actor source;
    private int soundId;
    private int delay;
    private boolean consumed;

    public void consume() {
        this.consumed = true;
    }

    public SoundEffectPlayed(@Nullable Actor source) {
        this.source = source;
    }

    @Nullable
    public Actor getSource() {
        return this.source;
    }

    public int getSoundId() {
        return this.soundId;
    }

    public int getDelay() {
        return this.delay;
    }

    public boolean isConsumed() {
        return this.consumed;
    }

    public void setSoundId(int soundId) {
        this.soundId = soundId;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SoundEffectPlayed)) {
            return false;
        }
        SoundEffectPlayed other = (SoundEffectPlayed)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getSoundId() != other.getSoundId()) {
            return false;
        }
        if (this.getDelay() != other.getDelay()) {
            return false;
        }
        if (this.isConsumed() != other.isConsumed()) {
            return false;
        }
        Actor this$source = this.getSource();
        Actor other$source = other.getSource();
        return !(this$source == null ? other$source != null : !this$source.equals(other$source));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SoundEffectPlayed;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getSoundId();
        result = result * 59 + this.getDelay();
        result = result * 59 + (this.isConsumed() ? 79 : 97);
        Actor $source = this.getSource();
        result = result * 59 + ($source == null ? 43 : $source.hashCode());
        return result;
    }

    public String toString() {
        return "SoundEffectPlayed(source=" + this.getSource() + ", soundId=" + this.getSoundId() + ", delay=" + this.getDelay() + ", consumed=" + this.isConsumed() + ")";
    }
}
