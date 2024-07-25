/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.HashTable;
import net.runelite.api.Node;

public class HashTableNodePut {
    private final HashTable<? extends Node> hashTable;
    private final Node node;
    private final long value;

    public HashTableNodePut(HashTable<? extends Node> hashTable, Node node, long value) {
        this.hashTable = hashTable;
        this.node = node;
        this.value = value;
    }

    public HashTable<? extends Node> getHashTable() {
        return this.hashTable;
    }

    public Node getNode() {
        return this.node;
    }

    public long getValue() {
        return this.value;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HashTableNodePut)) {
            return false;
        }
        HashTableNodePut other = (HashTableNodePut)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getValue() != other.getValue()) {
            return false;
        }
        HashTable<? extends Node> this$hashTable = this.getHashTable();
        HashTable<? extends Node> other$hashTable = other.getHashTable();
        if (this$hashTable == null ? other$hashTable != null : !this$hashTable.equals(other$hashTable)) {
            return false;
        }
        Node this$node = this.getNode();
        Node other$node = other.getNode();
        return !(this$node == null ? other$node != null : !this$node.equals(other$node));
    }

    protected boolean canEqual(Object other) {
        return other instanceof HashTableNodePut;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $value = this.getValue();
        result = result * 59 + (int)($value >>> 32 ^ $value);
        HashTable<? extends Node> $hashTable = this.getHashTable();
        result = result * 59 + ($hashTable == null ? 43 : $hashTable.hashCode());
        Node $node = this.getNode();
        result = result * 59 + ($node == null ? 43 : $node.hashCode());
        return result;
    }

    public String toString() {
        return "HashTableNodePut(hashTable=" + this.getHashTable() + ", node=" + this.getNode() + ", value=" + this.getValue() + ")";
    }
}

