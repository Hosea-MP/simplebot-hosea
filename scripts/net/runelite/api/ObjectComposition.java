/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Model;
import net.runelite.api.ParamHolder;

public interface ObjectComposition
extends ParamHolder {
    public int getId();

    public String getName();

    public String[] getActions();

    public int getMapSceneId();

    public void setMapSceneId(int var1);

    public int getMapIconId();

    public void setMapIconId(int var1);

    public int[] getImpostorIds();

    public ObjectComposition getImpostor();

    public int getVarbitId();

    public int getVarPlayerId();

    public int getSizeX();

    public int getSizeY();

    public Model getObjectModel(int var1, int var2, int[][] var3, int var4, int var5, int var6);
}

