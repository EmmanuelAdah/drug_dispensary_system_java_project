package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;

import java.util.ArrayList;
import java.util.List;

public class Drugs {
    static List<Drug> drugs = new ArrayList<>();

    public void saveDrug(Drug drug){
        drugs.add(drug);
    }
}
