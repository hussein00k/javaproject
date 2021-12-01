package com.company;

public class GeneralPractitioner extends Consultant{
    Consultant consultant;

    public GeneralPractitioner(String doctorName, int doctorNumber, int doctorPhone, Consultant consultant) {
        super(doctorName, doctorNumber, doctorPhone);
        this.consultant = consultant;
    }
}
