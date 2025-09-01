package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrescriptionsRepository {
    static List<Prescription> prescriptions = new ArrayList<>();

    public int getCount() {
        return prescriptions.size();
    }

    public void savePrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public List<Prescription> viewPrescriptions(){
        return prescriptions;
    }

    private void update(Prescription prescription) {
        prescriptions.remove(prescription);
        prescriptions.add(prescription);
    }

    public Prescription findByCode(String code) {
        for (Prescription prescription : prescriptions) {
            if (Objects.equals(prescription.getPrescriptionCode(), code)) return prescription;
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

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }
}
