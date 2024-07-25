/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.GameObject;
import net.runelite.api.Tile;

public interface Scene {
    public Tile[][][] getTiles();

    public int getDrawDistance();

    public void setDrawDistance(int var1);

    public int getMinLevel();

    public void setMinLevel(int var1);

    public void removeGameObject(GameObject var1);

    public void generateHouses();

    public void setRoofRemovalMode(int var1);

    public short[][][] getUnderlayIds();

    public short[][][] getOverlayIds();

    public byte[][][] getTileShapes();

    public int[][][] getTileHeights();

    public int getBaseX();

    public int getBaseY();

    public boolean isInstance();

    public int[][][] getInstanceTemplateChunks();
}

