package com.goof;

import com.goof.defaults.Controller;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.logging.log4j.Logger;
import org.goof.LoggingApi;

import java.util.ArrayList;
import java.util.List;

/**
 * A default dropwizard application
 * @param <Configuration> Given configuration type
 */
class DefaultApplication<Configuration extends io.dropwizard.Configuration> extends Application<Configuration> {
    protected final Logger LOGGER = LoggingApi.getLogger(DefaultApplication.class);
    private final List<Controller> controllers;

    public DefaultApplication(List<Controller> controllers) {
        this.controllers = new ArrayList<>(controllers);
    }

    @Override
    public void initialize(Bootstrap<Configuration> b) {
        LOGGER.info("Initializing app");
    }

    @Override
    public void run(Configuration configuration, Environment environment) {

        controllers.forEach((Controller controller) -> {
            LOGGER.info("Registering controller {}", controller);
            environment.jersey().register(controller);
        });
    }
}