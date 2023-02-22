package com.entertainment;
/*
 * Application-specific checked exception;
 */
public class InvalidBrandException extends Exception{

    public InvalidBrandException() {}

    public InvalidBrandException(String message) {
        super(message);
    }

    public InvalidBrandException(Throwable cause) {
        super(cause);
    }

    public InvalidBrandException(String message, Throwable cause) {
        super(message, cause);
    }
}