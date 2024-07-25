/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.awt.Shape;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface WallObject
extends TileObject {
    public int getOrientationA();

    public int getOrientationB();

    @Override
    public int getConfig();

    public Shape getConvexHull();

    public Shape getConvexHull2();

    public Renderable getRenderable1();

    public Renderable getRenderable2();

    @Override
    default public int getModelOrientation() {
        return this.getOrientationA();
    }
}

