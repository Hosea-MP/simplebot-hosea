package com.test.tasks;

import simple.hooks.scripts.task.Task;
import simple.robot.api.ClientContext;
import simple.hooks.wrappers.SimpleObject;

public class InteractWithObjectTask extends Task {
    private String id;
    private String name;
    private String interactionText;
    private boolean isCompleted;

    public InteractWithObjectTask(ClientContext ctx, String id, String name, String interactionText) {
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
        SimpleObject targetObject = null;
        if (id != null && !id.isEmpty()) {
            targetObject = getNearestObjectById(Integer.parseInt(id));
        } else if (name != null && !name.isEmpty()) {
            targetObject = getNearestObjectByName(name);
        }

        if (targetObject != null) {
            targetObject.click(interactionText);
            isCompleted = true; // Mark task as completed
        } else {
            System.out.println("Game Object not found.");
        }
    }

    @Override
    public String status() {
        return "Interacting with Game Object";
    }

    private SimpleObject getNearestObjectByName(String name) {
        return ctx.objects.populate().filter(obj -> obj.getName().equalsIgnoreCase(name)).nearest().next();
    }

    private SimpleObject getNearestObjectById(int id) {
        return ctx.objects.populate().filter(obj -> obj.getId() == id).nearest().next();
    }
}