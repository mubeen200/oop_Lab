package org.example;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(){}

    public CommissionEmployee(String firstName,String lastName,String cnic,double grossSales,double commissionRate){
        super(firstName,lastName,cnic);
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
       if(commissionRate>=0) {
           this.commissionRate = commissionRate;
       }
    }

    public void setGrossSales(double grossSales) {
        if(grossSales>=0) {
            this.grossSales = grossSales;
        }
    }

    @Override
    public String toString() {
        return "\nCommission employee: " + super.toString();
    }

    @Override
    public double earnings() {
        return grossSales*commissionRate;
    }
}
