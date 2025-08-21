package com.pharmacy.dtos.responses;

import com.pharmacy.data.models.Drug;

import java.util.List;

public class AddPrescriptionResponse {
    private long patientID;
    private List<Drug> drugs;
    private String dosage;
    private int quantity;


    public long getPatientID() {
        return this.patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public List<Drug> getDrugs() {
        return this.drug;
    }

    public void setDrug(List<Drug> drug) {
        this.drugs = drug;
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
