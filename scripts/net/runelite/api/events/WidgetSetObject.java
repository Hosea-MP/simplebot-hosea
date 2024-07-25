/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetSetObject {
    private final int itemId;
    private final int itemQuantityOrModelZoom;
    private final boolean newType;

    public WidgetSetObject(int itemId, int itemQuantityOrModelZoom, boolean newType) {
        this.itemId = itemId;
        this.itemQuantityOrModelZoom = itemQuantityOrModelZoom;
        this.newType = newType;
    }

    public int getItemId() {
        return this.itemId;
    }

    public int getItemQuantityOrModelZoom() {
        return this.itemQuantityOrModelZoom;
    }

    public boolean isNewType() {
        return this.newType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetSetObject)) {
            return false;
        }
        WidgetSetObject other = (WidgetSetObject)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getItemId() != other.getItemId()) {
            return false;
        }
        if (this.getItemQuantityOrModelZoom() != other.getItemQuantityOrModelZoom()) {
            return false;
        }
        return this.isNewType() == other.isNewType();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetSetObject;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getItemId();
        result = result * 59 + this.getItemQuantityOrModelZoom();
        result = result * 59 + (this.isNewType() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "WidgetSetObject(itemId=" + this.getItemId() + ", itemQuantityOrModelZoom=" + this.getItemQuantityOrModelZoom() + ", newType=" + this.isNewType() + ")";
    }
}

