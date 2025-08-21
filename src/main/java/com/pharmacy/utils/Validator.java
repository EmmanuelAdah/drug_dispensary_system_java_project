package com.pharmacy.utils;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.exceptions.InvalidDrugQuantityException;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public static void validate(AddPrescriptionRequest addPrescriptionRequest) {
        if (addPrescriptionRequest.getQuantity() <= 0)
            throw new InvalidDrugQuantityException("Drug quantity must be greater than 0");
    }

    public static List<Drug> validateDrugs(Prescription prescription) {
        List<Drug> drugs = new ArrayList<>();
        for (Drug drug : prescription.getDrugs()) {
            
        }
    }
}
