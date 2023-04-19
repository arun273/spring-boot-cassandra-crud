package com.training.cassandra.service;

public class ApiClient {
    private ExternalResource resource = new ExternalResource();

    public String apiCall(final String input) {
        return resource.slowHelloWorld(input);
    }
}