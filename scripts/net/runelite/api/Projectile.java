/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.Animation;
import net.runelite.api.Renderable;
import net.runelite.api.coords.LocalPoint;

public interface Projectile
extends Renderable {
    public int getId();

    public Actor getInteracting();

    public LocalPoint getTarget();

    public int getX1();

    public int getY1();

    public int getFloor();

    public int getHeight();

    public int getEndHeight();

    public int getStartCycle();

    public int getEndCycle();

    public void setEndCycle(int var1);

    public int getRemainingCycles();

    public int getSlope();

    public int getStartHeight();

    public double getX();

    public double getY();

    public double getZ();

    public double getScalar();

    public double getVelocityX();

    public double getVelocityY();

    public double getVelocityZ();

    @Nullable
    public Animation getAnimation();

    public int getAnimationFrame();

    public int rs$getInteracting();
}
