package com.pharmacy.exceptions;

public class InvalidPatientIdentityException extends PharmacyException {
    public InvalidPatientIdentityException(String message) {
        super(message);
    }
}
