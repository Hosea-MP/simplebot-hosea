/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

import net.runelite.api.coords.LocalPoint;

public interface AmbientSoundEffect {
    public int getSoundEffectId();

    public int getPlane();

    public LocalPoint getMinPosition();

    public LocalPoint getMaxPosition();
}

