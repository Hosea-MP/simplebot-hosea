/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.runelite.api.Item;
import net.runelite.api.Node;

public interface ItemContainer
extends Node {
    public int getId();

    @Nonnull
    public Item[] getItems();

    @Nullable
    public Item getItem(int var1);

    public boolean contains(int var1);

    public int count(int var1);

    public int size();

    public int count();
}

