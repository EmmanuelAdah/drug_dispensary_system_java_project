package com.pharmacy.dtos.responses;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Status;

public class CancelPrescriptionResponse {
    private long patientId;
    private int prescriptionId;
    private Drug drug;
    private Status Status;

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status status) {
        Status = status;
    }
}
