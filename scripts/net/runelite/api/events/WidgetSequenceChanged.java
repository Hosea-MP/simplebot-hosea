/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetSequenceChanged {
    private final int animationId;

    public WidgetSequenceChanged(int animationId) {
        this.animationId = animationId;
    }

    public int getAnimationId() {
        return this.animationId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetSequenceChanged)) {
            return false;
        }
        WidgetSequenceChanged other = (WidgetSequenceChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getAnimationId() == other.getAnimationId();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetSequenceChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getAnimationId();
        return result;
    }

    public String toString() {
        return "WidgetSequenceChanged(animationId=" + this.getAnimationId() + ")";
    }
}

