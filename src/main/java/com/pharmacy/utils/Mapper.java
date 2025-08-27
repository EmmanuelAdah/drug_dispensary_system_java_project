package com.pharmacy.utils;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.models.Status;
import com.pharmacy.data.models.User;
import com.pharmacy.dtos.request.AddPrescriptionRequest;
import com.pharmacy.dtos.request.AddUserRequest;
import com.pharmacy.dtos.request.CancelPrescriptionRequest;
import com.pharmacy.dtos.responses.AddPrescriptionResponse;
import com.pharmacy.dtos.responses.AddUserResponse;
import com.pharmacy.dtos.responses.CancelPrescriptionResponse;
import static com.pharmacy.utils.PasswordHasher.hashPassword;
import static com.pharmacy.utils.Validator.*;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public static Prescription map(AddPrescriptionRequest addPrescriptionRequest) {
        Prescription prescription = new Prescription();
        validatePatientID(addPrescriptionRequest.getPatientID());
        prescription.setPatientID(addPrescriptionRequest.getPatientID());
        prescription.setPrescriptionCode(CodeGenerator.generatePrescriptionCode());
        prescription.setDiagnosis(addPrescriptionRequest.getDiagnosis());
        prescription.setDrugs(mapDrugs(addPrescriptionRequest.getDrugs()));
        prescription.setStatus(Status.PENDING);
        return prescription;
    }

    public static List<Drug> mapDrugs(List<Drug> prescription) {
        List<Drug> drugs = new ArrayList<>();
        for (Drug prescribed : prescription) {
            Drug drug = new Drug();
            drug.setName(prescribed.getName());
            drug.setDosage(prescribed.getDosage());
            validateQuantity(prescribed.getQuantity());
            drug.setQuantity(prescribed.getQuantity());
            drugs.add(drug);
            }
        return drugs;
    }

    public static AddPrescriptionResponse map(Prescription prescription) {
        AddPrescriptionResponse addPrescriptionResponse = new AddPrescriptionResponse();
        addPrescriptionResponse.setPatientID(prescription.getPatientID());
        addPrescriptionResponse.setPrescriptionCode(prescription.getPrescriptionCode());
        return addPrescriptionResponse;
    }

    public static Prescription mapper(CancelPrescriptionRequest cancelPrescriptionRequest){
        Prescription prescription = new Prescription();
        prescription.setPatientID(cancelPrescriptionRequest.getPatientID());
        prescription.setPrescriptionCode(cancelPrescriptionRequest.getPrescriptionCode());
        prescription.setStatus(Status.CANCELLED);
        return prescription;
    }

    public static CancelPrescriptionResponse mapper(Prescription prescription){
        CancelPrescriptionResponse response = new CancelPrescriptionResponse();
        response.setPatientId(prescription.getPatientID());
        response.setPrescriptionCode(prescription.getPrescriptionCode());
        response.setStatus(Status.CANCELLED);
        return response;
    }

    public static User mapUser(AddUserRequest addUserRequest) {
        User user = new User();
        user.setUserID(addUserRequest.getUserID());
        user.setFirstname(addUserRequest.getFirstName());
        user.setLastname(addUserRequest.getLastName());
        user.setRole(validateRole(addUserRequest.getRole()));
        user.setUsername(addUserRequest.getUsername());
        user.setPassword(hashPassword(addUserRequest.getPassword()));
        return user;
    }

    public static AddUserResponse map(User user) {
        AddUserResponse addUserResponse = new AddUserResponse();
        addUserResponse.setUserID(user.getUserID());
        addUserResponse.setFirstName(user.getFirstname());
        addUserResponse.setLastName(user.getLastname());
        return addUserResponse;
    }
}