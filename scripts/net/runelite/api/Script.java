/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.Node;

public interface Script
extends Node {
    public int[] getIntOperands();

    public int[] getInstructions();
}

