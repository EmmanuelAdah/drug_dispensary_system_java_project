package com.pharmacy.dtos.responses;

public class PharmacistRegistartionResponse {
        public long getPharmacistID() {
            return pharmacistID;
        }
        public void setPharmacistID(long pharmacistID) {
            this.pharmacistID = pharmacistID;
        }
        private long pharmacistID;
        private String message;
        private String username;
        public String getUsername(){
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }


    }
