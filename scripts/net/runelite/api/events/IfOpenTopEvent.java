/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class IfOpenTopEvent {
    private final int rootInterface;

    public IfOpenTopEvent(int rootInterface) {
        this.rootInterface = rootInterface;
    }

    public int getRootInterface() {
        return this.rootInterface;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IfOpenTopEvent)) {
            return false;
        }
        IfOpenTopEvent other = (IfOpenTopEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getRootInterface() == other.getRootInterface();
    }

    protected boolean canEqual(Object other) {
        return other instanceof IfOpenTopEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getRootInterface();
        return result;
    }

    public String toString() {
        return "IfOpenTopEvent(rootInterface=" + this.getRootInterface() + ")";
    }
}

