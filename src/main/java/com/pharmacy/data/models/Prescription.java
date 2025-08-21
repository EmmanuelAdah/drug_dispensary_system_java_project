package com.pharmacy.data.models;

public class Prescription {
    private long patientID;
    private Drug drug;
    private Doctor doctor;
    private int dosage;
    private int quantity;
    private String status;
    private String code;

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void add(Prescription prescription) {
        prescription.setPatientID(patientID);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String s) {
    }
}
