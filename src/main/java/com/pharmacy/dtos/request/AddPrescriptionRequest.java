package com.pharmacy.dtos.request;

import com.pharmacy.data.models.Drug;
import java.util.List;

public class AddPrescriptionRequest {
    private long patientID;
    private String diagnosis;
    private List<Drug> drugs;
    private String dosage;
    private int quantity;

    public long getPatientID() {
        return this.patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<Drug> getDrugs() {
        return this.drugs;
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
