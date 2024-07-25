/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.widgets;

import java.awt.Rectangle;
import javax.annotation.Nullable;
import net.runelite.api.Point;
import net.runelite.api.widgets.Widget;

public class WidgetItem {
    private final int id;
    private final int quantity;
    private final Rectangle canvasBounds;
    private final Widget widget;
    @Nullable
    private final Rectangle draggingCanvasBounds;

    public Rectangle getCanvasBounds() {
        return this.draggingCanvasBounds == null ? this.canvasBounds : this.draggingCanvasBounds;
    }

    public Rectangle getCanvasBounds(boolean dragging) {
        return dragging ? this.draggingCanvasBounds : this.canvasBounds;
    }

    public Point getCanvasLocation() {
        Rectangle bounds = this.getCanvasBounds();
        return new Point((int)bounds.getX(), (int)bounds.getY());
    }

    public WidgetItem(int id2, int quantity, Rectangle canvasBounds, Widget widget, @Nullable Rectangle draggingCanvasBounds) {
        this.id = id2;
        this.quantity = quantity;
        this.canvasBounds = canvasBounds;
        this.widget = widget;
        this.draggingCanvasBounds = draggingCanvasBounds;
    }

    public String toString() {
        return "WidgetItem(id=" + this.getId() + ", quantity=" + this.getQuantity() + ", canvasBounds=" + this.getCanvasBounds() + ", widget=" + this.getWidget() + ", draggingCanvasBounds=" + this.getDraggingCanvasBounds() + ")";
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Widget getWidget() {
        return this.widget;
    }

    @Nullable
    public Rectangle getDraggingCanvasBounds() {
        return this.draggingCanvasBounds;
    }
}

