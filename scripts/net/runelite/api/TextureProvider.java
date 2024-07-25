/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Texture;

public interface TextureProvider {
    public double getBrightness();

    public void setBrightness(double var1);

    public Texture[] getTextures();

    public int[] load(int var1);

    public int getDefaultColor(int var1);
}

