package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrescriptionsTest {
    Prescriptions prescriptions;

    @BeforeEach
    void setUp(){
        prescriptions = new Prescriptions();
    }

    @AfterEach
    void tearDown(){
        prescriptions.getPrescriptions().clear();
    }

    @Test
    void prescriptionsListIsEmptyTest(){
        assertEquals(0, prescriptions.getCount());
    }

    @Test
    void prescriptionsListIsNotEmpty(){
        Prescription prescription = new Prescription();
        Drug drug = new Drug();
        List<Drug> drugs = new ArrayList<>();
        drug.setId(12L);
        drug.setName("Panadol");
        drugs.add(drug);

        Drug drug1 = new Drug();
        drug1.setId(12L);
        drug1.setName("Panadol");
        drugs.add(drug1);

        prescription.setPatientID(1L);
        prescription.setDrug(drugs);
        prescription.setDosage("200ml");
        prescription.setQuantity(3);
        prescriptions.savePrescription(prescription);
        assertEquals(1, prescriptions.getCount());
    }
}