package org.example;

class Employee {
    private String employeeName;
    private String employeeDesignation;
    private String employeeDepartment;
    private String employeeEmail;
    private String employeeContact;
    private int employeeSalary;
    private int employeeNumber;

    public Employee(String employeeName, String employeeDesignation, String employeeDepartment,
                    String employeeEmail, String employeeContact, int employeeSalary, int employeeNumber) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeDepartment = employeeDepartment;
        this.employeeEmail = employeeEmail;
        this.employeeContact = employeeContact;
        this.employeeSalary = employeeSalary;
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee Name: " + employeeName + ", Designation: " + employeeDesignation +
                ", Department: " + employeeDepartment + ", Email: " + employeeEmail +
                ", Contact: " + employeeContact + ", Salary: " + employeeSalary +
                ", Employee Number: " + employeeNumber;
    }
}
