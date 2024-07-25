/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import javax.annotation.Nullable;
import net.runelite.api.ActorSpotAnim;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Point;
import net.runelite.api.Renderable;
import net.runelite.api.SpritePixels;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public interface Actor
extends Renderable {
    public int getCombatLevel();

    @Nullable
    public String getName();

    public boolean isInteracting();

    public Actor getInteracting();

    public int getHealthRatio();

    public int getHealthScale();

    public WorldPoint getWorldLocation();

    public LocalPoint getLocalLocation();

    public int getOrientation();

    public int getCurrentOrientation();

    public int getAnimation();

    public int getPoseAnimation();

    public void setPoseAnimation(int var1);

    public int getPoseAnimationFrame();

    public void setPoseAnimationFrame(int var1);

    public int getIdlePoseAnimation();

    public void setIdlePoseAnimation(int var1);

    public int getIdleRotateLeft();

    public void setIdleRotateLeft(int var1);

    public int getIdleRotateRight();

    public void setIdleRotateRight(int var1);

    public int getWalkAnimation();

    public void setWalkAnimation(int var1);

    public int getWalkRotateLeft();

    public void setWalkRotateLeft(int var1);

    public int getWalkRotateRight();

    public void setWalkRotateRight(int var1);

    public int getWalkRotate180();

    public void setWalkRotate180(int var1);

    public int getRunAnimation();

    public void setRunAnimation(int var1);

    public void setAnimation(int var1);

    public int getAnimationFrame();

    @Deprecated
    public void setActionFrame(int var1);

    public void setAnimationFrame(int var1);

    public IterableHashTable<ActorSpotAnim> getSpotAnims();

    public boolean hasSpotAnim(int var1);

    public void createSpotAnim(int var1, int var2, int var3, int var4);

    public void removeSpotAnim(int var1);

    public void clearSpotAnims();

    @Deprecated
    public int getGraphic();

    @Deprecated
    public void setGraphic(int var1);

    @Deprecated
    public int getGraphicHeight();

    @Deprecated
    public void setGraphicHeight(int var1);

    @Deprecated
    public int getSpotAnimFrame();

    @Deprecated
    public void setSpotAnimFrame(int var1);

    public Polygon getCanvasTilePoly();

    @Nullable
    public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3);

    public Point getCanvasImageLocation(BufferedImage var1, int var2);

    public Point getCanvasSpriteLocation(SpritePixels var1, int var2);

    public Point getMinimapLocation();

    public int getLogicalHeight();

    public Shape getConvexHull();

    public WorldArea getWorldArea();

    public String getOverheadText();

    public void setOverheadText(String var1);

    public int getOverheadCycle();

    public void setOverheadCycle(int var1);

    public boolean isDead();

    public void setDead(boolean var1);

    public int getCombatLevelOverride();

    public boolean instantTurn();

    public int getFacedDirection();

    public int getAnimationDelay();

    public int getAnimationFrameIndex();

    public int exactMoveDeltaX1();

    public int exactMoveDeltaX2();

    public int exactMoveDeltaY1();

    public int exactMoveDeltaY2();

    public int exactMoveArrive1Cycle();

    public int exactMoveArrive2Cycle();

    public int exactMoveDirection();

    public int recolourStartCycle();

    public int recolourEndCycle();

    public byte recolourHue();

    public byte recolourSaturation();

    public byte recolourLuminance();

    public byte recolourAmount();

    public boolean showPublicPlayerChat();

    public int runAnimBack();

    public int runAnimLeft();

    public int runAnimRight();

    public int crawlAnim();

    public int crawlAnimBack();

    public int crawlAnimLeft();

    public int crawlAnimRight();

    public int getFaceCoordX();

    public int getFaceCoordY();
}

