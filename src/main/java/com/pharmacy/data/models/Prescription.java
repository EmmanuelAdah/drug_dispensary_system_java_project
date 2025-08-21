package com.pharmacy.data.models;

import java.util.ArrayList;
import java.util.List;

public class Prescription {
    private long patientID;
    private String diagnosis;
    private List<Drug> drug;
    private String dosage;
    private int quantity;
    private String status;

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
        drugs = drug;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
