package com.pharmacy.exceptions;

public class InvalidPasswordLengthException extends PharmacyException {
    public InvalidPasswordLengthException(String message) {
        super(message);
    }
}
