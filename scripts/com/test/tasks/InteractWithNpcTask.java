package com.test.tasks;

import simple.hooks.scripts.task.Task;
import simple.robot.api.ClientContext;
import simple.hooks.wrappers.SimpleNpc;

public class InteractWithNpcTask extends Task {
    private String id;
    private String name;
    private String interactionText;
    private boolean isCompleted;

    public InteractWithNpcTask(ClientContext ctx, String id, String name, String interactionText) {
        super(ctx);
        this.id = id;
        this.name = name;
        this.interactionText = interactionText;
        this.isCompleted = false;
    }

    @Override
    public boolean condition() {
        return !isCompleted && ((id != null && !id.isEmpty()) || (name != null && !name.isEmpty()));
    }

    @Override
    public void run() {
        SimpleNpc targetNpc = null;
        if (id != null && !id.isEmpty()) {
            targetNpc = getNearestNpcById(Integer.parseInt(id));
        } else if (name != null && !name.isEmpty()) {
            targetNpc = getNearestNpcByName(name);
        }

        if (targetNpc != null) {
            targetNpc.click(interactionText);
            isCompleted = true; // Mark task as completed
        } else {
            System.out.println("NPC not found.");
        }
    }

    @Override
    public String status() {
        return "Interacting with NPC";
    }

    private SimpleNpc getNearestNpcByName(String name) {
        return ctx.npcs.populate().filter(npc -> npc.getName().equalsIgnoreCase(name)).nearest().next();
    }

    private SimpleNpc getNearestNpcById(int id) {
        return ctx.npcs.populate().filter(npc -> npc.getId() == id).nearest().next();
    }
}