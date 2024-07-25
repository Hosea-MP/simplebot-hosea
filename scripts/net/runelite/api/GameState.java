/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.runelite.api;

public enum GameState {
    UNKNOWN(-1),
    STARTING(0),
    LOGIN_SCREEN(10),
    LOGIN_SCREEN_AUTHENTICATOR(11),
    LOGGING_IN(20),
    LOADING(25),
    LOGGED_IN(30),
    CONNECTION_LOST(40),
    HOPPING(45);

    private final int state;

    private GameState(int state) {
        this.state = state;
    }

    public static GameState of(int state) {
        for (GameState gs2 : GameState.values()) {
            if (gs2.state != state) continue;
            return gs2;
        }
        return UNKNOWN;
    }

    public int getState() {
        return this.state;
    }
}

