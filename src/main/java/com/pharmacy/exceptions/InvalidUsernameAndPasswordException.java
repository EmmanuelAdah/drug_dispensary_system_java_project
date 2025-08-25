package com.pharmacy.exceptions;

public class InvalidUsernameAndPasswordException extends PharmacyException {
    public InvalidUsernameAndPasswordException(String message) {
        super(message);
    }
}
