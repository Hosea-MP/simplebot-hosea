package com.example.tasks;

import simple.hooks.scripts.task.Task;
import simple.robot.api.ClientContext;
import simple.hooks.wrappers.SimpleNpc;
import simple.hooks.wrappers.SimpleObject;

public class InteractTask extends Task {
    private final String targetType;
    private final String targetName;
    private final String interactionText;

    public InteractTask(ClientContext ctx, String targetType, String targetName, String interactionText) {
        super(ctx);
        this.targetType = targetType;
        this.targetName = targetName;
        this.interactionText = interactionText;
    }

    @Override
    public boolean condition() {
        if (targetType.equalsIgnoreCase("NPC")) {
            SimpleNpc npc = ctx.npcs.populate().filter(targetName).nextNearest();
            return npc != null && npc.validateInteractable();
        } else if (targetType.equalsIgnoreCase("Object")) {
            SimpleObject object = ctx.objects.populate().filter(targetName).nextNearest();
            return object != null && object.validateInteractable();
        }
        return false;
    }

    @Override
    public void run() {
        if (targetType.equalsIgnoreCase("NPC")) {
            SimpleNpc npc = ctx.npcs.populate().filter(targetName).nextNearest();
            if (npc != null) {
                npc.click(interactionText);
            }
        } else if (targetType.equalsIgnoreCase("Object")) {
            SimpleObject object = ctx.objects.populate().filter(targetName).nextNearest();
            if (object != null) {
                object.click(interactionText);
            }
        }
    }

    @Override
    public String status() {
        return "Interacting with " + targetType + ": " + targetName;
    }
}