/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class GetDynamicObjectForAnimationEvent {
    public static final GetDynamicObjectForAnimationEvent INSTANCE = new GetDynamicObjectForAnimationEvent();

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetDynamicObjectForAnimationEvent)) {
            return false;
        }
        GetDynamicObjectForAnimationEvent other = (GetDynamicObjectForAnimationEvent)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof GetDynamicObjectForAnimationEvent;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "GetDynamicObjectForAnimationEvent()";
    }
}

