package net.runelite.client.plugins.test;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import com.test.TestScript;

import javax.inject.Inject;

@PluginDescriptor(
        name = "Test Plugin",
        description = "A plugin to start the TestScript",
        tags = {"test", "script"}
)
public class TestPlugin extends Plugin {

    @Inject
    private ConfigManager configManager;

    @Inject
    private TestPluginConfig config;

    @Provides
    TestPluginConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(TestPluginConfig.class);
    }

    @Override
    protected void startUp() throws Exception {
        // Set the user inputs from the config to the TestScript
        TestScript.setUserInputs(
                config.type(),
                config.id(),
                config.name(),
                config.interactionText()
        );
        // Start the script
        TestScript.startScript();
    }

    @Override
    protected void shutDown() throws Exception {
        // Logic to stop the script if needed
    }
}