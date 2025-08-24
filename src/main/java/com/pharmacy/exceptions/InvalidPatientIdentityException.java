package com.pharmacy.exceptions;

public class InvalidPatientIdentityException extends DrugException {
    public InvalidPatientIdentityException(String message) {
        super(message);
    }
}
