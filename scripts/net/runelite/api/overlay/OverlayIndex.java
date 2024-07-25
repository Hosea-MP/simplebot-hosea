/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api.overlay;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverlayIndex {
    private static final Logger log = LoggerFactory.getLogger(OverlayIndex.class);
    private static final Set<Integer> overlays = new HashSet<Integer>();

    public static boolean hasOverlay(int indexId, int archiveId) {
        return overlays.contains(indexId << 16 | archiveId);
    }

    static {
        try (InputStream indexStream = OverlayIndex.class.getResourceAsStream("/runelite/index");
             DataInputStream in2 = new DataInputStream(indexStream);){
            int id2;
            while ((id2 = in2.readInt()) != -1) {
                overlays.add(id2);
            }
        } catch (IOException ex2) {
            log.warn("unable to load overlay index", ex2);
        }
    }
}

