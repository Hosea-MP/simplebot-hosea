/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;
import net.runelite.api.NPC;

public final class NpcDespawned {
    private final NPC npc;

    public Actor getActor() {
        return this.npc;
    }

    public NpcDespawned(NPC npc) {
        this.npc = npc;
    }

    public NPC getNpc() {
        return this.npc;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NpcDespawned)) {
            return false;
        }
        NpcDespawned other = (NpcDespawned)o;
        NPC this$npc = this.getNpc();
        NPC other$npc = other.getNpc();
        return !(this$npc == null ? other$npc != null : !this$npc.equals(other$npc));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        NPC $npc = this.getNpc();
        result = result * 59 + ($npc == null ? 43 : $npc.hashCode());
        return result;
    }

    public String toString() {
        return "NpcDespawned(npc=" + this.getNpc() + ")";
    }
}
