package com.test;

import simple.hooks.scripts.Category;
import simple.hooks.scripts.ScriptManifest;
import simple.robot.script.Script;
import simple.robot.api.ClientContext;
import simple.hooks.wrappers.SimpleObject;
import simple.hooks.simplebot.ChatMessage;
import net.runelite.api.coords.WorldPoint;
import java.awt.Graphics;

@ScriptManifest(
        author = "YourName",
        category = Category.OTHER,
        description = "Test script for demonstrating lifecycle methods",
        discord = "YourDiscord#1234",
        name = "TestScript",
        servers = { "YourServer" },
        version = "0.1"
)
public class TestScript extends Script {

    private final WorldPoint BANK_TILE = new WorldPoint(3092, 3245, 0); // The bank tile we want to step to for banking

    @Override
    public void onExecute() {
        System.out.println("Started TestScript!");
    }

    @Override
    public void onProcess() {
        if (!ctx.inventory.inventoryFull()) {
            if (ctx.players.getLocal().getAnimation() == -1) { // Checks if we're currently animating right now, if not jump to body
                SimpleObject tree = ctx.objects.populate().filter("Willow").nextNearest(); // Grabs the nearest 'Willow' tree in the game
                if (tree != null && tree.validateInteractable()) { // Checks if the tree isn't null, if it isn't it will turn and walk to it
                    tree.click("Chop down"); // Once the tree is in chopping range we will click 'Chop down' or chop it
                    ctx.sleepCondition(() -> ctx.players.getLocal().getAnimation() != -1, 5000); // Checks if we're chopping with a 5 second time-out, so we don't spam click 'Chop down'
                }
            }
        } else { // If our inventory is full, let's bank
            if (ctx.players.getLocal().getLocation().distanceTo(BANK_TILE) > 3) { // If we're 3 tiles away from the bank, let's walk to it
                ctx.pathing.step(BANK_TILE); // Clicks on the bank tile on the minimap
                ctx.onCondition(() -> ctx.players.getLocal().getLocation().distanceTo(BANK_TILE) <= 3);
            } else { // If we're at the bank, let's open it
                if (!ctx.bank.bankOpen()) { // If the bank screen isn't open, let's open it
                    SimpleObject bank = ctx.objects.populate().filter("Bank booth").nextNearest(); // Grabs the nearest 'Bank booth' object to us
                    if (bank != null && bank.validateInteractable()) { // Checks if the bank isn't null, if it isn't we'll turn to it and walk to it
                        bank.click("Bank"); // Once we can see the bank, we're going to open it
                        ctx.sleepCondition(() -> ctx.players.getLocal().getAnimation() != -1, 5000); // Checks if the bank is open with a 5 second time-out, so we don't spam click 'Open'
                    }
                }
                if (ctx.bank.bankOpen()) { // If the bank is open, let's deposit our logs!
                    ctx.bank.depositInventory(); // Clicks the Deposit inventory button
                    ctx.sleepCondition(() -> ctx.inventory.populate().isEmpty(), 5000); // Checks if our inventory is now empty with a 5 second time-out, so we don't spam click deposit
                    ctx.bank.closeBank(); // Close the bank once our inventory is empty
                }
            }
        }
    }

    @Override
    public void onTerminate() {
        System.out.println("Terminated TestScript!");
    }

    @Override
    public void onChatMessage(ChatMessage e) {
        // Handle chat messages if needed
    }

    @Override
    public void paint(Graphics g) {
        // Implement any painting logic if needed
    }
}