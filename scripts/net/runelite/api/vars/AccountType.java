/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.vars;

@Deprecated
public enum AccountType {
    NORMAL,
    IRONMAN,
    ULTIMATE_IRONMAN,
    HARDCORE_IRONMAN,
    GROUP_IRONMAN,
    HARDCORE_GROUP_IRONMAN;


    public boolean isIronman() {
        return this.ordinal() >= IRONMAN.ordinal() && this.ordinal() <= HARDCORE_IRONMAN.ordinal();
    }

    public boolean isGroupIronman() {
        return this.ordinal() >= GROUP_IRONMAN.ordinal() && this.ordinal() <= HARDCORE_GROUP_IRONMAN.ordinal();
    }
}

