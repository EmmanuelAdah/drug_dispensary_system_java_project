package com.pharmacy.data.repository;

import com.pharmacy.data.models.Doctor;
import com.pharmacy.data.models.Pharmacist;
import com.pharmacy.exceptions.InvalidUsernameAndPasswordException;

import java.util.ArrayList;
import java.util.List;

public class PharmacyAdmin {
    static List<Pharmacist> pharmacists = new ArrayList<>();
    static List<Doctor> doctors = new ArrayList<>();

    public void registerPharmacist(Pharmacist pharmacist) {
        pharmacists.add(pharmacist);
    }

    public void registerDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public boolean pharmacistLogin(String username, String password) {
        for (Pharmacist pharmacist : pharmacists) {
            if (pharmacist.getUsername().equals(username) && pharmacist.getPassword().equals(password))
                return true;
        }
        throw new InvalidUsernameAndPasswordException("Invalid username and password");
    }

    public boolean doctorLogin(String username, String password) {
        for (Doctor doctor : doctors) {
            if (doctor.getUsername().equals(username) && doctor.getPassword().equals(password))
                return true;
        }
        throw new InvalidUsernameAndPasswordException("Invalid username and password");
    }
}
