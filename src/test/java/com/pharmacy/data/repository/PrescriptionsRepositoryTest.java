package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrescriptionsRepositoryTest {
    PrescriptionsRepository prescriptionsRepository;

    @BeforeEach
    void setUp(){
        prescriptionsRepository = new PrescriptionsRepository();
    }

    @AfterEach
    void tearDown(){
        prescriptionsRepository.getPrescriptions().clear();
    }

    @Test
    void prescriptionsListIsEmptyTest(){
        assertEquals(0, prescriptionsRepository.getCount());
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
        drug1.setDosage("200ml");
        drug1.setQuantity(3);
        drugs.add(drug1);

        prescription.setPatientID(1);
        prescription.setDrugs(drugs);
        prescriptionsRepository.savePrescription(prescription);
        assertEquals(1, prescriptionsRepository.getCount());
    }
}