/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Node;

public interface IterableHashTable<T extends Node>
extends Iterable<T> {
    public T get(long var1);

    public void put(T var1, long var2);
}

