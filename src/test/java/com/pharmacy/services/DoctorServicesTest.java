package com.pharmacy.services;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Type;
import com.pharmacy.data.repository.Prescriptions;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.exceptions.InvalidDrugQuantityException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoctorServicesTest {
    DoctorServices doctorServices;

    @BeforeEach
    void setUp() {
        doctorServices = new DoctorServices();
    }

    @AfterEach
    void tearDown() {
        Prescriptions prescriptions = new Prescriptions();
        prescriptions.getPrescriptions().clear();
    }

    @Test
    void addPrescriptionRequest_WithValidQuantityTest() {
        List<Drug> drugs = new ArrayList<>();
        Prescriptions prescriptions = new Prescriptions();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);
        drugs.add(drug);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12L);
        addPrescriptionRequest.setDrug(drugs);
        addPrescriptionRequest.setDosage("200ml");
        addPrescriptionRequest.setQuantity(3);
        doctorServices.addPrescription(addPrescriptionRequest);
        assertEquals(1, prescriptions.getCount());
    }

    @Test
    void addPrescriptionRequest_WithInvalidQuantityTest() {
        Prescriptions prescriptions = new Prescriptions();
        List<Drug> drugs = new ArrayList<>();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);
        drugs.add(drug);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12L);
        addPrescriptionRequest.setDrug(drugs);
        addPrescriptionRequest.setDosage("200ml");
        addPrescriptionRequest.setQuantity(0);
        assertThrows(InvalidDrugQuantityException.class, () -> doctorServices.addPrescription(addPrescriptionRequest));
    }

    @Test
    void deletePrescriptionRequestTest() {
        Prescriptions prescriptions = new Prescriptions();
        List<Drug> drugs = new ArrayList<>();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);
        drugs.add(drug);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12L);
        addPrescriptionRequest.setDrug(drugs);
        addPrescriptionRequest.setDosage("200ml");
        addPrescriptionRequest.setQuantity(3);
        doctorServices.addPrescription(addPrescriptionRequest);


        doctorServices.deletePrescription(addPrescriptionRequest);
        assertEquals(0, prescriptions.getCount());
    }
}