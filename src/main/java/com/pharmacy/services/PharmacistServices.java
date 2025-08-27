package com.pharmacy.services;

import com.pharmacy.data.models.Prescription;
import com.pharmacy.data.repository.PrescriptionRepository;

public class PharmacistServices {

    public Prescription verifyPrescription(String prescriptionCode){
        Prescription prescription = PrescriptionRepository.findByCode(prescriptionCode);
        return prescription;
    }

//    public Drug dispenseDrugs(Prescription prescription){
//
//    }
//    public void buyDrugs(BuyDrugsRequest buyDrugsRequest) {
//        Drug drug = drugs.findByName(buyDrugsRequest.getDrugName());
//        drug.setQuantity(drug.getQuantity() - buyDrugsRequest.getQuantity());
//        drugs.save(drug);
//    }
//
//    public List<AvailableDrugResponse> getAvailableDrugs() {
//        List<Drug> allDrugs = drugs.findAll();
//        List<AvailableDrugResponse> availableDrugs = new ArrayList<>();
//        for(Drug drug: allDrugs) {
//            if(drug.getQuantity() > 0) {
//                AvailableDrugResponse availableDrugResponse = new AvailableDrugResponse();
//                availableDrugResponse.setName(drug.getName());
//                availableDrugResponse.setQuantity(drug.getQuantity());
//                availableDrugResponse.setIsExpired.(drug.getExpiryDate());
//            }

    }


    // verify prescription
    // view prescription histroy
    // mark prescription as complete


