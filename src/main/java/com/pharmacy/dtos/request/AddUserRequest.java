package com.pharmacy.dtos.request;

import lombok.Data;

@Data
public class AddUserRequest {
    private long userID;
    private String firstName;
    private String lastName;
    private String role;
    private String username;
    private String password;
}
