package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;
import java.util.ArrayList;
import java.util.List;

public class Drugs {
    static List<ArrayList<Drug>> drugs = new ArrayList<>();

    public void saveDrug(ArrayList<Drug> drugs_){
        drugs.add(drugs_);
    }

    public List<ArrayList<Drug>> getDrugs(){
        return drugs;
    }
}
