/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Deque;
import net.runelite.api.Friend;
import net.runelite.api.NameableContainer;
import net.runelite.api.PendingLogin;

public interface FriendContainer
extends NameableContainer<Friend> {
    public Deque<PendingLogin> getPendingLogins();
}
