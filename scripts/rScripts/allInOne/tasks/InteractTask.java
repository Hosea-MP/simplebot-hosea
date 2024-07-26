package rScripts.allInOne.tasks;

import simple.hooks.wrappers.SimpleNpc;
import simple.hooks.wrappers.SimpleObject;
import simple.robot.api.ClientContext;

import java.util.Arrays;

public class InteractTask {
    private final ClientContext ctx;
    private final String targetName;
    private final int targetId;
    private final String action;
    private final boolean isNpc;

    public InteractTask(ClientContext ctx, String targetName, int targetId, String action, boolean isNpc) {
        this.ctx = ctx;
        this.targetName = targetName;
        this.targetId = targetId;
        this.action = action;
        this.isNpc = isNpc;
    }

    public void run() {
        if (isNpc) {
            interactWithNpc();
        } else {
            interactWithObject();
        }
    }

    private void interactWithNpc() {
        SimpleNpc npc = ctx.npcs.populate().filter(targetId).nearest().next();

        if (npc != null && npc.validateInteractable()) {
            String[] actions = npc.getNpcDefinitions().getActions();

            if (Arrays.asList(actions).contains(action)) {
                npc.menuAction(action);
                ctx.onCondition(() -> !npc.validateInteractable(), 250, 10);
            }
        }
    }

    private void interactWithObject() {
        SimpleObject object = ctx.objects.populate().filter(targetId).nearest().next();

        if (object != null && object.validateInteractable()) {
            String[] actions = object.getObjectDefinitions().getActions();

            if (Arrays.asList(actions).contains(action)) {
                object.menuAction(action);
                ctx.onCondition(() -> !object.validateInteractable(), 250, 10);
            }
        }
    }
}