/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public interface SceneTilePaint {
    public int getRBG();

    public int getSwColor();

    public int getSeColor();

    public int getNwColor();

    public int getNeColor();

    public int getTexture();

    public int getBufferOffset();

    public void setBufferOffset(int var1);

    public int getUvBufferOffset();

    public void setUvBufferOffset(int var1);

    public int getBufferLen();

    public void setBufferLen(int var1);
}

