package rScripts.allInOne;

import simple.hooks.filters.SimpleSkills.Skills;
import simple.hooks.scripts.Category;
import simple.hooks.scripts.ScriptManifest;
import simple.hooks.simplebot.ChatMessage;
import simple.hooks.wrappers.SimpleItem;
import simple.hooks.wrappers.SimpleNpc;
import simple.hooks.wrappers.SimpleObject;
import simple.robot.script.Script;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

@ScriptManifest(author = "YourName", category = Category.OTHER, description = "All-in-one skilling script with dynamic GUI", name = "AllInOneSkiller", version = "1.0", servers = {"OSRSPS"}, discord = "")
public class AllInOneSkiller extends Script {

    private String status;
    private String targetName;
    private String action;
    private boolean isNpc;
    private List<String> itemsToKeep;
    private int searchRadius = 10;

    private JFrame frame;
    private JPanel itemsToKeepPanel;
    private JRadioButton npcRadioButton;
    private JRadioButton objectRadioButton;
    private JPanel npcPanel;
    private JPanel objectPanel;
    private JSlider radiusSlider;

    @Override
    public void onExecute() {
        setupGUI();
        status = "Waiting for user input...";
    }

    private void setupGUI() {
        frame = new JFrame("All-In-One Skiller");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // Fill both horizontally and vertically
        gbc.insets = new Insets(5, 5, 5, 5);

        Font boldFont = new Font("Arial", Font.BOLD, 24); // Increased font size

        JTabbedPane tabbedPane = new JTabbedPane();

        // General Tab
        JPanel generalPanel = new JPanel(new GridBagLayout());

        JLabel itemsToKeepLabel = new JLabel("Items to Keep");
        itemsToKeepLabel.setFont(boldFont);
        itemsToKeepLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0; // Allow horizontal expansion
        gbc.weighty = 0.1; // Small vertical weight
        generalPanel.add(itemsToKeepLabel, gbc);

        itemsToKeepPanel = new JPanel();
        itemsToKeepPanel.setLayout(new BoxLayout(itemsToKeepPanel, BoxLayout.Y_AXIS));
        gbc.gridy = 1;
        gbc.weighty = 0.4; // Larger vertical weight for the items to keep list
        generalPanel.add(new JScrollPane(itemsToKeepPanel), gbc);

        JButton refreshItemsButton = new JButton("Refresh Items");
        refreshItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateInventoryItems();
            }
        });
        gbc.gridy = 2;
        gbc.weighty = 0.1; // Small vertical weight
        generalPanel.add(refreshItemsButton, gbc);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = npcRadioButton.isSelected() ? getSelectedValue(npcPanel) : getSelectedValue(objectPanel);
                if (selectedValue != null) {
                    String[] parts = selectedValue.split(": ");
                    targetName = parts[0].split(" \\(")[0];
                    action = parts[1];
                    isNpc = npcRadioButton.isSelected();
                    itemsToKeep = getSelectedItems();
                    frame.dispose();
                    status = "Starting interaction...";

                    // Debugging statements
                    System.out.println("Target Name: " + targetName);
                    System.out.println("Action: " + action);
                    System.out.println("Is NPC: " + isNpc);
                    System.out.println("Items to Keep: " + itemsToKeep);
                }
            }
        });
        gbc.gridy = 3;
        gbc.weighty = 0.1; // Small vertical weight
        generalPanel.add(startButton, gbc);

        tabbedPane.addTab("General", generalPanel);

        // Interaction Tab
        JPanel interactionPanel = new JPanel(new GridBagLayout());

        JLabel radiusLabel = new JLabel("Search Radius");
        radiusLabel.setFont(boldFont);
        radiusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0; // Allow horizontal expansion
        gbc.weighty = 0.1; // Small vertical weight
        interactionPanel.add(radiusLabel, gbc);

        radiusSlider = new JSlider(1, 20, 10);
        radiusSlider.setMajorTickSpacing(5);
        radiusSlider.setMinorTickSpacing(1);
        radiusSlider.setPaintTicks(true);
        radiusSlider.setPaintLabels(true);
        radiusSlider.setLabelTable(createCustomLabels());
        gbc.gridy = 1;
        gbc.weighty = 0.2; // Slightly more vertical weight for the slider
        interactionPanel.add(radiusSlider, gbc);

        JLabel targetLabel = new JLabel("Target");
        targetLabel.setFont(boldFont);
        targetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 2;
        gbc.weighty = 0.1; // Small vertical weight
        interactionPanel.add(targetLabel, gbc);

        npcRadioButton = new JRadioButton("NPC");
        objectRadioButton = new JRadioButton("Object");
        ButtonGroup group = new ButtonGroup();
        group.add(npcRadioButton);
        group.add(objectRadioButton);
        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(npcRadioButton);
        radioPanel.add(objectRadioButton);
        gbc.gridy = 3;
        gbc.weighty = 0.1; // Small vertical weight
        interactionPanel.add(radioPanel, gbc);

        JLabel npcLabel = new JLabel("NPCs");
        npcLabel.setFont(boldFont);
        npcLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 4;
        gbc.weighty = 0.1; // Small vertical weight
        interactionPanel.add(npcLabel, gbc);

        npcPanel = new JPanel();
        npcPanel.setLayout(new BoxLayout(npcPanel, BoxLayout.Y_AXIS));
        gbc.gridy = 5;
        gbc.weighty = 1.0; // Allow vertical expansion
        interactionPanel.add(new JScrollPane(npcPanel), gbc);

        JLabel objectLabel = new JLabel("Game Objects");
        objectLabel.setFont(boldFont);
        objectLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 6;
        gbc.weighty = 0.1; // Small vertical weight
        interactionPanel.add(objectLabel, gbc);

        objectPanel = new JPanel();
        objectPanel.setLayout(new BoxLayout(objectPanel, BoxLayout.Y_AXIS));
        gbc.gridy = 7;
        gbc.weighty = 1.0; // Allow vertical expansion
        interactionPanel.add(new JScrollPane(objectPanel), gbc);

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchRadius = radiusSlider.getValue();
                populateNearbyEntities();
            }
        });
        gbc.gridy = 8;
        gbc.weighty = 0.1; // Small vertical weight
        interactionPanel.add(refreshButton, gbc);

        tabbedPane.addTab("Interaction", interactionPanel);

        frame.add(tabbedPane, gbc);
        frame.setVisible(true);
    }

    private void populateInventoryItems() {
        itemsToKeepPanel.removeAll();
        Set<String> uniqueItems = new HashSet<>();
        List<SimpleItem> items = ctx.inventory.populate().toStream()
                .distinct()
                .collect(Collectors.toList());
        for (SimpleItem item : items) {
            String itemRepresentation = item.getName() + " (" + item.getId() + ")";
            if (uniqueItems.add(itemRepresentation)) {
                JCheckBox checkBox = new JCheckBox(itemRepresentation);
                itemsToKeepPanel.add(checkBox);
            }
        }
        itemsToKeepPanel.revalidate();
        itemsToKeepPanel.repaint();
    }

    private List<String> getSelectedItems() {
        List<String> selectedItems = new java.util.ArrayList<>();
        for (Component component : itemsToKeepPanel.getComponents()) {
            if (component instanceof JCheckBox && ((JCheckBox) component).isSelected()) {
                selectedItems.add(((JCheckBox) component).getText());
            }
        }
        return selectedItems;
    }

    private void populateNearbyEntities() {
        npcPanel.removeAll();
        objectPanel.removeAll();

        List<String> npcs = ctx.npcs.populate().filterWithin(searchRadius).toStream()
                .filter(npc -> npc != null && npc.getName() != null)
                .flatMap(npc -> {
                    String[] actions = npc.getNpcDefinitions().getActions();
                    return actions != null ?
                            java.util.Arrays.stream(actions)
                                    .filter(action -> action != null && !action.isEmpty())
                                    .map(action -> npc.getName() + " (" + npc.getId() + "): " + action)
                            : java.util.stream.Stream.empty();
                })
                .distinct()
                .collect(Collectors.toList());
        for (String npc : npcs) {
            JCheckBox checkBox = new JCheckBox(npc);
            npcPanel.add(checkBox);
        }

        List<String> objects = ctx.objects.populate().filterWithin(searchRadius).toStream()
                .filter(obj -> obj != null && obj.getName() != null)
                .flatMap(obj -> {
                    String[] actions = obj.getObjectDefinitions().getActions();
                    return actions != null ?
                            java.util.Arrays.stream(actions)
                                    .filter(action -> action != null && !action.isEmpty())
                                    .map(action -> obj.getName() + " (" + obj.getId() + "): " + action)
                            : java.util.stream.Stream.empty();
                })
                .distinct()
                .collect(Collectors.toList());
        for (String object : objects) {
            JCheckBox checkBox = new JCheckBox(object);
            objectPanel.add(checkBox);
        }

        npcPanel.revalidate();
        npcPanel.repaint();
        objectPanel.revalidate();
        objectPanel.repaint();
    }

    private String getSelectedValue(JPanel panel) {
        for (Component component : panel.getComponents()) {
            if (component instanceof JCheckBox && ((JCheckBox) component).isSelected()) {
                return ((JCheckBox) component).getText();
            }
        }
        return null;
    }

    private Dictionary<Integer, JLabel> createCustomLabels() {
        Dictionary<Integer, JLabel> labels = new Hashtable<>();
        labels.put(1, new JLabel("1"));
        labels.put(5, new JLabel("5"));
        labels.put(10, new JLabel("10"));
        labels.put(15, new JLabel("15"));
        labels.put(20, new JLabel("20"));
        return labels;
    }

    @Override
    public void onProcess() {
        if (ctx.players.getLocal().isAnimating() || ctx.players.getLocal().getInteracting() != null) {
            return;
        }

        if (ctx.inventory.inventoryFull()) {
            bankItems();
            return;
        }

        if (targetName != null && targetId != null && action != null) {
            if (isNpc) {
                interactWithNpc(targetName, targetId, action);
            } else {
                interactWithObject();
            }
        }
    }

    private void interactWithNpc(String targetName, int targetId, String action) {
        // Populate nearby NPCs and filter by ID
        SimpleNpc npc = ctx.npcs.populate().filter(targetId).nearest().next();

        if (npc != null && npc.validateInteractable()) {
            String[] actions = npc.getNpcDefinitions().getActions();
            System.out.println("Available actions for NPC " + targetName + " (ID: " + targetId + "): " + Arrays.toString(actions));

            // Check if the action is available for the NPC
            if (Arrays.asList(actions).contains(action)) {
                status = "Interacting with NPC: " + targetName + " (ID: " + targetId + ")";
                System.out.println("Interacting with NPC: " + targetName + " (ID: " + targetId + ") using action: " + action);
                npc.menuAction(action);
                ctx.onCondition(() -> !npc.validateInteractable(), 250, 10);
            } else {
                status = "Action " + action + " not available for NPC: " + targetName + " (ID: " + targetId + ")";
                System.out.println("Action " + action + " not available for NPC: " + targetName + " (ID: " + targetId + ")");
            }
        } else {
            status = "NPC not found or not interactable: " + targetName + " (ID: " + targetId + ")";
            System.out.println("NPC not found or not interactable: " + targetName + " (ID: " + targetId + ")");
        }
    }
    private void interactWithObject() {
        SimpleObject object = ctx.objects.populate().filter(targetName).nextNearest();
        if (object != null && object.validateInteractable()) {
            status = "Interacting with Object: " + targetName;
            System.out.println("Interacting with Object: " + targetName + " using action: " + action);
            object.menuAction(action);
            ctx.onCondition(() -> !object.validateInteractable(), 250, 10);
        } else {
            status = "Object not found or not interactable";
            System.out.println("Object not found or not interactable: " + targetName);
        }
    }

    private void bankItems() {
        SimpleObject bank = ctx.objects.populate().filter("Bank booth").nearest().next();
        if (bank != null && bank.validateInteractable()) {
            status = "Banking items";
            System.out.println("Banking items");
            bank.menuAction("Bank");
            if (ctx.onCondition(ctx.bank::bankOpen, 350, 10)) {
                final Set<Integer> depositedIds = new HashSet<>();
                for (final SimpleItem item : ctx.inventory.populate()) {
                    if (itemsToKeep.contains(item.getName()) || depositedIds.contains(item.getId())) {
                        continue;
                    }
                    status = "Deposit items";
                    System.out.println("Depositing item: " + item.getName());
                    item.menuAction("Deposit-All");
                    depositedIds.add(item.getId());
                    ctx.sleep(50, 150);
                }
                ctx.sleep(1250);
                ctx.bank.closeBank();
            }
        } else {
            status = "Bank not found";
            System.out.println("Bank not found");
        }
    }

    @Override
    public void onTerminate() {
        status = "Terminating AllInOneSkiller";
        System.out.println("Terminating AllInOneSkiller");
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
        g.drawString("AllInOneSkiller v. 1.0", 12, 20);
        g.drawString("Status: " + status, 14, 42);
    }

    @Override
    public void onChatMessage(ChatMessage e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AllInOneSkiller skiller = new AllInOneSkiller();
            skiller.setupGUI();
        });
    }
}