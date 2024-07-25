/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcTypeCustomisation;

public interface NPC
extends Actor {
    public int getId();

    @Override
    public String getName();

    @Override
    public int getCombatLevel();

    public int getIndex();

    public NPCComposition getComposition();

    @Nullable
    public NPCComposition getTransformedComposition();

    public String getNameOverride();

    public NpcTypeCustomisation getHeadCustomisation();

    public NpcTypeCustomisation getBodyCustomisation();
}

