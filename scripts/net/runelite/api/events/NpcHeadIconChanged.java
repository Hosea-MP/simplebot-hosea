/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import java.util.Arrays;
import net.runelite.api.NPC;

public class NpcHeadIconChanged {
    private final NPC npc;
    private final int[] groups;
    private final short[] indices;

    public NpcHeadIconChanged(NPC npc, int[] groups, short[] indices) {
        this.npc = npc;
        this.groups = groups;
        this.indices = indices;
    }

    public NPC getNpc() {
        return this.npc;
    }

    public int[] getGroups() {
        return this.groups;
    }

    public short[] getIndices() {
        return this.indices;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NpcHeadIconChanged)) {
            return false;
        }
        NpcHeadIconChanged other = (NpcHeadIconChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        NPC this$npc = this.getNpc();
        NPC other$npc = other.getNpc();
        if (this$npc == null ? other$npc != null : !this$npc.equals(other$npc)) {
            return false;
        }
        if (!Arrays.equals(this.getGroups(), other.getGroups())) {
            return false;
        }
        return Arrays.equals(this.getIndices(), other.getIndices());
    }

    protected boolean canEqual(Object other) {
        return other instanceof NpcHeadIconChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        NPC $npc = this.getNpc();
        result = result * 59 + ($npc == null ? 43 : $npc.hashCode());
        result = result * 59 + Arrays.hashCode(this.getGroups());
        result = result * 59 + Arrays.hashCode(this.getIndices());
        return result;
    }

    public String toString() {
        return "NpcHeadIconChanged(npc=" + this.getNpc() + ", groups=" + Arrays.toString(this.getGroups()) + ", indices=" + Arrays.toString(this.getIndices()) + ")";
    }
}

