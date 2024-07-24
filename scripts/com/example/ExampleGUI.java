package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleGUI extends JFrame {
    private JComboBox<String> targetTypeComboBox;
    private JTextField targetNameField;
    private JTextField interactionTextField;
    private JButton submitButton;
    private boolean submitted = false;

    public ExampleGUI() {
        setTitle("Interact Task Settings");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Target Type:"));
        targetTypeComboBox = new JComboBox<>(new String[]{"NPC", "Object"});
        add(targetTypeComboBox);

        add(new JLabel("Target Name:"));
        targetNameField = new JTextField();
        add(targetNameField);

        add(new JLabel("Interaction Text:"));
        interactionTextField = new JTextField();
        add(interactionTextField);

        submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitted = true;
                dispose();
            }
        });
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public String getTargetType() {
        return (String) targetTypeComboBox.getSelectedItem();
    }

    public String getTargetName() {
        return targetNameField.getText();
    }

    public String getInteractionText() {
        return interactionTextField.getText();
    }
}