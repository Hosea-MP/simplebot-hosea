package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestScriptGUI extends JFrame {

    private JTextField typeField;
    private JTextField idField;
    private JTextField nameField;
    private JTextField interactionTextField;
    private JButton startButton;

    public TestScriptGUI() {
        setTitle("Test Script GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Create and add components
        add(new JLabel("Type:"));
        typeField = new JTextField();
        add(typeField);

        add(new JLabel("ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Interaction Text:"));
        interactionTextField = new JTextField();
        add(interactionTextField);

        startButton = new JButton("Start Script");
        add(startButton);

        // Add action listener to the button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user inputs
                String type = typeField.getText();
                String id = idField.getText();
                String name = nameField.getText();
                String interactionText = interactionTextField.getText();

                // Set user inputs to the script
                TestScript.setUserInputs(type, id, name, interactionText);

                // Start the script
                TestScript.startScript();
            }
        });
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestScriptGUI().setVisible(true);
            }
        });
    }
}