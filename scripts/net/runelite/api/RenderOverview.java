/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.WorldMapData;
import net.runelite.api.worldmap.WorldMap;

@Deprecated
public interface RenderOverview
extends WorldMap {
    @Override
    public WorldMapData getWorldMapData();
}

