package com.pharmacy.dtos.request;

import com.pharmacy.data.models.Specialty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

    public class DoctorRegistrationRequestTest {

        @Test
        public void testSetFirstnameOfDoctors() {
            DoctorRegistrationRequest request = new DoctorRegistrationRequest();
            request.setFirstname("Salako");
            assertEquals("Salako", request.getFirstname());
        }

        @Test
        public void testSetLastnameOfDoctors() {
            DoctorRegistrationRequest request = new DoctorRegistrationRequest();
            request.setLastname("Hassan");
            assertEquals("Hassan", request.getLastname());
        }

        @Test
        public void testSetSpecialtyOfDoctors() {
            DoctorRegistrationRequest request = new DoctorRegistrationRequest();
            request.setSpecialty(Specialty.CLINICAL_NUTRITIONIST);
            assertEquals(Specialty.CLINICAL_NUTRITIONIST, request.getSpecialty());
        }

        @Test
        public void testSetPasswordOfDoctors() {
            DoctorRegistrationRequest request = new DoctorRegistrationRequest();
            request.setPassword("2025Hassan2026");
            assertEquals("2025Hassan2026", request.getPassword());
        }

        @Test
        public void testConstructorAndGettersForDoctors() {
            DoctorRegistrationRequest request = new DoctorRegistrationRequest();
            request.setFirstname("Salako");
            request.setLastname("Hassan");
            request.setSpecialty(Specialty.CLINICAL_NUTRITIONIST);
            request.setPassword("2025Hassan2026");

            assertEquals("Salako", request.getFirstname());
            assertEquals("Hassan", request.getLastname());
            assertEquals(Specialty.CLINICAL_NUTRITIONIST, request.getSpecialty());
            assertEquals("2025Hassan2026", request.getPassword());
        }
    }


