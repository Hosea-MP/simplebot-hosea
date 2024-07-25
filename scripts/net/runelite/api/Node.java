/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public interface Node {
    public Node getNext();

    public Node getPrevious();

    public long getHash();
}

