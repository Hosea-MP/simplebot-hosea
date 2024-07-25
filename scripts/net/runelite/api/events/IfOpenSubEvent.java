/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class IfOpenSubEvent {
    private final int targetComponent;
    private final int interfaceId;
    private final int walkType;

    public IfOpenSubEvent(int targetComponent, int interfaceId, int walkType) {
        this.targetComponent = targetComponent;
        this.interfaceId = interfaceId;
        this.walkType = walkType;
    }

    public int getTargetComponent() {
        return this.targetComponent;
    }

    public int getInterfaceId() {
        return this.interfaceId;
    }

    public int getWalkType() {
        return this.walkType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IfOpenSubEvent)) {
            return false;
        }
        IfOpenSubEvent other = (IfOpenSubEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getTargetComponent() != other.getTargetComponent()) {
            return false;
        }
        if (this.getInterfaceId() != other.getInterfaceId()) {
            return false;
        }
        return this.getWalkType() == other.getWalkType();
    }

    protected boolean canEqual(Object other) {
        return other instanceof IfOpenSubEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getTargetComponent();
        result = result * 59 + this.getInterfaceId();
        result = result * 59 + this.getWalkType();
        return result;
    }

    public String toString() {
        return "IfOpenSubEvent(targetComponent=" + this.getTargetComponent() + ", interfaceId=" + this.getInterfaceId() + ", walkType=" + this.getWalkType() + ")";
    }
}

