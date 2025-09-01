package com.pharmacy.dtos.request;

public class DoctorRegistrationRequest {
        private String firstname;
        private String lastname;
        private String username;
        private String password;


        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
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
            this.firstname = firstname; }
    }


