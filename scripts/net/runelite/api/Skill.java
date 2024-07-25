/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public enum Skill {
    ATTACK("Attack"),
    DEFENCE("Defence"),
    STRENGTH("Strength"),
    HITPOINTS("Hitpoints"),
    RANGED("Ranged"),
    PRAYER("Prayer"),
    MAGIC("Magic"),
    COOKING("Cooking"),
    WOODCUTTING("Woodcutting"),
    FLETCHING("Fletching"),
    FISHING("Fishing"),
    FIREMAKING("Firemaking"),
    CRAFTING("Crafting"),
    SMITHING("Smithing"),
    MINING("Mining"),
    HERBLORE("Herblore"),
    AGILITY("Agility"),
    THIEVING("Thieving"),
    SLAYER("Slayer"),
    FARMING("Farming"),
    RUNECRAFT("Runecraft"),
    HUNTER("Hunter"),
    CONSTRUCTION("Construction"),
    NONE("Overall"),
    DISCOVERY("Discovery");

    @Deprecated
    public static final Skill OVERALL;
    private final String name;

    private Skill(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    static {
        OVERALL = null;
    }
}

