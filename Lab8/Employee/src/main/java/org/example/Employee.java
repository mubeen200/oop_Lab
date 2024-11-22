package org.example;

public class Employee {
    private String firstName;
    private String lastName;
    private String cnic;

    public Employee(){}

    public Employee(String firstName,String lastName,String cnic){
        this.firstName=firstName;
        this.lastName=lastName;
        this.cnic=cnic;
    }

    public String getCnic() {
        return cnic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " " + lastName + " CNIC# :" + cnic;
    }
    public double earnings(){
        return 0.00;
    }


}

