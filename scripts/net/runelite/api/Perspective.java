/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.ApiStatus$Internal
 */
package net.runelite.api;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.runelite.api.AABB;
import net.runelite.api.Client;
import net.runelite.api.Model;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.geometry.RectangleUnion;
import net.runelite.api.geometry.Shapes;
import net.runelite.api.geometry.SimplePolygon;
import net.runelite.api.model.Jarvis;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import org.jetbrains.annotations.ApiStatus;

public class Perspective {
    public static final double UNIT = 0.0030679615757712823;
    public static final int LOCAL_COORD_BITS = 7;
    public static final int LOCAL_TILE_SIZE = 128;
    public static final int LOCAL_HALF_TILE_SIZE = 64;
    public static final int SCENE_SIZE = 104;
    public static final int[] SINE = new int[2048];
    public static final int[] COSINE = new int[2048];

    @Nullable
    public static Point localToCanvas(@Nonnull Client client2, @Nonnull LocalPoint point, int plane) {
        return Perspective.localToCanvas(client2, point, plane, 0);
    }

    @Nullable
    public static Point localToCanvas(@Nonnull Client client2, @Nonnull LocalPoint point, int plane, int zOffset) {
        int tileHeight = Perspective.getTileHeight(client2, point, plane);
        return Perspective.localToCanvas(client2, point.getX(), point.getY(), tileHeight - zOffset);
    }

    public static Point localToCanvas(@Nonnull Client client2, int x, int y, int z) {
        if (x >= 128 && y >= 128 && x <= 13056 && y <= 13056) {
            x -= client2.getCameraX();
            y -= client2.getCameraY();
            z -= client2.getCameraZ();
            int cameraPitch = client2.getCameraPitch();
            int cameraYaw = client2.getCameraYaw();
            int pitchSin = SINE[cameraPitch];
            int pitchCos = COSINE[cameraPitch];
            int yawSin = SINE[cameraYaw];
            int yawCos = COSINE[cameraYaw];
            int x1 = x * yawCos + y * yawSin >> 16;
            int y1 = y * yawCos - x * yawSin >> 16;
            int y2 = z * pitchCos - y1 * pitchSin >> 16;
            int z1 = y1 * pitchCos + z * pitchSin >> 16;
            if (z1 >= 50) {
                int scale = client2.getScale();
                int pointX = client2.getViewportWidth() / 2 + x1 * scale / z1;
                int pointY = client2.getViewportHeight() / 2 + y2 * scale / z1;
                return new Point(pointX + client2.getViewportXOffset(), pointY + client2.getViewportYOffset());
            }
        }
        return null;
    }

    public static void modelToCanvas(Client client2, int end, int x3dCenter, int y3dCenter, int z3dCenter, int rotate, int[] x3d, int[] y3d, int[] z3d, int[] x2d, int[] y2d) {
        if (client2.isGpu()) {
            Perspective.modelToCanvasGpu(client2, end, x3dCenter, y3dCenter, z3dCenter, rotate, x3d, y3d, z3d, x2d, y2d);
        } else {
            Perspective.modelToCanvasCpu(client2, end, x3dCenter, y3dCenter, z3dCenter, rotate, x3d, y3d, z3d, x2d, y2d);
        }
    }

