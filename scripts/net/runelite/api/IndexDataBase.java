/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public interface IndexDataBase {
    public boolean isOverlayOutdated();

    public int[] getFileIds(int var1);

    public byte[] loadData(int var1, int var2);
}

