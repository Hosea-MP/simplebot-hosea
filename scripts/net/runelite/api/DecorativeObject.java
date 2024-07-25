/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.awt.Shape;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface DecorativeObject
extends TileObject {
    public Shape getConvexHull();

    public Shape getConvexHull2();

    public Renderable getRenderable();

    public Renderable getRenderable2();

    public int getXOffset();

    public int getYOffset();

    @Override
    public int getConfig();

    public int getOrientation();

    @Override
    public int getModelOrientation();
}

