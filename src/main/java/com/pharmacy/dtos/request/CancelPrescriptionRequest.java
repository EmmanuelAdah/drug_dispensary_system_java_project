package com.pharmacy.dtos.request;

public class CancelPrescriptionRequest {
    private long patientID;
    private int prescriptionID;

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }
}
