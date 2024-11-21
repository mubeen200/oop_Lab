package org.example;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Introduction to Programming", "3");
        Course course2 = new Course("CS102", "Data Structures", "3");

        Faculty faculty1 = new Faculty("John Doe", "Professor", "johndoe@example.com", "1234567890", 50000, 1);
        Faculty faculty2 = new Faculty("Jane Smith", "Assistant Professor", "janesmith@example.com", "0987654321", 45000, 2);
        Faculty faculty3 = new Faculty("Alice Brown", "Lecturer", "alicebrown@example.com", "1122334455", 40000, 3);

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        faculty3.assignCourse(course1);
        faculty3.assignCourse(course2);

        Department department1 = new Department("Computer Science");
        department1.addFaculty(faculty1);
        department1.addCourse(course1);

        Department department2 = new Department("Information Technology");
        department2.addFaculty(faculty2);
        department2.addCourse(course2);

        Department department3 = new Department("Software Engineering");
        department3.addFaculty(faculty3);
        department3.addCourse(course1);
        department3.addCourse(course2);

        System.out.println(department1);
        System.out.println("\n" + department2);
        System.out.println("\n" + department3);
    }
}
