package com.pharmacy.dtos.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistRegistrationRequestTest {

    @Test
    public  void testFistNameOfPharmacists() {
        PharmacistRegistartionRequest request = new PharmacistRegistartionRequest();
        request.setFirstname("Salako");
        assertEquals("Salako", request.getFirstname());
    }

    @Test
    public void testLastNameOfPharmacists() {
        PharmacistRegistartionRequest request = new PharmacistRegistartionRequest();
        request.setLastname("Hassan");
        assertEquals("Hassan", request.getLastname());
    }
    @Test
    public void testPasswordOfPharmacists() {
        PharmacistRegistartionRequest request = new PharmacistRegistartionRequest();
        request.setPassword("2025Hassan2026");
        assertEquals("2025Hassan2026", request.getPassword());
    }
    @Test
    public  void testPhoneNumberOfPharmacists() {
        PharmacistRegistartionRequest request = new PharmacistRegistartionRequest();
        request.setPhoneNumber("08172942284");
        assertEquals("08172942284", request.getPhoneNumber());

    }
    @Test
    public void testEmailOfPharmacists() {
        PharmacistRegistartionRequest request = new PharmacistRegistartionRequest();
        request.setEmail("salakohassanmobolaji@gmail.com");
        assertEquals("salakohassanmobolaji@gmail.com", request.getEmail());
    }
    @Test
    public void testConstructorAndGettersForPharmacists() {
        PharmacistRegistartionRequest request = new PharmacistRegistartionRequest();
        request.setFirstname("Salako");
        request.setLastname("Hassan");
        request.setPassword("2025Hassan2026");
        request.setPhoneNumber("08172942284");
        request.setEmail("salakohassanmobolaji@gmail.com");
        assertEquals("Salako",request.getFirstname());
        assertEquals("Hassan", request.getLastname());
        assertEquals("2025Hassan2026",request.getPassword());
        assertEquals("salakohassanmobolaji@gmail.com",request.getEmail());
        assertEquals("08172942284",request.getPhoneNumber());
    }






}