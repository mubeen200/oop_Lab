package org.example;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int num1, num2;

        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Sum is : " + (num1 + num2));
        System.out.println("Difference is : " + (num1 - num2));
        System.out.println("Product is : " + (num1 * num2));
    }
}
