package org.example;

import java.util.*;
public class Main {

    public static int getProduct(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * getProduct(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = getProduct(number);
        System.out.println("The product of all numbers from 1 to " + number + " is: " + result);
    }
}
