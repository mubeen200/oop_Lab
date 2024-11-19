package org.example;

import java.util.*;
public class Main {

    static String pName,pEmail,pComplain;
    static int pAge,pContact,pBill,pNumber;


    public void Take_Patient_Data(){
        System.out.println("----------------Patient's Info-----------------");
        System.out.print("Enter Patient's Name please : ");
        Scanner sc = new Scanner(System.in);
        pName = sc.nextLine();
        System.out.print("Enter Patient's Number please : ");
        pNumber = sc.nextInt();
        System.out.print("Enter Patient's Age please : ");
        pAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient's Email please : ");
        pEmail = sc.nextLine();
        System.out.print("Enter Patient's Contact please : ");
        pContact = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient's Complain please : ");
        pComplain =sc.nextLine();
        System.out.print("Enter Patient's Bill please : ");
        pBill=sc.nextInt();

    }

    public void Print_Reciept(){
        System.out.println("-----------------Patient's Reciept-------------------");
        System.out.println("Patient's Number : " + pNumber);
        System.out.println("Patient's Name : " + pName);
        System.out.println("Patient's Age : " + pAge);
        System.out.println("Patient's Email : " + pEmail);
        System.out.println("Patient's Contact : " + pContact);
        System.out.println("Patient's Complain : " + pComplain);
        System.out.println("Patient's Bill : " + pBill);
    }
    public static void main(String[] args) {
        Main patient = new Main();
        patient.Take_Patient_Data();
        patient.Print_Reciept();
    }
}
