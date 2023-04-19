package com.training.cassandra.config.api;

import com.training.cassandra.service.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public class NonBlockingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(NonBlockingController.class);

    private ApiClient apiClient = new ApiClient();

    public static void main(String[] args) {
        NonBlockingController nonBlockingController = new NonBlockingController();
        nonBlockingController.supplyAsync("nonBlockingClient");
    }

    public CompletableFuture<String> supplyAsync(final String input) {
        LOGGER.info("Using CompletableFuture.supplyAsync(...)");
        return CompletableFuture.supplyAsync(() -> apiClient.apiCall(input));
    }
}