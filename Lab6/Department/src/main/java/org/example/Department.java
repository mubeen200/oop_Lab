package org.example;

import java.util.ArrayList;

class Department {
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty;
    private ArrayList<Course> offeredCourses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentFaculty = new ArrayList<>();
        this.offeredCourses = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        departmentFaculty.add(faculty);
    }

    public void addCourse(Course course) {
        offeredCourses.add(course);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department Name: ").append(departmentName)
                .append("\nFaculty Members: ");
        for (Faculty faculty : departmentFaculty) {
            sb.append("\n\t").append(faculty);
        }
        sb.append("\nOffered Courses: ");
        for (Course course : offeredCourses) {
            sb.append("\n\t").append(course);
        }
        return sb.toString();
    }
}


