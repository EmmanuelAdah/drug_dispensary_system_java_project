package com.pharmacy.utils;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;

public class Mapper {

    public static Prescription map(AddPrescriptionRequest addPrescriptionRequest) {
        Prescription prescription = new Prescription();
        prescription.setPatientID(addPrescriptionRequest.getPatientID());
        prescription.setDiagnosis(addPrescriptionRequest.getDiagnosis());
        prescription.setDrug(addPrescriptionRequest.getDrug());
        prescription.setDosage(addPrescriptionRequest.getDosage());
        prescription.setQuantity(addPrescriptionRequest.getQuantity());
        return prescription;
    }

    public static AddPrescriptionResponse map(Prescription prescription) {
        AddPrescriptionResponse addPrescriptionResponse = new AddPrescriptionResponse();
        addPrescriptionResponse.setPatientID(prescription.getPatientID());
        addPrescriptionResponse.setDrug(prescription.getDrugs());
        addPrescriptionResponse.setDosage(prescription.getDosage());
        addPrescriptionResponse.setQuantity(prescription.getQuantity());
        return addPrescriptionResponse;
    }
}
