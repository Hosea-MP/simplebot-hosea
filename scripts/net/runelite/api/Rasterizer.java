/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public interface Rasterizer {
    public int[] getPixels();

    public int getWidth();

    public int getHeight();

    public void fillRectangle(int var1, int var2, int var3, int var4, int var5);

    public void rasterFlat(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void setRasterGouraudLowRes(boolean var1);

    public void rasterGouraud(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);
}

