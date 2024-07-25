/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.model;

import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.geometry.SimplePolygon;

public class Jarvis {
    @Deprecated
    public static List<Point> convexHull(List<Point> points) {
        int[] xs = new int[points.size()];
        int[] ys = new int[xs.length];
        for (int i = 0; i < xs.length; ++i) {
            Point p = points.get(i);
            xs[i] = p.getX();
            ys[i] = p.getY();
        }
        SimplePolygon poly = Jarvis.convexHull(xs, ys);
        if (poly == null) {
            return null;
        }
        return poly.toRuneLitePointList();
    }

    public static SimplePolygon convexHull(int[] xs, int[] ys) {
        int next;
        int left;
        int i;
        int length = xs.length;
        int offset = 0;
        for (i = 0; i < length; ++i) {
            if (xs[i] != Integer.MIN_VALUE) continue;
            ++offset;
            ++i;
            break;
        }
        while (i < length) {
            if (xs[i] == Integer.MIN_VALUE) {
                ++offset;
            } else {
                xs[i - offset] = xs[i];
                ys[i - offset] = ys[i];
            }
            ++i;
        }
        if ((length -= offset) < 3) {
            return null;
        }
        int current = left = Jarvis.findLeftMost(xs, ys, length);
        SimplePolygon out = new SimplePolygon(new int[16], new int[16], 0);
        do {
            int cx2 = xs[current];
            int cy2 = ys[current];
            out.pushRight(cx2, cy2);
            if (out.size() > length) {
                return null;
            }
            next = 0;
            int nx2 = xs[next];
            int ny2 = ys[next];
            for (int i2 = 1; i2 < length; ++i2) {
                long cp2 = Jarvis.crossProduct(cx2, cy2, xs[i2], ys[i2], nx2, ny2);
                if (cp2 <= 0L && (cp2 != 0L || Jarvis.square(cx2 - xs[i2]) + Jarvis.square(cy2 - ys[i2]) <= Jarvis.square(cx2 - nx2) + Jarvis.square(cy2 - ny2))) continue;
                next = i2;
                nx2 = xs[next];
                ny2 = ys[next];
            }
        } while ((current = next) != left);
        return out;
    }

    private static int square(int x) {
        return x * x;
    }

    private static int findLeftMost(int[] xs, int[] ys, int length) {
        int idx = 0;
        int x = xs[idx];
        int y = ys[idx];
        for (int i = 1; i < length; ++i) {
            int ix2 = xs[i];
            if (ix2 >= x && (ix2 != x || ys[i] >= y)) continue;
            idx = i;
            x = xs[idx];
            y = ys[idx];
        }
        return idx;
    }

    private static long crossProduct(int px2, int py2, int qx2, int qy2, int rx2, int ry2) {
        long val = (long)(qy2 - py2) * (long)(rx2 - qx2) - (long)(qx2 - px2) * (long)(ry2 - qy2);
        return val;
    }
}

