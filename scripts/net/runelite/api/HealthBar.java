/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.SpritePixels;

public interface HealthBar {
    public SpritePixels getHealthBarFrontSprite();

    public SpritePixels getHealthBarBackSprite();

    public int getHealthBarFrontSpriteId();

    public void setPadding(int var1);
}

