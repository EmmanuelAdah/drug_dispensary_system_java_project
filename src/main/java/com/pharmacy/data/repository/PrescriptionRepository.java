package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PrescriptionRepository {
    private static final List<Prescription> prescriptions = new ArrayList<>();

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

    public static String generatePrescriptionCode() {
        Random random = new Random();
        int number = 100 + random.nextInt(900); // gives 100 - 999
        return "PR" + number;
    }


    private boolean isNew(Prescription prescription) {
        return prescription.getPatientID() == 0;
    }

    public static Prescription findByCode(String prescriptionCode) {
        for (Prescription prescription : prescriptions) {
            if (prescription.getCode().equals(prescriptionCode)) return prescription;
        }
        return null;
    }

}
