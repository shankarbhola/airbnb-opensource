package com.airbnb.exception;

public class InvalidToken extends RuntimeException{
    public InvalidToken(String message) {
        super(message);
    }
}