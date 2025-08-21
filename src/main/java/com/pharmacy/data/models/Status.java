package com.pharmacy.data.models;

public enum Status {
    PENDING, CANCELLED, DISPENSED;

    private Status status;


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
