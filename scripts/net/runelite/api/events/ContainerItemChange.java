/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class ContainerItemChange {
    private final int inventoryId;
    private final int slotId;
    private final int itemId;
    private final int quantity;

    public ContainerItemChange(int inventoryId, int slotId, int itemId, int quantity) {
        this.inventoryId = inventoryId;
        this.slotId = slotId;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getInventoryId() {
        return this.inventoryId;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public int getItemId() {
        return this.itemId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ContainerItemChange)) {
            return false;
        }
        ContainerItemChange other = (ContainerItemChange)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getInventoryId() != other.getInventoryId()) {
            return false;
        }
        if (this.getSlotId() != other.getSlotId()) {
            return false;
        }
        if (this.getItemId() != other.getItemId()) {
            return false;
        }
        return this.getQuantity() == other.getQuantity();
    }

    protected boolean canEqual(Object other) {
        return other instanceof ContainerItemChange;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getInventoryId();
        result = result * 59 + this.getSlotId();
        result = result * 59 + this.getItemId();
        result = result * 59 + this.getQuantity();
        return result;
    }

    public String toString() {
        return "ContainerItemChange(inventoryId=" + this.getInventoryId() + ", slotId=" + this.getSlotId() + ", itemId=" + this.getItemId() + ", quantity=" + this.getQuantity() + ")";
    }
}

