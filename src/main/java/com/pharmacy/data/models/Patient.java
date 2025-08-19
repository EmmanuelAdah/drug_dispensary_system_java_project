package com.pharmacy.data.models;

public class Patient {
    private long patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String address;
    private String email;
    private String phone;

    public long getPatientID() {

        return patientID;
    }

    public void setPatientID(long patientID) {

        this.patientID = patientID;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }
}
