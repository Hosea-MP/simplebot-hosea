/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetModelChanged {
    private final int modelId;

    public WidgetModelChanged(int modelId) {
        this.modelId = modelId;
    }

    public int getModelId() {
        return this.modelId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetModelChanged)) {
            return false;
        }
        WidgetModelChanged other = (WidgetModelChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getModelId() == other.getModelId();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetModelChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getModelId();
        return result;
    }

    public String toString() {
        return "WidgetModelChanged(modelId=" + this.getModelId() + ")";
    }
}

