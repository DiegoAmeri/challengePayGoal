package com.challenge.payGoal;

public class NotFoundException extends RuntimeException{
    private static final String message = "error";

    public NotFoundException() {
        super(message);
    }
}