    private static void modelToCanvasGpu(Client client2, int end, int x3dCenter, int y3dCenter, int z3dCenter, int rotate, int[] x3d, int[] y3d, int[] z3d, int[] x2d, int[] y2d) {
        int cameraPitch = client2.getCameraPitch();
        int cameraYaw = client2.getCameraYaw();
        float pitchSin = (float)SINE[cameraPitch] / 65536.0f;
        float pitchCos = (float)COSINE[cameraPitch] / 65536.0f;
        float yawSin = (float)SINE[cameraYaw] / 65536.0f;
        float yawCos = (float)COSINE[cameraYaw] / 65536.0f;
        float rotateSin = (float)SINE[rotate] / 65536.0f;
        float rotateCos = (float)COSINE[rotate] / 65536.0f;
        float cx2 = x3dCenter - client2.getCameraX();
        float cy2 = y3dCenter - client2.getCameraY();
        float cz2 = z3dCenter - client2.getCameraZ();
        float viewportXMiddle = (float)client2.getViewportWidth() / 2.0f;
        float viewportYMiddle = (float)client2.getViewportHeight() / 2.0f;
        float viewportXOffset = client2.getViewportXOffset();
        float viewportYOffset = client2.getViewportYOffset();
        float zoom3d = client2.getScale();
        for (int i = 0; i < end; ++i) {
            int viewY;
            int viewX;
            float x = x3d[i];
            float y = y3d[i];
            float z = z3d[i];
            if (rotate != 0) {
                float x0 = x;
                x = x0 * rotateCos + y * rotateSin;
                y = y * rotateCos - x0 * rotateSin;
            }
            float x1 = (x += cx2) * yawCos + (y += cy2) * yawSin;
            float y1 = y * yawCos - x * yawSin;
            float y2 = (z += cz2) * pitchCos - y1 * pitchSin;
            float z1 = y1 * pitchCos + z * pitchSin;
            if (z1 < 50.0f) {
                viewX = Integer.MIN_VALUE;
                viewY = Integer.MIN_VALUE;
            } else {
                viewX = Math.round(viewportXMiddle + x1 * zoom3d / z1 + viewportXOffset);
                viewY = Math.round(viewportYMiddle + y2 * zoom3d / z1 + viewportYOffset);
            }
            x2d[i] = viewX;
            y2d[i] = viewY;
        }
    }

    private static void modelToCanvasCpu(Client client2, int end, int x3dCenter, int y3dCenter, int z3dCenter, int rotate, int[] x3d, int[] y3d, int[] z3d, int[] x2d, int[] y2d) {
        int cameraPitch = client2.getCameraPitch();
        int cameraYaw = client2.getCameraYaw();
        int pitchSin = SINE[cameraPitch];
        int pitchCos = COSINE[cameraPitch];
        int yawSin = SINE[cameraYaw];
        int yawCos = COSINE[cameraYaw];
        int rotateSin = SINE[rotate];
        int rotateCos = COSINE[rotate];
        int cx2 = x3dCenter - client2.getCameraX();
        int cy2 = y3dCenter - client2.getCameraY();
        int cz2 = z3dCenter - client2.getCameraZ();
        int viewportXMiddle = client2.getViewportWidth() / 2;
        int viewportYMiddle = client2.getViewportHeight() / 2;
        int viewportXOffset = client2.getViewportXOffset();
        int viewportYOffset = client2.getViewportYOffset();
        int zoom3d = client2.getScale();
        for (int i = 0; i < end; ++i) {
            int viewY;
            int viewX;
            int x = x3d[i];
            int y = y3d[i];
            int z = z3d[i];
            if (rotate != 0) {
                int x0 = x;
                x = x0 * rotateCos + y * rotateSin >> 16;
                y = y * rotateCos - x0 * rotateSin >> 16;
            }
            int x1 = (x += cx2) * yawCos + (y += cy2) * yawSin >> 16;
            int y1 = y * yawCos - x * yawSin >> 16;
            int y2 = (z += cz2) * pitchCos - y1 * pitchSin >> 16;
            int z1 = y1 * pitchCos + z * pitchSin >> 16;
            if (z1 < 50) {
                viewX = Integer.MIN_VALUE;
                viewY = Integer.MIN_VALUE;
            } else {
                viewX = viewportXMiddle + x1 * zoom3d / z1 + viewportXOffset;
                viewY = viewportYMiddle + y2 * zoom3d / z1 + viewportYOffset;
            }
            x2d[i] = viewX;
            y2d[i] = viewY;
        }
    }

    @Nullable
    public static Point localToMinimap(@Nonnull Client client2, @Nonnull LocalPoint point) {
        int r = 2560;
        double s = 4.0 / client2.getMinimapZoom();
        return Perspective.localToMinimap(client2, point, (int)(2560.0 * s));
    }

