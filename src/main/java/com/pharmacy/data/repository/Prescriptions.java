package com.pharmacy.data.repository;

import com.pharmacy.data.models.Prescription;
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

    public void clearList() {
        prescriptions.clear();
    }
}
