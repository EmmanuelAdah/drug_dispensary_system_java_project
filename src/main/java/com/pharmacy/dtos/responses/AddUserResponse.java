package com.pharmacy.dtos.responses;

import lombok.Data;

@Data
public class AddUserResponse {
    private long userID;
    private String firstName;
    private String lastName;
}
