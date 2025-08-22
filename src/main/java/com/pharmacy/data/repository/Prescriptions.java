package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prescriptions {
    static List<Prescription> prescriptions = new ArrayList<>();

    public int getCount() {
        return prescriptions.size();
    }

    public void savePrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public void viewPrescriptions(){
        for(Prescription prescription : prescriptions){
            System.out.println(prescription);
        }
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
