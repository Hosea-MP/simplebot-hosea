/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class HashTableNodeGetCall {
    private final long key;

    public HashTableNodeGetCall(long key) {
        this.key = key;
    }

    public long getKey() {
        return this.key;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HashTableNodeGetCall)) {
            return false;
        }
        HashTableNodeGetCall other = (HashTableNodeGetCall)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getKey() == other.getKey();
    }

    protected boolean canEqual(Object other) {
        return other instanceof HashTableNodeGetCall;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $key = this.getKey();
        result = result * 59 + (int)($key >>> 32 ^ $key);
        return result;
    }

    public String toString() {
        return "HashTableNodeGetCall(key=" + this.getKey() + ")";
    }
}

