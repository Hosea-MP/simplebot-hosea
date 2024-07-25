/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public final class MouseIdleTimeoutReached {
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        return o instanceof MouseIdleTimeoutReached;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "MouseIdleTimeoutReached()";
    }
}

