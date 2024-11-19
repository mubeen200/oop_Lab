package org.example;

import java.util.*;
public class Main{

    public static int ComputeOddSum(int input) {
        if (input <= 0) {
            return 0;
        }
        if (input % 2 != 0) {
            return input + ComputeOddSum(input - 2);
        } else {
            return ComputeOddSum(input - 1);
        }
    }

    public static int ComputeEvenSum(int input) {
        if (input <= 0) {
            return 0;
        }
        if (input % 2 == 0) {
            return input + ComputeEvenSum(input - 2);
        } else {
            return ComputeEvenSum(input - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int input = scanner.nextInt();

            if (input < 0) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.println("Sum of all odd numbers less than " + input + ": " + ComputeOddSum(input - 1));
            System.out.println("Sum of all even numbers less than " + input + ": " + ComputeEvenSum(input - 1));
        }

    }
}
