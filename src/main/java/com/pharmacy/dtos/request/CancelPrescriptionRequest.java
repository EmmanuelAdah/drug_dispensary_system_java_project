package com.pharmacy.dtos.request;

public class CancelPrescriptionRequest {
    private int patientID;
    private String prescriptionCode;

    public int getPatientID() {
        return this.patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPrescriptionCode() {
        return this.prescriptionCode;
    }

    public void setPrescriptionID(String code) {
        this.prescriptionCode = code;
    }
}
