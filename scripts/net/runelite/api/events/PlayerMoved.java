/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Player;

public class PlayerMoved {
    private final Player player;
    private final int x;
    private final int y;
    private final int type;

    public PlayerMoved(Player player, int x, int y, int type) {
        this.player = player;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getType() {
        return this.type;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayerMoved)) {
            return false;
        }
        PlayerMoved other = (PlayerMoved)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        if (this.getType() != other.getType()) {
            return false;
        }
        Player this$player = this.getPlayer();
        Player other$player = other.getPlayer();
        return !(this$player == null ? other$player != null : !this$player.equals(other$player));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlayerMoved;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getType();
        Player $player = this.getPlayer();
        result = result * 59 + ($player == null ? 43 : $player.hashCode());
        return result;
    }

    public String toString() {
        return "PlayerMoved(player=" + this.getPlayer() + ", x=" + this.getX() + ", y=" + this.getY() + ", type=" + this.getType() + ")";
    }
}

