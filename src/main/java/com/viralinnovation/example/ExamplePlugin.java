package com.viralinnovation.example;

import com.viralinnovation.viralmanager.api.Plugin;
import com.viralinnovation.viralmanager.api.PluginConfig;
import com.viralinnovation.viralmanager.api.Registry;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

public final class ExamplePlugin extends Plugin {
    public ExamplePlugin(@NotNull PluginConfig pluginConfig, Logger logger, Registry registry) {
        super(pluginConfig, logger, registry);
        System.out.println("I got called");
        logger.info("YAY! This shit works");
    }

    @Override
    public void register(Registry registry) {

    }

    @Override
    public void deregister(Registry registry) {

    }
}
