package com.pharmacy.utils;

import com.pharmacy.exceptions.InvalidDrugQuantityException;
import com.pharmacy.exceptions.InvalidPatientIdentityException;

public class Validator {

    public static void validateQuantity(int quantity) {
        if (quantity <= 0)
            throw new InvalidDrugQuantityException("Drug quantity must be greater than 0");
    }

    public static void validatePatientID(int patientID) {
        if (patientID <= 0) throw new InvalidPatientIdentityException("Invalid patient ID");
    }
}
