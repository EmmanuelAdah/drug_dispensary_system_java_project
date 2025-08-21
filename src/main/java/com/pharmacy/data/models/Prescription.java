package com.pharmacy.data.models;

import java.util.List;

public class Prescription {
    private long patientID;
    private String diagnosis;
    private List<Drug> drugs;
    private String dosage;
    private int quantity;
    private Status status;
    private String prescriptionCode;


    public long getPatientID() {
        return this.patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public List<Drug> getDrugs() {
        return this.drugs;
    }

    public void setDrugs(List<Drug> drug) {
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

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPrescriptionCode() {
        return this.prescriptionCode;
    }

    public void setPrescriptionCode(String code) {
        this.prescriptionCode = code;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}