package com.pharmacy.dtos.request;

import com.pharmacy.data.models.Drug;
import lombok.Data;
import java.util.List;

@Data
public class AddPrescriptionRequest {
    private int patientID;
    private String diagnosis;
    private List<Drug> drugs;
    private String dosage;
    private int quantity;
}
