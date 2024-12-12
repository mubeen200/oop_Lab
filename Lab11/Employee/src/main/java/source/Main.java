package source;

import java.io.*;
import java.util.*;

public class Main {

    public static void saveEmployeeData(List<Employee> employees, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Employee emp : employees) {
                writer.write(emp.toFileFormat());
            }
            System.out.println("Employee data saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<Employee> readEmployeeData(String fileName) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    String name = data[0];
                    String department = data[1];
                    String contact = data[2];
                    String designation = data[3];
                    double salary = Double.parseDouble(data[4]);
                    String status = data[5];
                    employees.add(new Employee(name, department, contact, designation, salary, status));
                }
            }
            System.out.println("Employee data loaded from " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return employees;
    }

    public static void updateEmployeeRecords(List<Employee> employees) {
        if (employees.size() >= 3) {

            Employee emp2 = employees.get(1);
            emp2.setSalary(55000);
            emp2.setStatus("Active");

            Employee emp3 = employees.get(2);
            emp3.setSalary(65000);
            emp3.setStatus("Inactive");
        }
    }

    public static void displayEmployeeData(List<Employee> employees) {
        System.out.println("Employee Records:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mubeen Haider", "HR", "1234567890", "Manager", 50000, "Active"));
        employees.add(new Employee("Sara Ali", "IT", "0987654321", "Developer", 60000, "Inactive"));
        employees.add(new Employee("Ali Khan", "Finance", "1122334455", "Accountant", 70000, "Active"));

        saveEmployeeData(employees, "EmployeeData.txt");

        List<Employee> loadedEmployees = readEmployeeData("EmployeeData.txt");
        displayEmployeeData(loadedEmployees);

        updateEmployeeRecords(loadedEmployees);

        saveEmployeeData(loadedEmployees, "UpdatedEmployeeInfo.txt");

        List<Employee> updatedEmployees = readEmployeeData("UpdatedEmployeeInfo.txt");
        displayEmployeeData(updatedEmployees);
    }
}
