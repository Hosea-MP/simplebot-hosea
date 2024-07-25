/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface ItemLayer
extends TileObject {
    public int getHeight();

    public Renderable getBottom();

    public Renderable getMiddle();

    public Renderable getTop();

    @Override
    default public int getModelOrientation() {
        return 0;
    }

    @Override
    default public int getConfig() {
        return 0;
    }
}

