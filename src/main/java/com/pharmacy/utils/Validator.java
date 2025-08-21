package com.pharmacy.utils;

import com.pharmacy.data.models.Drug;
import com.pharmacy.exceptions.InvalidDrugQuantityException;

public class Validator {

    public static void validate(Drug drug) {
        if (drug.getQuantity() <= 0)
            throw new InvalidDrugQuantityException("Drug quantity must be greater than 0");
    }
}
