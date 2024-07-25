/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetTextChanged {
    private final String text;

    public WidgetTextChanged(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetTextChanged)) {
            return false;
        }
        WidgetTextChanged other = (WidgetTextChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$text = this.getText();
        String other$text = other.getText();
        return !(this$text == null ? other$text != null : !this$text.equals(other$text));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetTextChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $text = this.getText();
        result = result * 59 + ($text == null ? 43 : $text.hashCode());
        return result;
    }

    public String toString() {
        return "WidgetTextChanged(text=" + this.getText() + ")";
    }
}

