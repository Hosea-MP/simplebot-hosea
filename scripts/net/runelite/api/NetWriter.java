/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.PacketBuffer;
import net.runelite.api.ServerProt;

public interface NetWriter {
    public int getPacketLength();

    public ServerProt getServerPacket();

    public PacketBuffer getPacketBuffer();
}

