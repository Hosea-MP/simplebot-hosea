/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public final class VarClientStrChanged {
    private final int index;

    public VarClientStrChanged(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof VarClientStrChanged)) {
            return false;
        }
        VarClientStrChanged other = (VarClientStrChanged)o;
        return this.getIndex() == other.getIndex();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIndex();
        return result;
    }

    public String toString() {
        return "VarClientStrChanged(index=" + this.getIndex() + ")";
    }
}

