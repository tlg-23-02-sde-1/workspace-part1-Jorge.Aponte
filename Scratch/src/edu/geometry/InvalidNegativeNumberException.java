package edu.geometry;

public class InvalidNegativeNumberException extends Exception {
    public InvalidNegativeNumberException() {
    }

    public InvalidNegativeNumberException(String message) {
        super(message);
    }

    public InvalidNegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNegativeNumberException(Throwable cause) {
        super(cause);
    }
}