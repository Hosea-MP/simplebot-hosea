/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.GrandExchangeOfferState;

public interface GrandExchangeOffer {
    public int getQuantitySold();

    public int getItemId();

    public int getTotalQuantity();

    public int getPrice();

    public int getSpent();

    public GrandExchangeOfferState getState();

    public byte getRSState();
}

