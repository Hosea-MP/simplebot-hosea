package rScripts.allInOne.utils;

import simple.robot.api.ClientContext;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EntityUtils {

    public static void populateNearbyEntities(ClientContext ctx, int searchRadius, JPanel npcPanel, JPanel objectPanel) {
        npcPanel.removeAll();
        objectPanel.removeAll();

        List<String> npcs = ctx.npcs.populate().filterWithin(searchRadius).toStream()
                .filter(npc -> npc != null && npc.getName() != null)
                .flatMap(npc -> {
                    String[] actions = npc.getNpcDefinitions().getActions();
                    return actions != null ?
                            Arrays.stream(actions)
                                    .filter(action -> action != null && !action.isEmpty())
                                    .map(action -> npc.getName() + " (" + npc.getId() + "): " + action)
                            : Stream.empty();
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
                            Arrays.stream(actions)
                                    .filter(action -> action != null && !action.isEmpty())
                                    .map(action -> obj.getName() + " (" + obj.getId() + "): " + action)
                            : Stream.empty();
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

    public static String getSelectedValue(JPanel panel) {
        for (Component component : panel.getComponents()) {
            if (component instanceof JCheckBox && ((JCheckBox) component).isSelected()) {
                return ((JCheckBox) component).getText();
            }
        }
        return null;
    }

    public static Dictionary<Integer, JLabel> createCustomLabels() {
        Dictionary<Integer, JLabel> labels = new Hashtable<>();
        labels.put(1, new JLabel("1"));
        labels.put(5, new JLabel("5"));
        labels.put(10, new JLabel("10"));
        labels.put(15, new JLabel("15"));
        labels.put(20, new JLabel("20"));
        return labels;
    }
}