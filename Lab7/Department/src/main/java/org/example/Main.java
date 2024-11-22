package org.example;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("CS101", "Introduction to Computer Science", "3");
        Course course2 = new Course("CS102", "Data Structures", "4");
        Course course3 = new Course("CS103", "Algorithms", "3");

        Faculty faculty1 = new Faculty("Ali", "Professor", "Computer Science",
                "ali@university.edu", "123456789", 80000, 1, "9 AM - 5 PM");
        Faculty faculty2 = new Faculty("Bilal", "Assistant Professor", "Computer Science",
                "bilal@university.edu", "987654321", 70000, 2, "10 AM - 6 PM");

        faculty1.assignCourse(course1);
        faculty1.assignCourse(course2);
        faculty2.assignCourse(course3);

        Staff staff1 = new Staff("Charlie", "Lab Technician", "Computer Science Lab",
                "charlie@university.edu", "1122334455", 40000, 3, "8 AM - 4 PM");
        Staff staff2 = new Staff("Daud", "Administrative Assistant", "Computer Science Department",
                "daud@university.edu", "5566778899", 35000, 4, "9 AM - 5 PM");


        System.out.println("Course Details:");
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

        System.out.println("\nFaculty Details:");
        System.out.println(faculty1);
        faculty1.printCourseList();
        System.out.println(faculty2);
        faculty2.printCourseList();

        System.out.println("\nStaff Details:");
        System.out.println(staff1);
        System.out.println(staff2);
    }
}
