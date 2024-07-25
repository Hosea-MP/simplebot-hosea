/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.worldmap;

import net.runelite.api.worldmap.WorldMapRegion;

public interface WorldMapRenderer {
    public boolean isLoaded();

    public WorldMapRegion[][] getMapRegions();
}

