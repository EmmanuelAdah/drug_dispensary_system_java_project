package com.pharmacy.exceptions;

public class InvalidDrugQuantityException extends DrugException {
    public InvalidDrugQuantityException(String message) {
        super(message);
    }
}