    @Nullable
    public static Point localToMinimap(@Nonnull Client client2, @Nonnull LocalPoint point, int distance) {
        int dy2;
        LocalPoint localLocation = client2.getLocalPlayer().getLocalLocation();
        int dx2 = point.getX() - localLocation.getX();
        if (dx2 * dx2 + (dy2 = point.getY() - localLocation.getY()) * dy2 < distance * distance) {
            Widget minimapDrawWidget = client2.isResized() ? (client2.getVarbitValue(4607) == 1 ? client2.getWidget(WidgetInfo.RESIZABLE_MINIMAP_DRAW_AREA) : client2.getWidget(WidgetInfo.RESIZABLE_MINIMAP_STONES_DRAW_AREA)) : client2.getWidget(WidgetInfo.FIXED_VIEWPORT_MINIMAP_DRAW_AREA);
            if (minimapDrawWidget == null || minimapDrawWidget.isHidden()) {
                return null;
            }
            double zoom = client2.getMinimapZoom() / 128.0;
            int x = (int)((double)dx2 * zoom);
            int y = (int)((double)dy2 * zoom);
            int angle = client2.getCameraYawTarget() & 0x7FF;
            int sin = SINE[angle];
            int cos = COSINE[angle];
            int rx2 = cos * x + sin * y >> 16;
            int ry2 = sin * x - cos * y >> 16;
            Point loc = minimapDrawWidget.getCanvasLocation();
            int miniMapX = loc.getX() + minimapDrawWidget.getWidth() / 2 + rx2;
            int miniMapY = loc.getY() + minimapDrawWidget.getHeight() / 2 + ry2;
            return new Point(miniMapX, miniMapY);
        }
        return null;
    }

    public static int getTileHeight(@Nonnull Client client2, @Nonnull LocalPoint point, int plane) {
        int sceneX = point.getSceneX();
        int sceneY = point.getSceneY();
        if (sceneX >= 0 && sceneY >= 0 && sceneX < 104 && sceneY < 104) {
            byte[][][] tileSettings = client2.getTileSettings();
            int[][][] tileHeights = client2.getTileHeights();
            int z1 = plane;
            if (plane < 3 && (tileSettings[1][sceneX][sceneY] & 2) == 2) {
                z1 = plane + 1;
            }
            int x = point.getX() & 0x7F;
            int y = point.getY() & 0x7F;
            int var8 = x * tileHeights[z1][sceneX + 1][sceneY] + (128 - x) * tileHeights[z1][sceneX][sceneY] >> 7;
            int var9 = tileHeights[z1][sceneX][sceneY + 1] * (128 - x) + x * tileHeights[z1][sceneX + 1][sceneY + 1] >> 7;
            return (128 - y) * var8 + y * var9 >> 7;
        }
        return 0;
    }

    private static int getHeight(@Nonnull Client client2, int localX, int localY, int plane) {
        int sceneX = localX >> 7;
        int sceneY = localY >> 7;
        if (sceneX >= 0 && sceneY >= 0 && sceneX < 104 && sceneY < 104) {
            int[][][] tileHeights = client2.getTileHeights();
            int x = localX & 0x7F;
            int y = localY & 0x7F;
            int var8 = x * tileHeights[plane][sceneX + 1][sceneY] + (128 - x) * tileHeights[plane][sceneX][sceneY] >> 7;
            int var9 = tileHeights[plane][sceneX][sceneY + 1] * (128 - x) + x * tileHeights[plane][sceneX + 1][sceneY + 1] >> 7;
            return (128 - y) * var8 + y * var9 >> 7;
        }
        return 0;
    }

    public static Polygon getCanvasTilePoly(@Nonnull Client client2, @Nonnull LocalPoint localLocation) {
        return Perspective.getCanvasTileAreaPoly(client2, localLocation, 1);
    }

    public static Polygon getCanvasTilePoly(@Nonnull Client client2, @Nonnull LocalPoint localLocation, int zOffset) {
        return Perspective.getCanvasTileAreaPoly(client2, localLocation, 1, 1, client2.getPlane(), zOffset);
    }

    public static Polygon getCanvasTileAreaPoly(@Nonnull Client client2, @Nonnull LocalPoint localLocation, int size) {
        return Perspective.getCanvasTileAreaPoly(client2, localLocation, size, size, client2.getPlane(), 0);
    }

