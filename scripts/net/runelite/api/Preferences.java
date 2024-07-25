/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public interface Preferences {
    public String getRememberedUsername();

    public void setRememberedUsername(String var1);

    public int getSoundEffectVolume();

    public void setSoundEffectVolume(int var1);

    public int getAreaSoundEffectVolume();

    public void setAreaSoundEffectVolume(int var1);

    public boolean getHideUsername();
}

