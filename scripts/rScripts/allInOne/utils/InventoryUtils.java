package rScripts.allInOne.utils;

import simple.hooks.wrappers.SimpleItem;
import simple.robot.api.ClientContext;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InventoryUtils {

    public static void populateInventoryItems(ClientContext ctx, JPanel itemsToKeepPanel) {
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

    public static List<String> getSelectedItems(JPanel itemsToKeepPanel) {
        List<String> selectedItems = new java.util.ArrayList<>();
        for (Component component : itemsToKeepPanel.getComponents()) {
            if (component instanceof JCheckBox && ((JCheckBox) component).isSelected()) {
                selectedItems.add(((JCheckBox) component).getText());
            }
        }
        return selectedItems;
    }
}