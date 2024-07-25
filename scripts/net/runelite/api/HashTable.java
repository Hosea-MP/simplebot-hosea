/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.util.Collection;
import net.runelite.api.Node;

public interface HashTable<T extends Node>
extends Iterable<T> {
    public T get(long var1);

    public Collection<T> getNodes();
}

