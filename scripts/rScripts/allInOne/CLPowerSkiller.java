package rScripts.allInOne;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.coords.WorldPoint;
import simple.hooks.scripts.Category;
import simple.hooks.scripts.ScriptManifest;
import simple.hooks.simplebot.ChatMessage;
import simple.robot.script.Script;
import rScripts.allInOne.tasks.BankItemsTask;
import rScripts.allInOne.tasks.InteractTask;
import rScripts.allInOne.tasks.ReturnToTileTask;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@ScriptManifest(author = "caleblite", category = Category.OTHER, description = "Enjoy power skilling anywhere with banking support.", name = "CLPowerSkiller", version = "1.0", servers = {"OSRSPS"}, discord = "")
@Getter
@Setter
public class CLPowerSkiller extends Script {

    private String status;
    private String targetName;
    private String action;
    private boolean isNpc;
    private List<String> itemsToKeep;
    private int searchRadius = 10;
    private int targetId;
    private WorldPoint interactionTile;

    private JFrame frame;
    private JPanel itemsToKeepPanel;
    private JRadioButton npcRadioButton;
    private JRadioButton objectRadioButton;
    private JPanel npcPanel;
    private JPanel objectPanel;
    private JSlider radiusSlider;

    private BankItemsTask bankItemsTask;
    private InteractTask interactTask;
    private ReturnToTileTask returnToTileTask;

    @Override
    public void onExecute() {
        CLPowerSkillerGUI.setupGUI(this);
        status = "Waiting for user input...";
    }

    public void initializeTasks() {
        bankItemsTask = new BankItemsTask(ctx, itemsToKeep);
        interactTask = new InteractTask(ctx, targetName, targetId, action, isNpc);
        returnToTileTask = new ReturnToTileTask(ctx, interactionTile);
    }

    @Override
    public void onProcess() {
        if (ctx.players.getLocal().isAnimating() || ctx.players.getLocal().getInteracting() != null) {
            return;
        }

        if (ctx.inventory.inventoryFull()) {
            if (bankItemsTask.run()) {
                returnToTileTask.run();
            }
            return;
        }

        if (interactionTile == null) {
            return;
        }

        if (!ctx.players.getLocal().getLocation().equals(interactionTile)) {
            returnToTileTask.run();
            return;
        }

        if (targetName != null && targetId != 0 && action != null) {
            interactTask.run();
        }
    }

    @Override
    public void onTerminate() {
        status = "Terminating CLPowerSkiller...";
    }

    @Override
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        g.setColor(Color.BLACK);
        g.fillRect(5, 2, 192, 86);
        g.setColor(Color.decode("#D93B26"));
        g.drawRect(5, 2, 192, 86);
        g.drawLine(8, 24, 194, 24);

        g.setColor(Color.decode("#1C6497"));
        g.drawString("CL PowerSkiller v. 1.0", 12, 20);
        g.drawString("Status: " + status, 14, 42);
    }

    @Override
    public void onChatMessage(ChatMessage e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CLPowerSkiller skiller = new CLPowerSkiller();
            CLPowerSkillerGUI.setupGUI(skiller);
        });
    }
}