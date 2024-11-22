package org.example;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(){}

    public BasePlusCommissionEmployee(String firstName,String lastName,String cnic,double grossSales,double commissionRate,double baseSalary){
        super(firstName,lastName,cnic,grossSales,commissionRate);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary>=0) {
            this.baseSalary = baseSalary;
        }
    }

    @Override
    public String toString() {
        return "\nBase plus Commission employee: " + super.toString();
    }

    @Override
    public double earnings() {
        return baseSalary*super.earnings();
    }
}
