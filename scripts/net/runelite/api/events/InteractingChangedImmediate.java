/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class InteractingChangedImmediate {
    private final Actor source;
    private int index = -1;

    public InteractingChangedImmediate(Actor source) {
        this.source = source;
    }

    public InteractingChangedImmediate(Actor source, int index) {
        this.source = source;
        this.index = index;
    }

    public Actor getSource() {
        return this.source;
    }

    public int getIndex() {
        return this.index;
    }
}

