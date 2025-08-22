package com.pharmacy.dtos.responses;

public class LoginResponse {
        private long userID;
        private String speciality;
        private String firstname;
        private String message;


        public LoginResponse(long userID, String speciality, String firstname, String message) {
            this.userID = userID;
            this.speciality = speciality;
            this.firstname = firstname;
            this.message = message;
        }


        public long getUserID() {
            return userID;
        }

        public void setUserID(long userID) {
            this.userID = userID;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String Speciality) {
            this.speciality = Speciality;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }




