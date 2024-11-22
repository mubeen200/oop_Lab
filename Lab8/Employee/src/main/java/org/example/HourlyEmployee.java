package org.example;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(){}

    public HourlyEmployee(String firstName, String lastName, String cnic, double wage, double hours){
        super(firstName,lastName,cnic);
        this.wage=wage;
        this.hours=hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if(hours>=0){
        this.hours = hours;
        }
    }

    public void setWage(double wage) {
       if(wage>=0) {
           this.wage = wage;
       }
    }

    @Override
    public String toString() {
        return "\nHourly employee: " + super.toString();
    }

    @Override
    public double earnings() {
      if(hours<=40){
          return wage*hours;
      }
      else return 0;
    }
}
