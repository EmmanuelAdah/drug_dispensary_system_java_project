package com.pharmacy.dtos.responses;

import com.pharmacy.data.models.Specialty;

public class DoctorRegistartionResponse {
        private String message;
        private long doctorID;
        private String firstname;
        private String lastname;
        private Specialty specialty;

        public Specialty getSpecialty() {

            return specialty;
        }

        public void setSpecialty(Specialty specialty) {

            this.specialty = specialty;
        }


        public String getLastname() {

            return lastname;
        }

        public void setLastname(String lastname) {

            this.lastname = lastname;
        }


        public String getFirstname() {

            return firstname;
        }

        public void setFirstname(String firstname) {

            this.firstname = firstname;
        }

        public long getDoctorID() {

            return doctorID;
        }

        public void setDoctorID(long doctorID) {

            this.doctorID = doctorID;
        }

        public void setMessage(String input) {

            this.message = input;
        }
        public String getMessage() {

            return this.message;
        }

    }




