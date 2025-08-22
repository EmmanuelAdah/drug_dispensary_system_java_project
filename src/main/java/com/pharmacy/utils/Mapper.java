package com.pharmacy.utils;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.request.CancelPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import com.pharmacy.dtos.responses.CancelPrescriptionResponse;
import java.util.ArrayList;
import java.util.List;
import static com.pharmacy.utils.Validator.validate;

public class Mapper {

    public static Prescription map(AddPrescriptionRequest addPrescriptionRequest) {
        Prescription prescription = new Prescription();
        prescription.setPatientID(addPrescriptionRequest.getPatientID());
        prescription.setPrescriptionCode(CodeGenerator.generatePrescriptionCode());
        prescription.setDiagnosis(addPrescriptionRequest.getDiagnosis());
        prescription.setDrugs(mapDrugs(addPrescriptionRequest.getDrugs()));
        return prescription;
    }

    public static List<Drug> mapDrugs(List<Drug> prescription) {
        List<Drug> drugs = new ArrayList<>();
        for (Drug prescribed : prescription) {
            Drug drug = new Drug();
            drug.setId(prescribed.getId());
            drug.setName(prescribed.getName());
            validate(prescribed);
            drug.setQuantity(prescribed.getQuantity());
            drugs.add(drug);
        }
        return drugs;
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
        prescription.setPrescriptionCode(cancelPrescriptionRequest.getPrescriptionCode());
        prescription.setStatus(Status.CANCELLED);
        return prescription;
    }

    public static CancelPrescriptionResponse mapper(Prescription prescription){
        CancelPrescriptionResponse response = new CancelPrescriptionResponse();
        response.setPatientId(prescription.getPatientID());
        response.setPrescriptionCode(prescription.getPrescriptionCode());
        response.setStatus(Status.CANCELLED);
        return response;
    }
}
