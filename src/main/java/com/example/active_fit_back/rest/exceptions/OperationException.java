package com.example.active_fit_back.rest.exceptions;

public class OperationException extends RuntimeException{

    public OperationException(String message) {
        super(message);
    }

    public OperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
