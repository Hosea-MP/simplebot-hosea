/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.api.NameableContainer;

public interface FriendsChatManager
extends NameableContainer<FriendsChatMember> {
    public String getOwner();

    public String getName();

    public FriendsChatRank getMyRank();

    public FriendsChatRank getKickRank();
}

