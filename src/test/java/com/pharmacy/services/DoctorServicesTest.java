package com.pharmacy.services;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Type;
import com.pharmacy.data.repository.PrescriptionsRepository;
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
        PrescriptionsRepository prescriptionsRepository = new PrescriptionsRepository();
        prescriptionsRepository.getPrescriptions().clear();
    }

    @Test
    void addPrescriptionRequest_WithValidQuantityTest() {
        List<Drug> drugs = new ArrayList<>();
        PrescriptionsRepository prescriptionsRepository = new PrescriptionsRepository();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);
        drug.setDosage("200ml");
        drug.setQuantity(3);
        drugs.add(drug);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12);
        addPrescriptionRequest.setDrugs(drugs);
        doctorServices.addPrescription(addPrescriptionRequest);
        assertEquals(1, prescriptionsRepository.getCount());
    }

    @Test
    void addPrescriptionRequest_WithInvalidQuantityTest() {
        PrescriptionsRepository prescriptionsRepository = new PrescriptionsRepository();
        List<Drug> drugs = new ArrayList<>();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);
        drugs.add(drug);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12);
        addPrescriptionRequest.setDrugs(drugs);
        addPrescriptionRequest.setDosage("200ml");
        addPrescriptionRequest.setQuantity(0);
        assertThrows(InvalidDrugQuantityException.class, () -> doctorServices.addPrescription(addPrescriptionRequest));
    }

    @Test
    void cancelPrescriptionRequestTest() {
        PrescriptionsRepository prescriptionsRepository = new PrescriptionsRepository();
        List<Drug> drugs = new ArrayList<>();
        Drug drug = new Drug();
        drug.setName("Panadol");
        drug.setType(Type.PAINKILLER);
        drug.setDosage("200ml");
        drug.setQuantity(3);
        drugs.add(drug);

        AddPrescriptionRequest addPrescriptionRequest = new AddPrescriptionRequest();
        addPrescriptionRequest.setPatientID(12);
        addPrescriptionRequest.setDrugs(drugs);

        doctorServices.addPrescription(addPrescriptionRequest);
        assertEquals(1, prescriptionsRepository.getCount());
    }
}