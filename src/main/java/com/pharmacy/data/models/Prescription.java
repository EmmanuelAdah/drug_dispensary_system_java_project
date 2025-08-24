package com.pharmacy.data.models;

import lombok.Data;

import java.util.List;

@Data
public class Prescription {
    private int patientID;
    private String diagnosis;
    private List<Drug> drugs;
    private Status status;
    private String prescriptionCode;

}