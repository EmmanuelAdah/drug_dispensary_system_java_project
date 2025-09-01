package com.pharmacy.utils;

import com.pharmacy.data.models.Role;
import com.pharmacy.exceptions.*;

public class Validator {

    public static void validateQuantity(int quantity) {
        if (quantity <= 0)
            throw new InvalidDrugQuantityException("Drug quantity must be greater than 0");
    }

    public static void validatePatientID(int patientID) {
        if (patientID <= 0) throw new InvalidPatientIdentityException("Invalid patient ID");
    }

    public static void validatePassword(String password) {
        if (password.length() < 6 || password.length() > 16) throw new InvalidPasswordLengthException("Invalid Password Length");
    }

    public static void validateUsername(String username) {
        if (username.length() < 4|| username.length() > 14) throw new InvalidUsernameLengthException("Invalid length for username");
    }

    public static Role validateRole(String role){
        if (role.equalsIgnoreCase("Doctor"))return Role.DOCTOR;
        else if (role.equalsIgnoreCase("Pharmacist")) return Role.PHARMACIST;
        throw new InvalidRoleException("Role does not exist");
    }
}
