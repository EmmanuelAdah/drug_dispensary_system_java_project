package com.pharmacy.data.models;

public class Patient {
    private int patientID;
    private String firstname;
    private String lastname;
    private Gender gender;
    private String phone;
    private String username;
    private String password;


    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  
    public String getUsername() {
        return this.username;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
  
   public int getPatientID() {
        return this.patientID;
    }

    public String getFirstName() {
        return this.firstName;
    }
  
      public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
  
    public String getLastName() {
        return this.lastname;
    }
}
