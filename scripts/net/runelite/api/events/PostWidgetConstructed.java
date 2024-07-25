/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class PostWidgetConstructed {
    public static final PostWidgetConstructed INSTANCE = new PostWidgetConstructed();

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PostWidgetConstructed)) {
            return false;
        }
        PostWidgetConstructed other = (PostWidgetConstructed)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof PostWidgetConstructed;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "PostWidgetConstructed()";
    }
}

