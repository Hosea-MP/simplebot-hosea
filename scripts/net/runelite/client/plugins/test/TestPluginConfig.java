package net.runelite.client.plugins.test;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("testplugin")
public interface TestPluginConfig extends Config {

    @ConfigItem(
            keyName = "type",
            name = "Type",
            description = "Type of the NPC"
    )
    default String type() {
        return "";
    }

    @ConfigItem(
            keyName = "id",
            name = "ID",
            description = "ID of the NPC"
    )
    default String id() {
        return "";
    }

    @ConfigItem(
            keyName = "name",
            name = "Name",
            description = "Name of the NPC"
    )
    default String name() {
        return "";
    }

    @ConfigItem(
            keyName = "interactionText",
            name = "Interaction Text",
            description = "Text for interaction with the NPC"
    )
    default String interactionText() {
        return "";
    }
}