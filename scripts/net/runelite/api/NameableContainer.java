/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Nameable;

public interface NameableContainer<T extends Nameable> {
    public int getCount();

    public int getSize();

    public T[] getMembers();

    public T findByName(String var1);
}

