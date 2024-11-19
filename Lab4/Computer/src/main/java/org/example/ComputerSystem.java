package org.example;

import java.util.Scanner;

public class ComputerSystem {

    private String name;
    private String type;
    private String processor;
    private int ram;
    private int hardDrive;
    private String motherboard;
    private String opticalDrive;

    public ComputerSystem() {
        name = "Unknown";
        type = "Unknown";
        processor = "Unknown";
        ram = 0;
        hardDrive = 0;
        motherboard = "Unknown";
        opticalDrive = "None";
    }

    public void get() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Computer System Details:");

        System.out.print("Enter System Name: ");
        name = scanner.nextLine();

        System.out.print("Enter System Type (e.g., Desktop, Laptop): ");
        type = scanner.nextLine();

        System.out.print("Enter Processor Specifications: ");
        processor = scanner.nextLine();

        System.out.print("Enter RAM (in GB): ");
        ram = scanner.nextInt();

        System.out.print("Enter Hard Disk Drive (in GB): ");
        hardDrive = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Motherboard: ");
        motherboard = scanner.nextLine();

        System.out.print("Does it have an Optical Drive (Yes/No)? ");
        opticalDrive = scanner.nextLine();
    }

    public void display() {
        System.out.println("\n--- Computer System Information ---");
        System.out.println("System Name: " + name);
        System.out.println("System Type: " + type);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard Disk Drive: " + hardDrive + " GB");
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Optical Drive: " + opticalDrive);
    }

    public void modify() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWould you like to modify any of the details? (Yes/No)");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("Yes")) {
            System.out.println("What would you like to modify?");
            System.out.println("1. System Name");
            System.out.println("2. System Type");
            System.out.println("3. Processor");
            System.out.println("4. RAM");
            System.out.println("5. Hard Disk Drive");
            System.out.println("6. Motherboard");
            System.out.println("7. Optical Drive");
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter new System Name: ");
                    name = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new System Type: ");
                    type = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new Processor Specifications: ");
                    processor = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new RAM (in GB): ");
                    ram = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Enter new Hard Disk Drive (in GB): ");
                    hardDrive = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Enter new Motherboard: ");
                    motherboard = scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Does it have an Optical Drive (Yes/No)? ");
                    opticalDrive = scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Would you like to modify any other details? (Yes/No)");
            response = scanner.nextLine();
        }
    }

    public static void main(String[] args) {

        ComputerSystem computer = new ComputerSystem();

        computer.get();

        computer.display();

        computer.modify();

        computer.display();
    }
}
