package com.pharmacy.data.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Drug {
    private long id;
    private String name;
    private Type type;
    private String dosage;
    private String category;
    private LocalDate manufacturedDate;
    private LocalDate expiryDate;
    private int quantity;

}
