package com.pharmacy.dtos.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class LoginRequestTest {

        @Test
        public void testConstructorAndGettersForBothDoctorAndPharmacist() {
            LoginRequest request = new LoginRequest();
            request.setEmail("Salakohassanmobolaji@gmail.com");
            request.setPassword("2025Hassan2026");
            assertEquals("Salakohassanmobolaji@gmail.com", request.getEmail());
            assertEquals("2025Hassan2026", request.getPassword());
        }

        @Test
        public void testSetEmailForBothDoctorAndPharmacist() {
            LoginRequest request = new LoginRequest();
            request.setEmail("Salakohassanmobolaji@gmail.com");
            assertEquals("Salakohassanmobolaji@gmail.com", request.getEmail());
        }

        @Test
        public void testSetPassword() {
            LoginRequest request = new LoginRequest();
            request.setPassword("2025Hassan2026");
            assertEquals("2025Hassan2026", request.getPassword());
        }
    }



