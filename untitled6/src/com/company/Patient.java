package com.company;

import java.util.List;

public class Patient {
    String patient_name;
    int patient_age;
    List<Condition> conditions;

    public Patient(String patient_name, int patient_age, List<Condition> conditions) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.conditions = conditions;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public int getPatient_age() {
        return patient_age;
    }

    public List<Condition> getConditions() {
        return conditions;
    }
}
