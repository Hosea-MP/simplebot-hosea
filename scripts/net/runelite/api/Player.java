/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.awt.Polygon;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.HeadIcon;
import net.runelite.api.Model;
import net.runelite.api.MoveSpeed;
import net.runelite.api.PlayerComposition;
import net.runelite.api.SkullIcon;

public interface Player
extends Actor {
    public int getId();

    @Override
    public int getCombatLevel();

    public PlayerComposition getPlayerComposition();

    public Polygon[] getPolygons();

    public int getTeam();

    public boolean isFriendsChatMember();

    public boolean isFriend();

    public boolean isClanMember();

    public HeadIcon getOverheadIcon();

    @Nullable
    public SkullIcon getSkullIcon();

    public boolean isHidden();

    public int minX();

    public int maxX();

    public int minY();

    public int maxY();

    public int animationCycleStart();

    public int animationCycleEnd();

    public Model getAttachedModel();

    public void move(int var1, int var2, MoveSpeed var3);

    public void stopMovement(int var1, int var2);

    public int getPlane();

    public int getTotalLevel();
}

