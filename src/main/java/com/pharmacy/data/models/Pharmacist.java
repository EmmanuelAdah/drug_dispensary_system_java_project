package com.pharmacy.data.models;

import lombok.Data;

@Data
public class Pharmacist {
    private long pharmacistID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
