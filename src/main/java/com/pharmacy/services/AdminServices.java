package com.pharmacy.services;

import com.pharmacy.data.models.User;
import com.pharmacy.dtos.request.AddUserRequest;
import com.pharmacy.dtos.responses.AddUserResponse;
import static com.pharmacy.utils.Mapper.map;
import static com.pharmacy.utils.Mapper.mapUser;

public class AdminServices {

    public AddUserResponse addUser(AddUserRequest addUserRequest) {
        User user = mapUser(addUserRequest);
        AddUserResponse addUserResponse = map(user);
        return addUserResponse;
    }
}
