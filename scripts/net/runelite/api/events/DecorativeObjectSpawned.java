/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.DecorativeObject;
import net.runelite.api.Tile;

public class DecorativeObjectSpawned {
    private Tile tile;
    private DecorativeObject decorativeObject;

    public Tile getTile() {
        return this.tile;
    }

    public DecorativeObject getDecorativeObject() {
        return this.decorativeObject;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public void setDecorativeObject(DecorativeObject decorativeObject) {
        this.decorativeObject = decorativeObject;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DecorativeObjectSpawned)) {
            return false;
        }
        DecorativeObjectSpawned other = (DecorativeObjectSpawned)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Tile this$tile = this.getTile();
        Tile other$tile = other.getTile();
        if (this$tile == null ? other$tile != null : !this$tile.equals(other$tile)) {
            return false;
        }
        DecorativeObject this$decorativeObject = this.getDecorativeObject();
        DecorativeObject other$decorativeObject = other.getDecorativeObject();
        return !(this$decorativeObject == null ? other$decorativeObject != null : !this$decorativeObject.equals(other$decorativeObject));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DecorativeObjectSpawned;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Tile $tile = this.getTile();
        result = result * 59 + ($tile == null ? 43 : $tile.hashCode());
        DecorativeObject $decorativeObject = this.getDecorativeObject();
        result = result * 59 + ($decorativeObject == null ? 43 : $decorativeObject.hashCode());
        return result;
    }

    public String toString() {
        return "DecorativeObjectSpawned(tile=" + this.getTile() + ", decorativeObject=" + this.getDecorativeObject() + ")";
    }
}
