package com.pharmacy.services;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.repository.PrescriptionsRepository;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.request.CancelPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import com.pharmacy.dtos.responses.CancelPrescriptionResponse;
import java.util.List;
import static com.pharmacy.utils.Mapper.map;
import static com.pharmacy.utils.Mapper.mapper;

public class DoctorServices {
    private static final PrescriptionsRepository prescriptionsRepository = new PrescriptionsRepository();

    public AddPrescriptionResponse addPrescription(AddPrescriptionRequest addPrescriptionRequest) {
        Prescription prescription = map(addPrescriptionRequest);
        prescriptionsRepository.savePrescription(prescription);
        return map(prescription);
    }

    public List<Prescription> viewPrescriptions(){
        return prescriptionsRepository.viewPrescriptions();
    }

    public CancelPrescriptionResponse cancelPrescription(CancelPrescriptionRequest cancelPrescriptionRequest){
        Prescription prescription = mapper(cancelPrescriptionRequest);
        prescriptionsRepository.cancelPrescription(prescription);
        return mapper(prescription);
    }
}