    public static Polygon getCanvasTileAreaPoly(@Nonnull Client client2, @Nonnull LocalPoint localLocation, int sizeX, int sizeY, int plane, int zOffset) {
        if (!localLocation.isInScene()) {
            return null;
        }
        byte[][][] tileSettings = client2.getTileSettings();
        int sceneX = localLocation.getSceneX();
        int sceneY = localLocation.getSceneY();
        int tilePlane = plane;
        if (plane < 3 && (tileSettings[1][sceneX][sceneY] & 2) == 2) {
            tilePlane = plane + 1;
        }
        int swX = localLocation.getX() - sizeX * 128 / 2;
        int swY = localLocation.getY() - sizeY * 128 / 2;
        int neX = localLocation.getX() + sizeX * 128 / 2;
        int neY = localLocation.getY() + sizeY * 128 / 2;
        int seX = swX;
        int seY = neY;
        int nwX = neX;
        int nwY = swY;
        int swHeight = Perspective.getHeight(client2, swX, swY, tilePlane) - zOffset;
        int nwHeight = Perspective.getHeight(client2, nwX, nwY, tilePlane) - zOffset;
        int neHeight = Perspective.getHeight(client2, neX, neY, tilePlane) - zOffset;
        int seHeight = Perspective.getHeight(client2, seX, seY, tilePlane) - zOffset;
        Point p1 = Perspective.localToCanvas(client2, swX, swY, swHeight);
        Point p2 = Perspective.localToCanvas(client2, nwX, nwY, nwHeight);
        Point p3 = Perspective.localToCanvas(client2, neX, neY, neHeight);
        Point p4 = Perspective.localToCanvas(client2, seX, seY, seHeight);
        if (p1 == null || p2 == null || p3 == null || p4 == null) {
            return null;
        }
        Polygon poly = new Polygon();
        poly.addPoint(p1.getX(), p1.getY());
        poly.addPoint(p2.getX(), p2.getY());
        poly.addPoint(p3.getX(), p3.getY());
        poly.addPoint(p4.getX(), p4.getY());
        return poly;
    }

    public static Point getCanvasTextLocation(@Nonnull Client client2, @Nonnull Graphics2D graphics, @Nonnull LocalPoint localLocation, @Nullable String text, int zOffset) {
        if (text == null) {
            return null;
        }
        int plane = client2.getPlane();
        Point p = Perspective.localToCanvas(client2, localLocation, plane, zOffset);
        if (p == null) {
            return null;
        }
        FontMetrics fm2 = graphics.getFontMetrics();
        Rectangle2D bounds = fm2.getStringBounds(text, graphics);
        int xOffset = p.getX() - (int)(bounds.getWidth() / 2.0);
        return new Point(xOffset, p.getY());
    }

    public static Point getCanvasImageLocation(@Nonnull Client client2, @Nonnull LocalPoint localLocation, @Nonnull BufferedImage image, int zOffset) {
        int plane = client2.getPlane();
        Point p = Perspective.localToCanvas(client2, localLocation, plane, zOffset);
        if (p == null) {
            return null;
        }
        int xOffset = p.getX() - image.getWidth() / 2;
        int yOffset = p.getY() - image.getHeight() / 2;
        return new Point(xOffset, yOffset);
    }

    public static Point getMiniMapImageLocation(@Nonnull Client client2, @Nonnull LocalPoint localLocation, @Nonnull BufferedImage image) {
        Point p = Perspective.localToMinimap(client2, localLocation);
        if (p == null) {
            return null;
        }
        int xOffset = p.getX() - image.getWidth() / 2;
        int yOffset = p.getY() - image.getHeight() / 2;
        return new Point(xOffset, yOffset);
    }

    public static Point getCanvasSpriteLocation(@Nonnull Client client2, @Nonnull LocalPoint localLocation, @Nonnull SpritePixels sprite, int zOffset) {
        int plane = client2.getPlane();
        Point p = Perspective.localToCanvas(client2, localLocation, plane, zOffset);
        if (p == null) {
            return null;
        }
        int xOffset = p.getX() - sprite.getWidth() / 2;
        int yOffset = p.getY() - sprite.getHeight() / 2;
        return new Point(xOffset, yOffset);
    }

    @Nullable
    @ApiStatus.Internal
    public static Shape getClickbox(@Nonnull Client client2, Model model, int orientation, int x, int y, int z) {
        if (model == null) {
            return null;
        }
        SimplePolygon bounds = Perspective.calculateAABB(client2, model, orientation, x, y, z);
        if (bounds == null) {
            return null;
        }
        if (model.isClickable()) {
            return bounds;
        }
        Shapes<SimplePolygon> bounds2d = Perspective.calculate2DBounds(client2, model, orientation, x, y, z);
        if (bounds2d == null) {
            return null;
        }
        for (SimplePolygon poly : bounds2d.getShapes()) {
            poly.intersectWithConvex(bounds);
        }
        return bounds2d;
    }

