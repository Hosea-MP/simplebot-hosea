/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.MessageNode;

public interface ChatLineBuffer {
    public MessageNode[] getLines();

    public int getLength();

    public void removeMessageNode(MessageNode var1);
}

