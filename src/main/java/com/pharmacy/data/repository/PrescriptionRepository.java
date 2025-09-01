package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;

import java.util.ArrayList;
import java.util.List;


public class PrescriptionRepository {
    private static final List<Prescription> prescriptions = new ArrayList<>();

    private void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public static Prescription findByCode(String prescriptionCode) {
        for (Prescription prescription : prescriptions) {
            if (prescription.getPrescriptionCode().equals(prescriptionCode)) return prescription;
        }
        return null;
    }

    private void update(Prescription prescription) {
        prescriptions.remove(prescription);
        prescriptions.add(prescription);
    }

    private boolean isNew(Prescription prescription) {
        return prescription.getPatientID() == 0;
    }

    public long count() {
        return prescriptions.size();
    }
}
