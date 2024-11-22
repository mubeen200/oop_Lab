package org.example;

class Staff extends Employee {
    private String workingHours;

    public Staff(String employeeName, String employeeDesignation, String employeeDepartment,
                 String employeeEmail, String employeeContact, int employeeSalary,
                 int employeeNumber, String workingHours) {
        super(employeeName, employeeDesignation, employeeDepartment, employeeEmail, employeeContact, employeeSalary, employeeNumber);
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}

