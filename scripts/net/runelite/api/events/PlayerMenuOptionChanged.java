/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class PlayerMenuOptionChanged {
    private final int index;
    private final String option;
    private final boolean priority;

    public PlayerMenuOptionChanged(int index, String option, boolean priority) {
        this.index = index;
        this.option = option;
        this.priority = priority;
    }

    public int getIndex() {
        return this.index;
    }

    public String getOption() {
        return this.option;
    }

    public boolean isPriority() {
        return this.priority;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PlayerMenuOptionChanged)) {
            return false;
        }
        PlayerMenuOptionChanged other = (PlayerMenuOptionChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getIndex() != other.getIndex()) {
            return false;
        }
        if (this.isPriority() != other.isPriority()) {
            return false;
        }
        String this$option = this.getOption();
        String other$option = other.getOption();
        return !(this$option == null ? other$option != null : !this$option.equals(other$option));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlayerMenuOptionChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIndex();
        result = result * 59 + (this.isPriority() ? 79 : 97);
        String $option = this.getOption();
        result = result * 59 + ($option == null ? 43 : $option.hashCode());
        return result;
    }

    public String toString() {
        return "PlayerMenuOptionChanged(index=" + this.getIndex() + ", option=" + this.getOption() + ", priority=" + this.isPriority() + ")";
    }
}

