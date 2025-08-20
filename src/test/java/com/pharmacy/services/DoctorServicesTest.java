package com.pharmacy.services;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Type;
import com.pharmacy.data.repository.Prescriptions;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorServicesTest {
    DoctorServices doctorServices;

    @BeforeEach
    void setUp() {
        doctorServices = new DoctorServices();
    }

    @Test
    void addPrescriptionRequestTest() {
        Prescriptions prescriptions = new Prescriptions();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12L);
        addPrescriptionRequest.setDrug(drug);
        addPrescriptionRequest.setDosage("200ml");
        addPrescriptionRequest.setQuantity(3);
        doctorServices.addPrescription(addPrescriptionRequest);
        assertEquals(1, prescriptions.getCount());
    }

}