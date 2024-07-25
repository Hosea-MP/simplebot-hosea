package test;

import lombok.Setter;
import simple.hooks.scripts.Category;
import simple.hooks.scripts.ScriptManifest;
import simple.hooks.scripts.task.Task;
import simple.hooks.scripts.task.TaskScript;
import simple.hooks.scripts.LoopingScript;
import simple.hooks.simplebot.ChatMessage;
import simple.hooks.wrappers.SimpleNpc;
import simple.hooks.wrappers.SimpleObject;
import simple.hooks.wrappers.SimpleItem;
import net.runelite.api.coords.WorldPoint;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

@ScriptManifest(
        author = "YourName",
        category = Category.OTHER,
        description = "<html><p>Template script for other scripts.</p></html>",
        discord = "YourDiscord#1234",
        name = "TestScript",
        servers = {"OSRSPS"},
        version = "1.0"
)
public class TestScript extends TaskScript implements LoopingScript {

    private Set<Integer> itemsToKeepIds = new HashSet<>();
    private Set<String> itemsToKeepNames = new HashSet<>();
    @Setter
    private boolean bankingEnabled = true;
    @Setter
    private WorldPoint startingTile;
    private long startTime;
    private static String status = null;

    @Override
    public void onChatMessage(ChatMessage chatMessage) {

    }

    @Override
    public void onExecute() {
        startTime = System.currentTimeMillis();
        status = "Starting script";
        startingTile = ctx.players.getLocal().getLocation();
        new TestGUI(this, ctx);
    }

    @Override
    public void onProcess() {
        // Main loop code here
    }

    @Override
    public List<Task> tasks() {
        return List.of();
    }

    @Override
    public boolean prioritizeTasks() {
        return false;
    }

    @Override
    public void onTerminate() {
        // Cleanup code here
    }

    @Override
    public int loopDuration() {
        return 150;
    }

    public void setItemsToKeep(String items) {
        List<String> itemList = Arrays.asList(items.split(","));
        for (String item : itemList) {
            item = item.trim();
            try {
                itemsToKeepIds.add(Integer.parseInt(item));
            } catch (NumberFormatException e) {
                itemsToKeepNames.add(item);
            }
        }
    }

    public SimpleObject findNearestGameObject(String name) {
        return ctx.objects.populate().filter(name).nearest().next();
    }

    public void interactWithNearestGameObject(String name, String action) {
        SimpleObject obj = findNearestGameObject(name);
        if (obj != null) {
            obj.menuAction(action);
        } else {
            System.out.println("Game object with name " + name + " not found.");
        }
    }

    public SimpleNpc findNearestNPC(String name) {
        return ctx.npcs.populate().filter(name).nearest().next();
    }

    public void interactWithNearestNPC(String name, String action) {
        SimpleNpc npc = findNearestNPC(name);
        if (npc != null) {
            npc.menuAction(action);
        } else {
            System.out.println("NPC with name " + name + " not found.");
        }
    }

    public void handleInventory() {
        if (bankingEnabled) {
            handleBanking();
        } else {
            handleDropping();
        }
    }

    private void handleBanking() {
        if (!ctx.bank.bankOpen()) {
            SimpleNpc banker = ctx.npcs.populate().filter("Banker").nearest().next();
            if (banker != null) {
                banker.menuAction("Bank");
                ctx.onCondition(ctx.bank::bankOpen, 250, 10);
            }
            return;
        }

        for (SimpleItem item : ctx.inventory.populate()) {
            if (!itemsToKeepIds.contains(item.getId()) && !itemsToKeepNames.contains(item.getName())) {
                item.menuAction("Deposit-All");
                ctx.sleep(50, 150);
            }
        }
        ctx.bank.closeBank();
        returnToStartingTile();
    }

    private void handleDropping() {
        for (SimpleItem item : ctx.inventory.populate()) {
            if (!itemsToKeepIds.contains(item.getId()) && !itemsToKeepNames.contains(item.getName())) {
                item.menuAction("Drop");
                ctx.sleep(50, 150);
            }
        }
    }

    private void returnToStartingTile() {
        if (startingTile != null) {
            ctx.pathing.step(startingTile);
            ctx.onCondition(() -> ctx.pathing.onTile(startingTile), 250, 10);
        }
    }

    @Override
    public void paint(Graphics graphics) {

    }
}