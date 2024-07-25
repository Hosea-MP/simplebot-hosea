/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.awt.Shape;
import net.runelite.api.Point;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface GameObject
extends TileObject {
    public int sizeX();

    public int sizeY();

    public Point getSceneMinLocation();

    public Point getSceneMaxLocation();

    public Shape getConvexHull();

    public int getOrientation();

    public Renderable getRenderable();

    @Override
    public int getModelOrientation();

    @Override
    public int getConfig();
}

