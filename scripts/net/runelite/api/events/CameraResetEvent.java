/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class CameraResetEvent {
    private final int id;

    public CameraResetEvent(int id2) {
        this.id = id2;
    }

    public int getId() {
        return this.id;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CameraResetEvent)) {
            return false;
        }
        CameraResetEvent other = (CameraResetEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getId() == other.getId();
    }

    protected boolean canEqual(Object other) {
        return other instanceof CameraResetEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        return result;
    }

    public String toString() {
        return "CameraResetEvent(id=" + this.getId() + ")";
    }
}

