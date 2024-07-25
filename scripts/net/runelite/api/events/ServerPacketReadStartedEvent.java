/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class ServerPacketReadStartedEvent {
    private int packetId;
    private int constantPacketLength;

    public int getPacketId() {
        return this.packetId;
    }

    public int getConstantPacketLength() {
        return this.constantPacketLength;
    }

    public void setPacketId(int packetId) {
        this.packetId = packetId;
    }

    public void setConstantPacketLength(int constantPacketLength) {
        this.constantPacketLength = constantPacketLength;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ServerPacketReadStartedEvent)) {
            return false;
        }
        ServerPacketReadStartedEvent other = (ServerPacketReadStartedEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getPacketId() != other.getPacketId()) {
            return false;
        }
        return this.getConstantPacketLength() == other.getConstantPacketLength();
    }

    protected boolean canEqual(Object other) {
        return other instanceof ServerPacketReadStartedEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getPacketId();
        result = result * 59 + this.getConstantPacketLength();
        return result;
    }

    public String toString() {
        return "ServerPacketReadStartedEvent(packetId=" + this.getPacketId() + ", constantPacketLength=" + this.getConstantPacketLength() + ")";
    }

    public ServerPacketReadStartedEvent(int packetId, int constantPacketLength) {
        this.packetId = packetId;
        this.constantPacketLength = constantPacketLength;
    }
}

