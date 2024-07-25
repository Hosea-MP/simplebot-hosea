/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public final class Item {
    private final int id;
    private final int quantity;

    public Item(int id2, int quantity) {
        this.id = id2;
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        Item other = (Item)o;
        if (this.getId() != other.getId()) {
            return false;
        }
        return this.getQuantity() == other.getQuantity();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getQuantity();
        return result;
    }

    public String toString() {
        return "Item(id=" + this.getId() + ", quantity=" + this.getQuantity() + ")";
    }
}

