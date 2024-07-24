package net.runelite.client.plugins;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.test.TestPluginConfig;
import net.runelite.client.plugins.test.TestPluginPanel;
import net.runelite.client.ui.PluginPanel;

import javax.inject.Inject;

@PluginDescriptor(
        name = "Test Plugin",
        description = "A plugin to start the TestScript",
        tags = {"test", "script"}
)
public class TestPlugin extends Plugin {

    private TestPluginPanel panel;

    @Inject
    private ConfigManager configManager;

    @Provides
    TestPluginConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(TestPluginConfig.class);
    }

    @Override
    protected void startUp() throws Exception {
        panel = new TestPluginPanel();
        getPluginPanel().add(panel);
    }

    @Override
    protected void shutDown() throws Exception {
        getPluginPanel().remove(panel);
    }

    public PluginPanel getPluginPanel() {
        return panel;
    }
}