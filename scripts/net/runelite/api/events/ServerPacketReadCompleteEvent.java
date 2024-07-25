/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.PacketBuffer;

public class ServerPacketReadCompleteEvent {
    private final PacketBuffer packetBuffer;
    private final int packetId;
    private final int constantPacketLength;
    private final int packetLength;

    public ServerPacketReadCompleteEvent(PacketBuffer packetBuffer, int packetId, int constantPacketLength, int packetLength) {
        this.packetBuffer = packetBuffer;
        this.packetId = packetId;
        this.constantPacketLength = constantPacketLength;
        this.packetLength = packetLength;
    }

    public PacketBuffer getPacketBuffer() {
        return this.packetBuffer;
    }

    public int getPacketId() {
        return this.packetId;
    }

    public int getConstantPacketLength() {
        return this.constantPacketLength;
    }

    public int getPacketLength() {
        return this.packetLength;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ServerPacketReadCompleteEvent)) {
            return false;
        }
        ServerPacketReadCompleteEvent other = (ServerPacketReadCompleteEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getPacketId() != other.getPacketId()) {
            return false;
        }
        if (this.getConstantPacketLength() != other.getConstantPacketLength()) {
            return false;
        }
        if (this.getPacketLength() != other.getPacketLength()) {
            return false;
        }
        PacketBuffer this$packetBuffer = this.getPacketBuffer();
        PacketBuffer other$packetBuffer = other.getPacketBuffer();
        return !(this$packetBuffer == null ? other$packetBuffer != null : !this$packetBuffer.equals(other$packetBuffer));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ServerPacketReadCompleteEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getPacketId();
        result = result * 59 + this.getConstantPacketLength();
        result = result * 59 + this.getPacketLength();
        PacketBuffer $packetBuffer = this.getPacketBuffer();
        result = result * 59 + ($packetBuffer == null ? 43 : $packetBuffer.hashCode());
        return result;
    }

    public String toString() {
        return "ServerPacketReadCompleteEvent(packetBuffer=" + this.getPacketBuffer() + ", packetId=" + this.getPacketId() + ", constantPacketLength=" + this.getConstantPacketLength() + ", packetLength=" + this.getPacketLength() + ")";
    }
}

