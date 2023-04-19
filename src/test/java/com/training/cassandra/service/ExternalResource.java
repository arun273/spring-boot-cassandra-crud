package com.training.cassandra.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ExternalResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExternalResource.class);


    public String slowHelloWorld(final String input) {
        try {
            LOGGER.info("Do long running task...");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LOGGER.debug("...long running task done!");
        return "Hello " + input;
    }
}