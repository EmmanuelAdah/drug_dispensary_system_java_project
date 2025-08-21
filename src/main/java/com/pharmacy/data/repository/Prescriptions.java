package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import java.util.ArrayList;
import java.util.List;

public class Prescriptions {
    static List<Prescription> prescriptions = new ArrayList<>();

    public int getCount() {
        return prescriptions.size();
    }

    public void savePrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public void cancelPrescription(Prescription prescription) {
        for (Prescription p : prescriptions) {
            if (p.getPatientID() == prescription.getPatientID() &&
                    p.getPrescriptionID() == prescription.getPrescriptionID()) {
                p.setStatus(Status.CANCELLED);
            }
        }
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }
}
