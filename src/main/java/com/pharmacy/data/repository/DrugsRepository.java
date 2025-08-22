package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;
import java.util.ArrayList;
import java.util.List;

public class DrugsRepository {
    static List<Drug> drugs = new ArrayList<>();

    public void saveDrug(Drug drugs_){
        drugs.add(drugs_);
    }

    public List<Drug> getDrugs(){
        return drugs;
    }
}
