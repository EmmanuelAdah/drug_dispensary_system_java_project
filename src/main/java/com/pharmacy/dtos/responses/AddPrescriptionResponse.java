package com.pharmacy.dtos.responses;

import com.pharmacy.data.models.Drug;

public class AddPrescriptionResponse {
    private long patientID;
    private Drug drug;
    private String dosage;
    private int quantity;


    public long getPatientID() {
        return this.patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public Drug getDrug() {
        return this.drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getDosage() {
        return this.dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
