package rScripts.allInOne;

import rScripts.allInOne.utils.EntityUtils;
import rScripts.allInOne.utils.InventoryUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CLPowerSkillerGUI {

    public static void setupGUI(CLPowerSkiller script) {
        JFrame frame = new JFrame("All-In-One Skiller");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);

        Font boldFont = new Font("Arial", Font.BOLD, 24);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel generalPanel = new JPanel(new GridBagLayout());

        JLabel itemsToKeepLabel = new JLabel("Items to Keep");
        itemsToKeepLabel.setFont(boldFont);
        itemsToKeepLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        generalPanel.add(itemsToKeepLabel, gbc);

        JPanel itemsToKeepPanel = new JPanel();
        itemsToKeepPanel.setLayout(new BoxLayout(itemsToKeepPanel, BoxLayout.Y_AXIS));
        gbc.gridy = 1;
        gbc.weighty = 0.4;
        generalPanel.add(new JScrollPane(itemsToKeepPanel), gbc);

        JButton refreshItemsButton = new JButton("Refresh Items");
        refreshItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InventoryUtils.populateInventoryItems(script.ctx, itemsToKeepPanel);
            }
        });
        gbc.gridy = 2;
        gbc.weighty = 0.1;
        generalPanel.add(refreshItemsButton, gbc);

        JButton setInteractionTileButton = new JButton("Set Interaction Tile");
        setInteractionTileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                script.setInteractionTile(script.ctx.players.getLocal().getLocation());
                System.out.println("Registered interactionTile: " + script.getInteractionTile());
            }
        });
        gbc.gridy = 3;
        gbc.weighty = 0.1;
        generalPanel.add(setInteractionTileButton, gbc);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = script.getNpcRadioButton().isSelected() ? EntityUtils.getSelectedValue(script.getNpcPanel()) : EntityUtils.getSelectedValue(script.getObjectPanel());
                if (selectedValue != null) {
                    String[] parts = selectedValue.split(": ");
                    script.setTargetName(parts[0].split(" \\(")[0]);
                    script.setTargetId(Integer.parseInt(parts[0].split(" \\(")[1].replace(")", "")));
                    script.setAction(parts[1]);
                    script.setNpc(script.getNpcRadioButton().isSelected());
                    script.setItemsToKeep(InventoryUtils.getSelectedItems(itemsToKeepPanel));
                    frame.dispose();
                    script.setStatus("Starting interaction...");
                    script.initializeTasks();
                }
            }
        });
        gbc.gridy = 4;
        gbc.weighty = 0.1;
        generalPanel.add(startButton, gbc);

        tabbedPane.addTab("General", generalPanel);

        JPanel interactionPanel = new JPanel(new GridBagLayout());

        JLabel radiusLabel = new JLabel("Search Radius");
        radiusLabel.setFont(boldFont);
        radiusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        interactionPanel.add(radiusLabel, gbc);

        JSlider radiusSlider = new JSlider(1, 20, 10);
        radiusSlider.setMajorTickSpacing(5);
        radiusSlider.setMinorTickSpacing(1);
        radiusSlider.setPaintTicks(true);
        radiusSlider.setPaintLabels(true);
        radiusSlider.setLabelTable(EntityUtils.createCustomLabels());
        gbc.gridy = 1;
        gbc.weighty = 0.2;
        interactionPanel.add(radiusSlider, gbc);

        JLabel targetLabel = new JLabel("Target");
        targetLabel.setFont(boldFont);
        targetLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 2;
        gbc.weighty = 0.1;
        interactionPanel.add(targetLabel, gbc);

        JRadioButton npcRadioButton = new JRadioButton("NPC");
        JRadioButton objectRadioButton = new JRadioButton("Object");
        ButtonGroup group = new ButtonGroup();
        group.add(npcRadioButton);
        group.add(objectRadioButton);
        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(npcRadioButton);
        radioPanel.add(objectRadioButton);
        gbc.gridy = 3;
        gbc.weighty = 0.1;
        interactionPanel.add(radioPanel, gbc);

        JLabel npcLabel = new JLabel("NPCs");
        npcLabel.setFont(boldFont);
        npcLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 4;
        gbc.weighty = 0.1;
        interactionPanel.add(npcLabel, gbc);

        JPanel npcPanel = new JPanel();
        npcPanel.setLayout(new BoxLayout(npcPanel, BoxLayout.Y_AXIS));
        gbc.gridy = 5;
        gbc.weighty = 1.0;
        interactionPanel.add(new JScrollPane(npcPanel), gbc);

        JLabel objectLabel = new JLabel("Game Objects");
        objectLabel.setFont(boldFont);
        objectLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 6;
        gbc.weighty = 0.1;
        interactionPanel.add(objectLabel, gbc);

        JPanel objectPanel = new JPanel();
        objectPanel.setLayout(new BoxLayout(objectPanel, BoxLayout.Y_AXIS));
        gbc.gridy = 7;
        gbc.weighty = 1.0;
        interactionPanel.add(new JScrollPane(objectPanel), gbc);

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                script.setSearchRadius(radiusSlider.getValue());
                EntityUtils.populateNearbyEntities(script.ctx, script.getSearchRadius(), npcPanel, objectPanel);
            }
        });
        gbc.gridy = 8;
        gbc.weighty = 0.1;
        interactionPanel.add(refreshButton, gbc);

        tabbedPane.addTab("Interaction", interactionPanel);

        frame.add(tabbedPane, gbc);
        frame.setVisible(true);

        // Assign CLPowerSkillerGUI components to script fields
        script.setFrame(frame);
        script.setItemsToKeepPanel(itemsToKeepPanel);
        script.setNpcRadioButton(npcRadioButton);
        script.setObjectRadioButton(objectRadioButton);
        script.setNpcPanel(npcPanel);
        script.setObjectPanel(objectPanel);
        script.setRadiusSlider(radiusSlider);
    }
}