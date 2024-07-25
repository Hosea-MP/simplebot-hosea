/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class RunEnergyChangedEvent {
    private int newEnergy;

    public int getNewEnergy() {
        return this.newEnergy;
    }

    public void setNewEnergy(int newEnergy) {
        this.newEnergy = newEnergy;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RunEnergyChangedEvent)) {
            return false;
        }
        RunEnergyChangedEvent other = (RunEnergyChangedEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        return this.getNewEnergy() == other.getNewEnergy();
    }

    protected boolean canEqual(Object other) {
        return other instanceof RunEnergyChangedEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getNewEnergy();
        return result;
    }

    public String toString() {
        return "RunEnergyChangedEvent(newEnergy=" + this.getNewEnergy() + ")";
    }

    public RunEnergyChangedEvent(int newEnergy) {
        this.newEnergy = newEnergy;
    }
}

