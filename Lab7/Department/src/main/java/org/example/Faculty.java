package org.example;


import java.util.ArrayList;

class Faculty extends Employee {
    private String workingHours;
    private ArrayList<Course> courseList;

    public Faculty(String employeeName, String employeeDesignation, String employeeDepartment,
                   String employeeEmail, String employeeContact, int employeeSalary,
                   int employeeNumber, String workingHours) {
        super(employeeName, employeeDesignation, employeeDepartment, employeeEmail, employeeContact, employeeSalary, employeeNumber);
        this.workingHours = workingHours;
        this.courseList = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }

    public void printCourseList() {
        System.out.println("Assigned Courses:");
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}

