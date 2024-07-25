/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Animation;
import net.runelite.api.Renderable;

public interface DynamicObject
extends Renderable {
    public Animation getAnimation();

    public int getAnimFrame();

    public int getAnimCycle();
}

