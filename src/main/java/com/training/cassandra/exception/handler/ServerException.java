package com.training.cassandra.exception.handler;

public class ServerException extends RuntimeException{
    private String message;

    public ServerException(String message) {
        super(message);
        this.message = message;
    }
}