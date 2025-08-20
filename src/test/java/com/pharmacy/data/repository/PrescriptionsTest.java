package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrescriptionsTest {
    Prescriptions prescriptions;

    @BeforeEach
    void setUp(){
        prescriptions = new Prescriptions();
    }

    @AfterEach
    void tearDown(){
        prescriptions.clearList();
    }

    @Test
    void prescriptionsListIsEmptyTest(){
        assertEquals(0, prescriptions.getCount());
    }

    @Test
    void prescriptionsListIsNotEmpty(){
        Prescription prescription = new Prescription();
        Drug drug = new Drug();
        drug.setId(12L);
        drug.setName("Panadol");
        drug.setCategory("Antibiotic");

        prescription.setPatientID(1L);
        prescription.setDrug(drug);
        prescription.setDosage("200ml");
        prescription.setQuantity(3);
        prescriptions.savePrescription(prescription);
        assertEquals(1, prescriptions.getCount());
    }
}