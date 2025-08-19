package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;

import java.util.List;
import java.util.ArrayList;


public class Drugs {
    private static List<Drug> drugs = new ArrayList<>();

    public long count() {
        return drugs.size();
    }

    public Drug save(Drug drug) {
        if (isNew(drug)) {
            saveNew(drug);
        } else {
            update(drug);
        }
        return drug;
    }

    private void update(Drug drug) {
        deleteByID(drug.getId());
        drugs.add(drug);
    }


    private void deleteByID(long id) {
        for (int i = 0; i < drugs.size(); i++) {
            if (drugs.get(i).getId() == id) {
                drugs.remove(i);
                break;
            }
        }
    }

    private void saveNew(Drug drug) {
        drug.setId(generateId());
        drugs.add(drug);
    }

    private int generateId() {
        return drugs.size() + 1;
    }

    private boolean isNew(Drug drug) {
        return drug.getId() == 0;
    }

    public Drug findId(long id) {
        for (int i = 0; i < drugs.size(); i++) {
            if (drugs.get(i).getId() == id) {
                return drugs.get(i);
            }
        }
        return null;
    }

    public Drug  findName(String name) {
        for (int i = 0; i < drugs.size(); i++) {
            if (drugs.get(i).getName().equals(name)) {
                return drugs.get(i);
            }
        }
        return null;
    }



}