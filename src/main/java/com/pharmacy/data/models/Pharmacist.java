package com.pharmacy.data.models;

public class Pharmacist {
    private long pharmacistID;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String phoneNumber;


    public long getPharmacistID() {

        return pharmacistID;
    }

    public void setPharmacistID(long pharmacistID) {

        this.pharmacistID = pharmacistID;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
}
