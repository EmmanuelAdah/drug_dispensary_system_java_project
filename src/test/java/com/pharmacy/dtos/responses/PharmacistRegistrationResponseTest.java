package com.pharmacy.dtos.responses;

import com.pharmacy.data.models.Specialty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    public class PharmacistRegistrationResponseTest {
        @Test
        public void testConstructorAndGettersForPharmacists() {
            DoctorRegistartionResponse response = new DoctorRegistartionResponse();
            response.setDoctorID(1001L);
            response.setFirstname("Salako");
            response.setLastname("Hassan");
            response.setSpecialty(Specialty.CLINICAL_NUTRITIONIST);
            response.setMessage("Registration successful");
            assertEquals(1001L, response.getDoctorID());
            assertEquals("Salako", response.getFirstname());
            assertEquals("Hassan", response.getLastname());
            assertEquals(Specialty.CLINICAL_NUTRITIONIST, response.getSpecialty());
            assertEquals("Registration successful", response.getMessage());
        }

        @Test
        public void testSetPharamcistID() {
            DoctorRegistartionResponse response = new DoctorRegistartionResponse();
            response.setDoctorID(1002L);
            assertEquals(1002L, response.getDoctorID());
        }

        @Test
        public void testSetFirstnameOfPharmacists() {
            DoctorRegistartionResponse response = new DoctorRegistartionResponse();
            response.setFirstname("Salako");
            assertEquals("Salako", response.getFirstname());
        }

        @Test
        public void testSetLastnameOfPharmacists() {
            DoctorRegistartionResponse response = new DoctorRegistartionResponse();
            response.setLastname("Hassan");
            assertEquals("Hassan", response.getLastname());
        }

        @Test
        public void testSetSpecialtyOfPharmacists() {
            DoctorRegistartionResponse response = new DoctorRegistartionResponse();
            response.setSpecialty(Specialty.CLINICAL_NUTRITIONIST);
            assertEquals(Specialty.CLINICAL_NUTRITIONIST, response.getSpecialty());
        }

        @Test
        public void testSetMessageOfPharmacists() {
            DoctorRegistartionResponse response = new DoctorRegistartionResponse();
            response.setMessage("Congratulations,You've been registered successfully");
            assertEquals("Congratulations,You've been registered successfully", response.getMessage());
        }
    }