    private static SimplePolygon calculateAABB(Client client2, Model m, int jauOrient, int x, int y, int z) {
        AABB aabb = m.getAABB(jauOrient);
        int x1 = aabb.getCenterX();
        int y1 = aabb.getCenterZ();
        int z1 = aabb.getCenterY();
        int ex2 = aabb.getExtremeX();
        int ey2 = aabb.getExtremeZ();
        int ez2 = aabb.getExtremeY();
        int x2 = x1 + ex2;
        int y2 = y1 + ey2;
        int z2 = z1 + ez2;
        int[] xa = new int[]{x1 -= ex2, x2, x1, x2, x1, x2, x1, x2};
        int[] ya = new int[]{y1 -= ey2, y1, y2, y2, y1, y1, y2, y2};
        int[] za = new int[]{z1 -= ez2, z1, z1, z1, z2, z2, z2, z2};
        int[] x2d = new int[8];
        int[] y2d = new int[8];
        Perspective.modelToCanvasCpu(client2, 8, x, y, z, 0, xa, ya, za, x2d, y2d);
        return Jarvis.convexHull(x2d, y2d);
    }

    private static Shapes<SimplePolygon> calculate2DBounds(Client client2, Model m, int jauOrient, int x, int y, int z) {
        int[] x2d = new int[m.getVerticesCount()];
        int[] y2d = new int[m.getVerticesCount()];
        int[] faceColors3 = m.getFaceColors3();
        Perspective.modelToCanvasCpu(client2, m.getVerticesCount(), x, y, z, jauOrient, m.getVerticesX(), m.getVerticesZ(), m.getVerticesY(), x2d, y2d);
        int radius = 5;
        int[][] tris = new int[][]{m.getFaceIndices1(), m.getFaceIndices2(), m.getFaceIndices3()};
        int vpX1 = client2.getViewportXOffset();
        int vpY1 = client2.getViewportXOffset();
        int vpX2 = vpX1 + client2.getViewportWidth();
        int vpY2 = vpY1 + client2.getViewportHeight();
        ArrayList<RectangleUnion.Rectangle> rects = new ArrayList<RectangleUnion.Rectangle>(m.getFaceCount());
        block0: for (int tri = 0; tri < m.getFaceCount(); ++tri) {
            if (faceColors3[tri] == -2) continue;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for (int[] vertex : tris) {
                int idx = vertex[tri];
                int xs = x2d[idx];
                int ys = y2d[idx];
                if (xs == Integer.MIN_VALUE || ys == Integer.MIN_VALUE) continue block0;
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
            if (vpX1 > (maxX += 5) || vpX2 < (minX -= 5) || vpY1 > (maxY += 5) || vpY2 < (minY -= 5)) continue;
            RectangleUnion.Rectangle r = new RectangleUnion.Rectangle(minX, minY, maxX, maxY);
            rects.add(r);
        }
        return RectangleUnion.union(rects);
    }

    public static Point getCanvasTextMiniMapLocation(@Nonnull Client client2, @Nonnull Graphics2D graphics, @Nonnull LocalPoint localLocation, @Nonnull String text) {
        Point p = Perspective.localToMinimap(client2, localLocation);
        if (p == null) {
            return null;
        }
        FontMetrics fm2 = graphics.getFontMetrics();
        Rectangle2D bounds = fm2.getStringBounds(text, graphics);
        int xOffset = p.getX() - (int)(bounds.getWidth() / 2.0);
        int yOffset = p.getY() - (int)(bounds.getHeight() / 2.0) + fm2.getAscent();
        return new Point(xOffset, yOffset);
    }

    static {
        for (int i = 0; i < 2048; ++i) {
            Perspective.SINE[i] = (int)(65536.0 * Math.sin((double)i * 0.0030679615757712823));
            Perspective.COSINE[i] = (int)(65536.0 * Math.cos((double)i * 0.0030679615757712823));
        }
    }
}

