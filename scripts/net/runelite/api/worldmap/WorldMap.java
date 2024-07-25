/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.worldmap;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.api.worldmap.WorldMapRenderer;

public interface WorldMap {
    public Point getWorldMapPosition();

    public float getWorldMapZoom();

    public void setWorldMapPositionTarget(WorldPoint var1);

    public WorldMapRenderer getWorldMapRenderer();

    public void initializeWorldMap(WorldMapData var1);

    public WorldMapData getWorldMapData();
}

