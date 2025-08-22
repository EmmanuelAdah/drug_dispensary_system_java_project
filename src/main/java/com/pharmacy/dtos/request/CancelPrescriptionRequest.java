package com.pharmacy.dtos.request;

public class CancelPrescriptionRequest {
    private long patientID;
    private String prescriptionCode;

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public String getPrescriptionCode() {
        return prescriptionCode;
    }

    public void setPrescriptionID(String code) {
        this.prescriptionCode = code;
    }
}
