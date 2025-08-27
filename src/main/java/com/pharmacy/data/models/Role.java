package com.pharmacy.data.models;

public enum Role {
    DOCTOR, PHARMACIST;

    public Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
