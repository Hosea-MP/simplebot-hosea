package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.runelite.api.coords.WorldPoint;
import simple.robot.api.ClientContext;

public class TestGUI extends JFrame implements ActionListener {

    private final JComboBox<String> selector;
    private final JTextField nameField;
    private final JTextField interactionTextField;
    private final JTextField itemsToKeepField;
    private final JRadioButton bankingRadioButton;
    private final JRadioButton droppingRadioButton;
    private final JButton startButton;
    private final JButton closeButton;
    private final JButton setStartingTileButton;
    private final TestScript script;
    private final ClientContext ctx;

    public TestGUI(TestScript script, ClientContext ctx) {
        this.script = script;
        this.ctx = ctx;

        setTitle("Test Script GUI");
        setLayout(new GridBagLayout());
        setSize(400, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Selector
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(new JLabel("Select Type:"), constraints);

        selector = new JComboBox<>(new String[]{"Game Object", "NPC"});
        selector.addActionListener(this);
        constraints.gridx = 1;
        add(selector, constraints);

        // Name Input
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(new JLabel("Name:"), constraints);

        nameField = new JTextField(20);
        constraints.gridx = 1;
        add(nameField, constraints);

        // Interaction Text Input
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(new JLabel("Interaction Text:"), constraints);

        interactionTextField = new JTextField(20);
        constraints.gridx = 1;
        add(interactionTextField, constraints);

        // Items to Keep Input
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(new JLabel("Items to Keep (IDs or Names):"), constraints);

        itemsToKeepField = new JTextField(20);
        constraints.gridx = 1;
        add(itemsToKeepField, constraints);

        // Banking or Dropping Selection
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(new JLabel("Select Action:"), constraints);

        bankingRadioButton = new JRadioButton("Banking", true);
        droppingRadioButton = new JRadioButton("Dropping");
        ButtonGroup group = new ButtonGroup();
        group.add(bankingRadioButton);
        group.add(droppingRadioButton);

        JPanel radioPanel = new JPanel(new GridLayout(1, 2));
        radioPanel.add(bankingRadioButton);
        radioPanel.add(droppingRadioButton);

        constraints.gridx = 1;
        add(radioPanel, constraints);

        // Set Starting Tile Button
        setStartingTileButton = new JButton("Set Starting Tile");
        setStartingTileButton.addActionListener(this);
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        add(setStartingTileButton, constraints);

        // Start Button
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        constraints.gridy = 6;
        add(startButton, constraints);

        // Close Button
        closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        constraints.gridy = 7;
        add(closeButton, constraints);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            String name = nameField.getText().trim();
            String interactionText = interactionTextField.getText().trim();
            String itemsToKeep = itemsToKeepField.getText().trim();
            boolean bankingEnabled = bankingRadioButton.isSelected();

            script.setItemsToKeep(itemsToKeep);
            script.setBankingEnabled(bankingEnabled);

            if (selector.getSelectedItem().equals("Game Object")) {
                script.interactWithNearestGameObject(name, interactionText);
            } else {
                script.interactWithNearestNPC(name, interactionText);
            }

            script.handleInventory();
        } else if (e.getSource() == setStartingTileButton) {
            WorldPoint currentTile = ctx.players.getLocal().getLocation();
            script.setStartingTile(currentTile);
            JOptionPane.showMessageDialog(this, "Starting tile set to: " + currentTile, "Tile Set", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}