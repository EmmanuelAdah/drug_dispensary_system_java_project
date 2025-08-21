package com.pharmacy.dtos.request;

import com.pharmacy.data.models.Drug;

public class CancelDrugRequest {
    private long patientID;
    private Drug drug;

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
}
