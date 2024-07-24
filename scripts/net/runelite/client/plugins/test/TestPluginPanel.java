package net.runelite.client.plugins.test;

import com.test.TestScript;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPluginPanel extends PluginPanel {
    private JComboBox<String> typeComboBox;
    private JTextField idField;
    private JTextField nameField;
    private JTextField interactionTextField;
    private JButton startButton;
    private JLabel errorLabel;

    public TestPluginPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Type selection
        add(new JLabel("Select Type:"));
        typeComboBox = new JComboBox<>(new String[]{"NPC", "Game Object"});
        add(typeComboBox);

        // ID input
        add(new JLabel("ID:"));
        idField = new JTextField();
        add(idField);

        // Name input
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        // Interaction Text input
        add(new JLabel("Interaction Text:"));
        interactionTextField = new JTextField();
        add(interactionTextField);

        // Error label
        errorLabel = new JLabel("");
        errorLabel.setForeground(Color.RED);
        add(errorLabel);

        // Start button
        startButton = new JButton("Start");
        add(startButton);

        // Add action listener to the start button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onStartButtonClicked();
            }
        });
    }

    private void onStartButtonClicked() {
        String type = (String) typeComboBox.getSelectedItem();
        String id = idField.getText();
        String name = nameField.getText();
        String interactionText = interactionTextField.getText();

        // Validate inputs
        if ((id.isEmpty() && name.isEmpty()) || (!id.isEmpty() && !name.isEmpty())) {
            errorLabel.setText("Please enter either ID or Name, not both.");
            return;
        }

        if (interactionText.isEmpty()) {
            errorLabel.setText("Interaction Text cannot be empty.");
            return;
        }

        // Clear error message
        errorLabel.setText("");

        // Pass the inputs to the script
        TestScript.setUserInputs(type, id, name, interactionText);

        // Start the script
        TestScript.startScript();
    }
}