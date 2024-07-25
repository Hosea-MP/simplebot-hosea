/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public interface EnumComposition {
    public int size();

    public int[] getKeys();

    public int[] getIntVals();

    public String[] getStringVals();

    public int getIntValue(int var1);

    public String getStringValue(int var1);
}

