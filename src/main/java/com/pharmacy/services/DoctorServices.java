package com.pharmacy.services;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.repository.Prescriptions;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.request.CancelPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import com.pharmacy.dtos.responses.CancelPrescriptionResponse;

import static com.pharmacy.utils.Mapper.map;
import static com.pharmacy.utils.Mapper.mapper;
import static com.pharmacy.utils.Validator.validate;

public class DoctorServices {
    private final Prescriptions prescriptions = new Prescriptions();

    public AddPrescriptionResponse addPrescription(AddPrescriptionRequest addPrescriptionRequest) {
        validate(addPrescriptionRequest);
        Prescription prescription = map(addPrescriptionRequest);
        prescriptions.savePrescription(prescription);
        AddPrescriptionResponse addPrescriptionResponse = map(prescription);
        return addPrescriptionResponse;
    }

    public CancelPrescriptionResponse cancelPrescription(CancelPrescriptionRequest cancelPrescriptionRequest){
        Prescription prescription = mapper(cancelPrescriptionRequest);
        prescriptions.cancelPrescription(prescription);
        return mapper(prescription);
    }
}