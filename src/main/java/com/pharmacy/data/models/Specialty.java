package com.pharmacy.data.models;

public enum Specialty {
    ALLERGIST, ANESTHETIST, DENTIST, GASTROENTEROLOGIST,
    NEUROLOGIST, PHYSICIAN, PSYCHIATRIST, UROLOGIST, PODIATRIST,
    MEDICALGENETICIST, HEMATOLOGIST, ONCOLOGIST, OBSTETRICIAN,
    PATHOLOGIST, RADIOLOGIST, RHEUMATOLOGIST, CARDIOLOGIST, PULMONOLOGIST,
    ENDOCRINOLOGIST, DERMATOLOGIST;

    public Specialty specialty;

    public Specialty getGetSpecialties() {
        return specialty;
    }

    public void setGetSpecialties(Specialty specialty) {
        this.specialty = specialty;
    }
}
