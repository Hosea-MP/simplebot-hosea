/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.geometry;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Point;

public class SimplePolygon
implements Shape {
    private static final int GROW = 16;
    protected int[] x;
    protected int[] y;
    protected int left;
    protected int right;

    public SimplePolygon() {
        this(new int[32], new int[32], 16, 15);
    }

    public SimplePolygon(int[] x, int[] y, int length) {
        this(x, y, 0, length - 1);
    }

    public void pushLeft(int xCoord, int yCoord) {
        --this.left;
        if (this.left < 0) {
            this.expandLeft(16);
        }
        this.x[this.left] = xCoord;
        this.y[this.left] = yCoord;
    }

    public void popLeft() {
        ++this.left;
    }

    protected void expandLeft(int grow) {
        int[] nx2 = new int[this.x.length + grow];
        System.arraycopy(this.x, 0, nx2, grow, this.x.length);
        this.x = nx2;
        int[] ny2 = new int[nx2.length];
        System.arraycopy(this.y, 0, ny2, grow, this.y.length);
        this.y = ny2;
        this.left += grow;
        this.right += grow;
    }

    public void pushRight(int xCoord, int yCoord) {
        ++this.right;
        if (this.right >= this.x.length) {
            this.expandRight(16);
        }
        this.x[this.right] = xCoord;
        this.y[this.right] = yCoord;
    }

    public void popRight() {
        --this.right;
    }

    protected void expandRight(int grow) {
        int[] nx2 = new int[this.x.length + grow];
        System.arraycopy(this.x, 0, nx2, 0, this.x.length);
        this.x = nx2;
        int[] ny2 = new int[nx2.length];
        System.arraycopy(this.y, 0, ny2, 0, this.y.length);
        this.y = ny2;
    }

    public int getX(int index) {
        return this.x[this.left + index];
    }

    public int getY(int index) {
        return this.y[this.left + index];
    }

    public int size() {
        return this.right - this.left + 1;
    }

    public List<Point> toRuneLitePointList() {
        ArrayList<Point> out = new ArrayList<Point>(this.size());
        for (int i = this.left; i <= this.right; ++i) {
            out.add(new Point(this.x[i], this.y[i]));
        }
        return out;
    }

    public void copyTo(int[] xDest, int[] yDest, int offset) {
        System.arraycopy(this.x, this.left, xDest, offset, this.size());
        System.arraycopy(this.y, this.left, yDest, offset, this.size());
    }

    public void appendTo(SimplePolygon other) {
        int size = this.size();
        if (size <= 0) {
            return;
        }
        other.expandRight(size);
        this.copyTo(other.x, other.y, other.right + 1);
        other.right += size;
    }

    public void reverse() {
        int half = this.size() / 2;
        for (int i = 0; i < half; ++i) {
            int li2 = this.left + i;
            int ri2 = this.right - i;
            int tx2 = this.x[li2];
            int ty2 = this.y[li2];
            this.x[li2] = this.x[ri2];
            this.y[li2] = this.y[ri2];
            this.x[ri2] = tx2;
            this.y[ri2] = ty2;
        }
    }

    public void intersectWithConvex(SimplePolygon convex) {
        int[] tx2 = new int[this.size()];
        int[] ty2 = new int[tx2.length];
        int cx1 = convex.x[convex.right];
        int cy1 = convex.y[convex.right];
        for (int ci2 = convex.left; ci2 <= convex.right; ++ci2) {
            if (this.size() < 3) {
                return;
            }
            int tRight = this.right;
            int tLeft = this.left;
            int[] tmpX = this.x;
            int[] tmpY = this.y;
            this.x = tx2;
            this.y = ty2;
            this.left = 0;
            this.right = -1;
            tx2 = tmpX;
            ty2 = tmpY;
            int cx2 = convex.x[ci2];
            int cy2 = convex.y[ci2];
            int tx1 = tx2[tRight];
            int ty1 = ty2[tRight];
            for (int ti2 = tLeft; ti2 <= tRight; ++ti2) {
                int tx22 = tx2[ti2];
                int ty22 = ty2[ti2];
                int p1 = (cx2 - cx1) * (ty1 - cy1) - (cy2 - cy1) * (tx1 - cx1);
                int p2 = (cx2 - cx1) * (ty22 - cy1) - (cy2 - cy1) * (tx22 - cx1);
                if (p1 < 0 && p2 < 0) {
                    this.pushRight(tx22, ty22);
                } else if (p1 >= 0 != p2 >= 0) {
                    long nota = cx1 * cy2 - cy1 * cx2;
                    long clue = tx1 * ty22 - ty1 * tx22;
                    long div = (cx1 - cx2) * (ty1 - ty22) - (cy1 - cy2) * (tx1 - tx22);
                    this.pushRight((int)((nota * (long)(tx1 - tx22) - (long)(cx1 - cx2) * clue) / div), (int)((nota * (long)(ty1 - ty22) - (long)(cy1 - cy2) * clue) / div));
                    if (p1 >= 0) {
                        this.pushRight(tx22, ty22);
                    }
                }
                tx1 = tx22;
                ty1 = ty22;
            }
            cx1 = cx2;
            cy1 = cy2;
        }
    }

    @Override
    public Rectangle getBounds() {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = this.left; i <= this.right; ++i) {
            int xs = this.x[i];
            int ys = this.y[i];
            if (xs < minX) {
                minX = xs;
            }
            if (xs > maxX) {
                maxX = xs;
            }
            if (ys < minY) {
                minY = ys;
            }
            if (ys <= maxY) continue;
            maxY = ys;
        }
        return new Rectangle(minX, minY, maxX - minX, maxY - minY);
    }

    @Override
    public Rectangle2D getBounds2D() {
        Rectangle b = this.getBounds();
        return new Rectangle2D.Float(b.x, b.y, b.width, b.height);
    }

    @Override
    public boolean contains(double cx2, double cy2) {
        if (this.size() < 3) {
            return false;
        }
        return (this.crossings(cx2, cy2, false) & 1) != 0;
    }

    private int crossings(double cx2, double cy2, boolean swap) {
        int collisions = 0;
        int[] x = this.x;
        int[] y = this.y;
        if (swap) {
            y = this.x;
            x = this.y;
        }
        int x0 = x[this.right];
        int y0 = y[this.right];
        for (int i = this.left; i <= this.right; ++i) {
            int x1 = x[i];
            int y1 = y[i];
            if (y0 != y1) {
                double dy1;
                double dy0 = y0;
                if (cy2 <= dy0 != cy2 <= (dy1 = (double)y1)) {
                    double dx1;
                    double dx0 = x0;
                    boolean left = cx2 < dx0;
                    if (left == cx2 < (dx1 = (double)x1)) {
                        if (!left) {
                            ++collisions;
                        }
                    } else if ((dx1 - dx0) * (cy2 - dy0) - (cx2 - dx0) * (dy1 - dy0) > 0.0 == dy0 > dy1) {
                        ++collisions;
                    }
                }
            }
            x0 = x1;
            y0 = y1;
        }
        return collisions;
    }

    @Override
    public boolean contains(Point2D p) {
        return this.contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(double x0, double y0, double w, double h) {
        double x1 = x0 + w;
        double y1 = y0 + h;
        return this.crossings(x0, y0, false) != this.crossings(x1, y0, false) || this.crossings(x0, y1, false) != this.crossings(x1, y1, false) || this.crossings(x0, y0, true) != this.crossings(x0, y1, true) || this.crossings(x1, y0, true) != this.crossings(x1, y1, true);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return this.intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (!this.getBounds().contains(x, y, w, h)) {
            return false;
        }
        return !this.intersects(x, y, w, h);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return this.contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at2) {
        if (at2 == null) {
            return new SimpleIterator();
        }
        return new TransformIterator(at2);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at2, double flatness) {
        return this.getPathIterator(at2);
    }

    public SimplePolygon(int[] x, int[] y, int left, int right) {
        this.x = x;
        this.y = y;
        this.left = left;
        this.right = right;
    }

    public int[] getX() {
        return this.x;
    }

    public int[] getY() {
        return this.y;
    }

    public int getLeft() {
        return this.left;
    }

    public int getRight() {
        return this.right;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    private class TransformIterator
    extends SimpleIterator {
        private final AffineTransform transform;

        TransformIterator(AffineTransform transform) {
            this.transform = transform;
        }

        @Override
        public int currentSegment(float[] coords) {
            int v = super.currentSegment(coords);
            this.transform.transform(coords, 0, coords, 0, 2);
            return v;
        }

        @Override
        public int currentSegment(double[] coords) {
            int v = super.currentSegment(coords);
            this.transform.transform(coords, 0, coords, 0, 2);
            return v;
        }
    }

    private class SimpleIterator
    implements PathIterator {
        private int i = -1;

        private SimpleIterator() {
        }

        @Override
        public int getWindingRule() {
            return 0;
        }

        @Override
        public boolean isDone() {
            return SimplePolygon.this.size() == 0 || this.i > SimplePolygon.this.right;
        }

        @Override
        public void next() {
            this.i = this.i == -1 ? SimplePolygon.this.left : ++this.i;
        }

        @Override
        public int currentSegment(float[] coords) {
            if (this.i == -1) {
                coords[0] = SimplePolygon.this.x[SimplePolygon.this.right];
                coords[1] = SimplePolygon.this.y[SimplePolygon.this.right];
                return 0;
            }
            coords[0] = SimplePolygon.this.x[this.i];
            coords[1] = SimplePolygon.this.y[this.i];
            return 1;
        }

        @Override
        public int currentSegment(double[] coords) {
            if (this.i == -1) {
                coords[0] = SimplePolygon.this.x[SimplePolygon.this.right];
                coords[1] = SimplePolygon.this.y[SimplePolygon.this.right];
                return 0;
            }
            coords[0] = SimplePolygon.this.x[this.i];
            coords[1] = SimplePolygon.this.y[this.i];
            return 1;
        }
    }
}

