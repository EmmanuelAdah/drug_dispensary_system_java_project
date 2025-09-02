package com.pharmacy.dtos.responses;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class LoginResponseTest {

    @Test
    public void testConstructorAndGetters() {
        LoginResponse response = new LoginResponse(123L, "CLINICAL_NUTRITIONIST", "Hassan", "Login successful");

        assertEquals(1234, response.getUserID());
        assertEquals("CLINICAL_NUTRITIONIST", response.getSpeciality());
        assertEquals("Hassan", response.getFirstname());
        assertEquals("Login successful", response.getMessage());
    }

    @Test
    public void testSetUserID() {
        LoginResponse response = new LoginResponse(1234, "CLINICAL_NUTRITIONIST", "Hassan", "Login successful");
        response.setUserID(1234);
        assertEquals(1234, response.getUserID());
    }

    @Test
    public void testSetSpeciality() {
        LoginResponse response = new LoginResponse(1234, "CLINICAL_NUTRITIONIST", "Hassan", "Login successful");
        response.setSpeciality("CLINICAL_NUTRITIONIST");
        assertEquals("CLINICAL_NUTRITIONIST", response.getSpeciality());
    }

    @Test
    public void testSetFirstnameOfDoctorAndPharmacist() {
        LoginResponse response = new LoginResponse(1234, "CLINICAL_NUTRITIONIST", "Hassan", "Login successful");
        response.setFirstname("Hassan");
        assertEquals("Hassan", response.getFirstname());
    }

    @Test
    public void testSetMessageOfDoctorAndPharmacist() {
        LoginResponse response = new LoginResponse(0L, "CLINICAL_NUTRITIONIST", "Hassan", "Login failed");
        response.setMessage("Login failed");
        assertEquals("Login failed", response.getMessage());
    }
}
