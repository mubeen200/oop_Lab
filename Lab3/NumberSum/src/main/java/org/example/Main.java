package org.example;

import java.util.*;
public class Main {

    public static int sumBetween(int start, int end) {
        if (start > end) {
            return 0;
        }
        return start + sumBetween(start + 1, end);
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 20;

        int result = sumBetween(num1, num2);
        System.out.println("The sum of all numbers between " + num1 + " and " + num2 + " is: " + result);
    }
}
