package com.pharmacy.dtos.responses;

import com.pharmacy.data.models.Drug;
import lombok.Data;

import java.util.List;

@Data
public class AddPrescriptionResponse {
    private long patientID;
    private String prescriptionCode;
    private List<Drug> drugs;
}