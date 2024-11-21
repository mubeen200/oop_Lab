package org.example;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Introduction to Programming", "3");
        Course course2 = new Course("CS102", "Data Structures", "3");


        Faculty faculty1 = new Faculty("John Doe", "Professor", "johndoe@example.com", "1234567890", 50000, 1);
        Faculty faculty2 = new Faculty("Jane Smith", "Assistant Professor", "janesmith@example.com", "0987654321", 45000, 2);

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        Department department = new Department("Computer Science");
        department.addFaculty(faculty1);
        department.addFaculty(faculty2);
        department.addCourse(course1);
        department.addCourse(course2);
        System.out.println(department);
    }
}