/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public class Hitsplat {
    private int hitsplatType;
    private int amount;
    private int disappearsOnGameCycle;

    public Hitsplat(int hitsplatType, int amount, int disappearsOnGameCycle) {
        this.hitsplatType = hitsplatType;
        this.amount = amount;
        this.disappearsOnGameCycle = disappearsOnGameCycle;
    }

    public boolean isMine() {
        switch (this.hitsplatType) {
            case 12: 
            case 16: 
            case 18: 
            case 20: 
            case 22: 
            case 24: 
            case 43: 
            case 44: 
            case 45: 
            case 46: 
            case 47: {
                return true;
            }
        }
        return false;
    }

    public boolean isOthers() {
        switch (this.hitsplatType) {
            case 13: 
            case 17: 
            case 19: 
            case 21: 
            case 23: 
            case 25: {
                return true;
            }
        }
        return false;
    }

    public int getHitsplatType() {
        return this.hitsplatType;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getDisappearsOnGameCycle() {
        return this.disappearsOnGameCycle;
    }
}

