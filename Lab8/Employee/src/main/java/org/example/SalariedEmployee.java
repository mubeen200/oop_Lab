package org.example;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(){}

    public SalariedEmployee(String firstName,String lastName,String cnic, double weeklySalary){
        super(firstName,lastName,cnic);
        this.weeklySalary=weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary>=0){
        this.weeklySalary = weeklySalary;
        }
    }

    @Override
   public String toString(){
        return "\nSalaried employee : " + super.toString();
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}
