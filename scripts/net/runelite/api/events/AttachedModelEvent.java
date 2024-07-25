/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Model;
import net.runelite.api.Player;

public class AttachedModelEvent {
    private final Player player;
    private final int minX;
    private final int minY;
    private final int maxX;
    private final int maxY;
    private final int animationCycleStart;
    private final int animationCycleEnd;
    private final Model attachedModel;

    public AttachedModelEvent(Player player, int minX, int minY, int maxX, int maxY, int animationCycleStart, int animationCycleEnd, Model attachedModel) {
        this.player = player;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.animationCycleStart = animationCycleStart;
        this.animationCycleEnd = animationCycleEnd;
        this.attachedModel = attachedModel;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getMinX() {
        return this.minX;
    }

    public int getMinY() {
        return this.minY;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public int getMaxY() {
        return this.maxY;
    }

    public int getAnimationCycleStart() {
        return this.animationCycleStart;
    }

    public int getAnimationCycleEnd() {
        return this.animationCycleEnd;
    }

    public Model getAttachedModel() {
        return this.attachedModel;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachedModelEvent)) {
            return false;
        }
        AttachedModelEvent other = (AttachedModelEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getMinX() != other.getMinX()) {
            return false;
        }
        if (this.getMinY() != other.getMinY()) {
            return false;
        }
        if (this.getMaxX() != other.getMaxX()) {
            return false;
        }
        if (this.getMaxY() != other.getMaxY()) {
            return false;
        }
        if (this.getAnimationCycleStart() != other.getAnimationCycleStart()) {
            return false;
        }
        if (this.getAnimationCycleEnd() != other.getAnimationCycleEnd()) {
            return false;
        }
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        if (this$player == null ? other$player != null : !this$player.equals(other$player)) {
            return false;
        }
        Model this$attachedModel = this.getAttachedModel();
        Model other$attachedModel = other.getAttachedModel();
        return !(this$attachedModel == null ? other$attachedModel != null : !this$attachedModel.equals(other$attachedModel));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachedModelEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getMinX();
        result = result * 59 + this.getMinY();
        result = result * 59 + this.getMaxX();
        result = result * 59 + this.getMaxY();
        result = result * 59 + this.getAnimationCycleStart();
        result = result * 59 + this.getAnimationCycleEnd();
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        Model $attachedModel = this.getAttachedModel();
        result = result * 59 + ($attachedModel == null ? 43 : $attachedModel.hashCode());
        return result;
    }

    public String toString() {
        return "AttachedModelEvent(player=" + this.getPlayer() + ", minX=" + this.getMinX() + ", minY=" + this.getMinY() + ", maxX=" + this.getMaxX() + ", maxY=" + this.getMaxY() + ", animationCycleStart=" + this.getAnimationCycleStart() + ", animationCycleEnd=" + this.getAnimationCycleEnd() + ", attachedModel=" + this.getAttachedModel() + ")";
    }
}

