/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.events;

public class WidgetZoomChanged {
    private final int zoom;
    private final int angleX;
    private final int angleY;

    public WidgetZoomChanged(int zoom, int angleX, int angleY) {
        this.zoom = zoom;
        this.angleX = angleX;
        this.angleY = angleY;
    }

    public int getZoom() {
        return this.zoom;
    }

    public int getAngleX() {
        return this.angleX;
    }

    public int getAngleY() {
        return this.angleY;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetZoomChanged)) {
            return false;
        }
        WidgetZoomChanged other = (WidgetZoomChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getZoom() != other.getZoom()) {
            return false;
        }
        if (this.getAngleX() != other.getAngleX()) {
            return false;
        }
        return this.getAngleY() == other.getAngleY();
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetZoomChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getZoom();
        result = result * 59 + this.getAngleX();
        result = result * 59 + this.getAngleY();
        return result;
    }

    public String toString() {
        return "WidgetZoomChanged(zoom=" + this.getZoom() + ", angleX=" + this.getAngleX() + ", angleY=" + this.getAngleY() + ")";
    }
}

