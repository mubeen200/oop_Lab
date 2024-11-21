package org.example;



import java.util.ArrayList;

class Faculty {
    private String facultyName;
    private String facultyDesignation;
    private String facultyEmail;
    private String facultyContact;
    private int facultySalary;
    private int facultyId;
    private ArrayList<Course> courseList;

    public Faculty(String facultyName, String facultyDesignation, String facultyEmail, String facultyContact, int facultySalary, int facultyId) {
        this.facultyName = facultyName;
        this.facultyDesignation = facultyDesignation;
        this.facultyEmail = facultyEmail;
        this.facultyContact = facultyContact;
        this.facultySalary = facultySalary;
        this.facultyId = facultyId;
        this.courseList = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty Name: ").append(facultyName)
                .append(", Designation: ").append(facultyDesignation)
                .append(", Email: ").append(facultyEmail)
                .append(", Contact: ").append(facultyContact)
                .append(", Salary: ").append(facultySalary)
                .append(", ID: ").append(facultyId)
                .append("\nCourses: ");
        for (Course course : courseList) {
            sb.append("\n\t").append(course);
        }
        return sb.toString();
    }
}
