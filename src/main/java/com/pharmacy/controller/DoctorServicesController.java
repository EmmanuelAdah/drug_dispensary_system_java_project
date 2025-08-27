package com.pharmacy.controller;


import com.pharmacy.data.models.Prescription;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.request.AddUserRequest;
import com.pharmacy.dtos.request.CancelPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import com.pharmacy.dtos.responses.AddUserResponse;
import com.pharmacy.dtos.responses.CancelPrescriptionResponse;
import com.pharmacy.services.DoctorServices;

import java.util.List;

public class DoctorServicesController {
    DoctorServices doctorServices = new DoctorServices();

    public AddPrescriptionResponse recordNewPrescription(AddPrescriptionRequest addPrescriptionRequest) {
        return doctorServices.addPrescription(addPrescriptionRequest);
    }

    public List<Prescription> viewAvailablePrescriptions(){
        return doctorServices.viewPrescriptions();
    }

    public CancelPrescriptionResponse cancelPrescription(CancelPrescriptionRequest cancelPrescriptionRequest){
        return doctorServices.cancelPrescription(cancelPrescriptionRequest);
    }
}
