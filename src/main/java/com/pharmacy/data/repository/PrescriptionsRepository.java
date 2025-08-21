package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionsRepository {
    private final List<Prescription> prescriptions = new ArrayList<>();

    public long count() {
        return prescriptions.size();
    }

    public Prescription save(Prescription prescription) {
        if (isNew(prescription)) saveNew(prescription);
        else update(prescription);
        return prescription;
    }

    private void update(Prescription prescription) {
        prescriptions.remove(prescription);
        prescriptions.add(prescription);

    }

    private void saveNew(Prescription prescription) {
        prescription.setCode(generatePrescriptionCode());
        prescription.add(prescription);
    }

    private String generatePrescriptionCode() {
        return "Code generated";

    }

    private boolean isNew(Prescription prescription) {
        return prescription.getPatientID() == 0;
    }
}
