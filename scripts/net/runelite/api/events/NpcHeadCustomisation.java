/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.NPC;
import net.runelite.api.NpcTypeCustomisation;

public class NpcHeadCustomisation {
    private final NPC npc;
    private final NpcTypeCustomisation npcTypeCustomisation;

    public NpcHeadCustomisation(NPC npc, NpcTypeCustomisation npcTypeCustomisation) {
        this.npc = npc;
        this.npcTypeCustomisation = npcTypeCustomisation;
    }

    public NPC getNpc() {
        return this.npc;
    }

    public NpcTypeCustomisation getNpcTypeCustomisation() {
        return this.npcTypeCustomisation;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NpcHeadCustomisation)) {
            return false;
        }
        NpcHeadCustomisation other = (NpcHeadCustomisation)o;
        if (!other.canEqual(this)) {
            return false;
        }
        NPC this$npc = this.getNpc();
        NPC other$npc = other.getNpc();
        if (this$npc == null ? other$npc != null : !this$npc.equals(other$npc)) {
            return false;
        }
        NpcTypeCustomisation this$npcTypeCustomisation = this.getNpcTypeCustomisation();
        NpcTypeCustomisation other$npcTypeCustomisation = other.getNpcTypeCustomisation();
        return !(this$npcTypeCustomisation == null ? other$npcTypeCustomisation != null : !this$npcTypeCustomisation.equals(other$npcTypeCustomisation));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NpcHeadCustomisation;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        NPC $npc = this.getNpc();
        result = result * 59 + ($npc == null ? 43 : $npc.hashCode());
        NpcTypeCustomisation $npcTypeCustomisation = this.getNpcTypeCustomisation();
        result = result * 59 + ($npcTypeCustomisation == null ? 43 : $npcTypeCustomisation.hashCode());
        return result;
    }

    public String toString() {
        return "NpcHeadCustomisation(npc=" + this.getNpc() + ", npcTypeCustomisation=" + this.getNpcTypeCustomisation() + ")";
    }
}

