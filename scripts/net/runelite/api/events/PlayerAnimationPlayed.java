/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Player;

public class PlayerAnimationPlayed {
    private final Player player;
    private final int id;
    private final int delay;

    public PlayerAnimationPlayed(Player player, int id2, int delay) {
        this.player = player;
        this.id = id2;
        this.delay = delay;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getId() {
        return this.id;
    }

    public int getDelay() {
        return this.delay;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayerAnimationPlayed)) {
            return false;
        }
        PlayerAnimationPlayed other = (PlayerAnimationPlayed)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getDelay() != other.getDelay()) {
            return false;
        }
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        return !(this$player == null ? other$player != null : !this$player.equals(other$player));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlayerAnimationPlayed;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getDelay();
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        return result;
    }

    public String toString() {
        return "PlayerAnimationPlayed(player=" + this.getPlayer() + ", id=" + this.getId() + ", delay=" + this.getDelay() + ")";
    }
}

