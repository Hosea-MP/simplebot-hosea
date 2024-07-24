package com.test;

import simple.robot.script.Script;
import simple.hooks.scripts.ScriptManifest;
import simple.robot.api.ClientContext;
import simple.hooks.wrappers.SimpleNpc;
import simple.hooks.filters.SimpleNpcs;
import simple.hooks.scripts.Category;

import java.awt.*;

@ScriptManifest(
        author = "YourName",
        name = "TestScript",
        category = Category.OTHER,
        version = "1.0",
        description = "A script to find the nearest NPC based on user input",
        discord = "your_discord",
        servers = {"server1", "server2"}
)
public class TestScript extends Script {

    private static String type;
    private static String id;
    private static String name;
    private static String interactionText;

    public static void setUserInputs(String type, String id, String name, String interactionText) {
        TestScript.type = type;
        TestScript.id = id;
        TestScript.name = name;
        TestScript.interactionText = interactionText;
    }

    @Override
    public void onExecute() {
        // Initialization code if needed
    }

    @Override
    public void onProcess() {
        // Example user input for NPC name
        String npcName = name; // Use the name provided by the user

        // Get the nearest NPC with the specified name
        SimpleNpc nearestNpc = getNearestNpc(npcName);

        if (nearestNpc != null) {
            System.out.println("Nearest NPC: " + nearestNpc.getName() + " at " + nearestNpc.getLocation());
        } else {
            System.out.println("No NPC found with the name: " + npcName);
        }
    }

    @Override
    public void onTerminate() {
        // Cleanup code if needed
    }

    @Override
    public void onChatMessage(simple.hooks.simplebot.ChatMessage message) {
        // Handle chat messages if needed
    }

    private SimpleNpc getNearestNpc(String name) {
        SimpleNpcs npcs = ctx.npcs;
        return npcs.filter(npc -> npc.getName().equalsIgnoreCase(name)).nearest().next();
    }

    @Override
    public void paint(Graphics graphics) {

    }

    public static void startScript() {
        // Logic to start the script
        // This method can be called from the plugin panel
        ClientContext.instance().log("Starting script...");
        // Assuming the script is already running, we just need to set the inputs
        // and let the task system handle the rest.
    }
}