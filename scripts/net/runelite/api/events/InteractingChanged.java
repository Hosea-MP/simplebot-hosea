/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

import net.runelite.api.Actor;

public class InteractingChanged {
    private final Actor source;
    private final Actor target;
    private int index = -1;

    public InteractingChanged(Actor source, Actor target) {
        this.source = source;
        this.target = target;
    }

    public InteractingChanged(Actor source, Actor target, int index) {
        this.source = source;
        this.target = target;
        this.index = index;
    }

    public Actor getSource() {
        return this.source;
    }

    public Actor getTarget() {
        return this.target;
    }

    public int getIndex() {
        return this.index;
    }
}

