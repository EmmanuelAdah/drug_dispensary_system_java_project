package com.pharmacy.utils;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.request.CancelPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import com.pharmacy.dtos.responses.CancelPrescriptionResponse;

public class Mapper {

    public static Prescription map(AddPrescriptionRequest addPrescriptionRequest) {
        Prescription prescription = new Prescription();
        prescription.setPatientID(addPrescriptionRequest.getPatientID());
        prescription.setPrescriptionID(prescription.getPrescriptionID());
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

    public static Prescription mapper(CancelPrescriptionRequest cancelPrescriptionRequest){
        Prescription prescription = new Prescription();
        prescription.setPatientID(cancelPrescriptionRequest.getPatientID());
        prescription.setPrescriptionID(cancelPrescriptionRequest.getPrescriptionID());
        prescription.setStatus(Status.CANCELLED);
        return prescription;
    }

    public static CancelPrescriptionResponse mapper(Prescription prescription){
        CancelPrescriptionResponse response = new CancelPrescriptionResponse();
        response.setPatientId(prescription.getPatientID());
        response.setPrescriptionId(prescription.getPrescriptionID());
        response.setStatus(Status.CANCELLED);
        return response;
    }
}
