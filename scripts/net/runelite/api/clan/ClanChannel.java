/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.clan;

import java.util.List;
import javax.annotation.Nullable;
import net.runelite.api.clan.ClanChannelMember;

public interface ClanChannel {
    public String getName();

    public List<ClanChannelMember> getMembers();

    @Nullable
    public ClanChannelMember findMember(String var1);
}

