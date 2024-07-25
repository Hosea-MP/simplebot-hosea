/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.NPC;

public class NPCMoved {
    private final NPC npc;
    private final int x;
    private final int y;
    private final int type;

    public NPCMoved(NPC npc, int x, int y, int type) {
        this.npc = npc;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public NPC getNpc() {
        return this.npc;
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
        if (!(o instanceof NPCMoved)) {
            return false;
        }
        NPCMoved other = (NPCMoved)o;
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
        NPC this$npc = this.getNpc();
        NPC other$npc = other.getNpc();
        return !(this$npc == null ? other$npc != null : !this$npc.equals(other$npc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NPCMoved;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getX();
        result = result * 59 + this.getY();
        result = result * 59 + this.getType();
        NPC $npc = this.getNpc();
        result = result * 59 + ($npc == null ? 43 : $npc.hashCode());
        return result;
    }

    public String toString() {
        return "NPCMoved(npc=" + this.getNpc() + ", x=" + this.getX() + ", y=" + this.getY() + ", type=" + this.getType() + ")";
    }
}

