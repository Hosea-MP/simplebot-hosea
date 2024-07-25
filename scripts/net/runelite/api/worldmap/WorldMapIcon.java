/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.worldmap;

import net.runelite.api.coords.WorldPoint;

public interface WorldMapIcon {
    public int getType();

    public WorldPoint getCoordinate();
}

