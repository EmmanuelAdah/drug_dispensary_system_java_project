package com.pharmacy.services;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.repository.Prescriptions;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import static com.pharmacy.utils.Mapper.map;

public class DoctorServices {
    private final Prescriptions prescriptions = new Prescriptions();

    public AddPrescriptionResponse addPrescription(AddPrescriptionRequest addPrescriptionRequest) {
        Prescription prescription = map(addPrescriptionRequest);
        prescriptions.savePrescription(prescription);
        AddPrescriptionResponse addPrescriptionResponse = map(prescription);
        return addPrescriptionResponse;
    }
}
