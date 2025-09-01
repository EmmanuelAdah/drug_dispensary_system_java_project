package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrescriptionsRepository {
    private static final List<Prescription> prescriptions = new ArrayList<>();

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public static Prescription findByCode(String prescriptionCode) {
        for (Prescription prescription : prescriptions) {
            if (prescription.getPrescriptionCode().equals(prescriptionCode)) return prescription;
        }
        return null;
    }

    public void cancelPrescription(Prescription prescription) {
        for (Prescription prescribed : getPrescriptions()) {
            if (prescribed.getPatientID() == prescription.getPatientID() &&
                    Objects.equals(prescribed.getPrescriptionCode(), prescription.getPrescriptionCode())) {
                prescribed.setStatus(Status.CANCELLED);
            }
        }
    }

    private void update(Prescription prescription) {
        prescriptions.remove(prescription);
        prescriptions.add(prescription);
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public long getCount() {
        return prescriptions.size();
    }
}
