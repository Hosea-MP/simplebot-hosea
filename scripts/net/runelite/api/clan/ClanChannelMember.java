/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.clan;

import net.runelite.api.ChatPlayer;
import net.runelite.api.clan.ClanRank;

public interface ClanChannelMember
extends ChatPlayer {
    @Override
    public String getName();

    public ClanRank getRank();

    @Override
    public int getWorld();
}

