package com.pharmacy.controller;

import com.pharmacy.dtos.request.AddUserRequest;
import com.pharmacy.dtos.responses.AddUserResponse;
import com.pharmacy.services.AdminServices;

public class AdminServicesController {
    AdminServices adminServices = new AdminServices();

    public AddUserResponse recordNewUser(AddUserRequest addUserRequest) {
        return adminServices.addUser(addUserRequest);
    }
}
