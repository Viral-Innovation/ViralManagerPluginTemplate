package com.viralinnovation.example;

import com.viralinnovation.viralmanager.api.plugins.Plugin;
import com.viralinnovation.viralmanager.api.plugins.PluginConfig;
import com.viralinnovation.viralmanager.api.plugins.Registry;
import com.viralinnovation.viralmanager.api.plugins.exceptions.PluginException;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

public final class ExamplePlugin extends Plugin {
    public ExamplePlugin(@NotNull PluginConfig pluginConfig, Logger logger) throws PluginException {
        super(pluginConfig, logger);
        logger.info("YAY! This shit works");
    }

    @Override
    public void register(Registry registry) {

    }

    @Override
    public void deregister() {

    }
}
