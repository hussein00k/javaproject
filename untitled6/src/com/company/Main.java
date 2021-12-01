package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner put=new Scanner(System.in);

        System.out.println("Doctor name : ");
        String doctorName=put.nextLine();

        System.out.println("Doctor Number : ");
        int doctorNumber= put.nextInt();

        System.out.println("Doctor Phone: ");
        int doctorPhone=put.nextInt();

        //general practitoner
        System.out.println("general practitoner information");
        String solution=put.nextLine();
        System.out.println("Doctor name : ");
        String pName=put.nextLine();

        System.out.println("Doctor Number : ");
        int pNumber= put.nextInt();

        System.out.println("Doctor Phone: ");
        int pPhone=put.nextInt();






        //objects
        Consultant consultant=new Consultant(doctorName,doctorNumber,doctorPhone);
        GeneralPractitioner generalPractitioner=new GeneralPractitioner(pName,pNumber,pPhone,consultant);



        //display
        System.out.println("the doctor name is "+consultant.getDoctorName()+", number : "+consultant.getDoctorNumber()+", phone : "+consultant.getDoctorPhone());
        System.out.println("general practitoner information");
        System.out.println("the practice doctor name is "+generalPractitioner.getDoctorName()+", number : "+generalPractitioner.getDoctorNumber()+", phone : "+generalPractitioner.getDoctorPhone());

        List<Condition>conditions=new ArrayList<>();
        Condition cond1=new Condition("break","danger");
        Condition cond2=new Condition("headche","safe");

        conditions.add(cond1);
        conditions.add(cond2);

        Patient patient=new Patient("ali",25,conditions);
        System.out.println("the patient name : "+patient.getPatient_name()+" his age : "+patient.getPatient_age());

        List<Condition> conditions1=patient.getConditions();
        for(Condition condition:conditions1){
            System.out.println("has condtion : "+condition.getCond_name()+"  and condtion stats"+condition.getCond_state());
        }


    }
}
