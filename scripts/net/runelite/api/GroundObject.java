/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.awt.Shape;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface GroundObject
extends TileObject {
    public Renderable getRenderable();

    public Shape getConvexHull();

    @Override
    public int getConfig();
}

