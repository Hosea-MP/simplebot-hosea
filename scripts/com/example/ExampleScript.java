package com.example;

import com.example.tasks.BankTask;
import com.example.tasks.InteractTask;
import com.example.ExampleGUI;
import simple.hooks.scripts.Category;
import simple.hooks.scripts.ScriptManifest;
import simple.hooks.scripts.task.Task;
import simple.hooks.scripts.task.TaskScript;
import simple.hooks.simplebot.ChatMessage;
import simple.robot.api.ClientContext;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

@ScriptManifest(
        name = "Example Script",
        description = "An example script that opens the bank when inventory is full.",
        author = "Your Name",
        version = "1.0",
        servers = {"OSRSPS"}, discord = "", category = Category.OTHER)
public class ExampleScript extends TaskScript {
    private List<Task> taskList = new ArrayList<>();
    private AtomicBoolean guiSubmitted = new AtomicBoolean(false);

    @Override
    public List<Task> tasks() {
        return taskList;
    }

    @Override
    public boolean prioritizeTasks() {
        return false;
    }

    @Override
    public void onChatMessage(ChatMessage chatMessage) {
        // Handle chat messages here
    }

    @Override
    public void onExecute() {
        // Load GUI in a separate thread
        new Thread(() -> {
            ExampleGUI gui = new ExampleGUI();
            gui.setVisible(true);

            // Wait for the user to submit the form
            ctx.onCondition(new BooleanSupplier() {
                @Override
                public boolean getAsBoolean() {
                    return gui.isSubmitted();
                }
            }, 5000); // Check every 5 seconds

            // Get user input from the GUI
            String targetType = gui.getTargetType();
            String targetName = gui.getTargetName();
            String interactionText = gui.getInteractionText();

            // Add tasks to the task list
            taskList.add(new BankTask(ctx));
            taskList.add(new InteractTask(ctx, targetType, targetName, interactionText));

            // Mark GUI as submitted
            guiSubmitted.set(true);
        }).start();

        // Wait until the GUI is submitted before proceeding
        ctx.onCondition(new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return guiSubmitted.get();
            }
        }, 100); // Check every 100 milliseconds
    }

    @Override
    public void onTerminate() {
        // Cleanup code here
    }

    @Override
    public void paint(Graphics graphics) {
        // Custom paint code here
    }
}