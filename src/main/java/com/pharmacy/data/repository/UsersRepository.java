package com.pharmacy.data.repository;

import com.pharmacy.data.models.User;
import com.pharmacy.exceptions.InvalidUsernameAndPasswordException;
import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    static List<User> users = new ArrayList<>();

    public void registerDoctor(User doctor) {
        users.add(doctor);
    }

    public boolean doctorLogin(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;
        }
        throw new InvalidUsernameAndPasswordException("Invalid username and password");
    }
}
