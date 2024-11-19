package org.example;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        int x = 6;
        int y = 20;
        int z = 30;

        double eq1 = (2 * x * x) + (y * y);
        double eq2 = (3 * x) + y - (3 * z * z);
        double eq3 = (2 * x) - (2 * y) + (5 * z * z);

        System.out.println("Equation 1 is : " + eq1);
        System.out.println("Equation 2 is : " + eq2);
        System.out.println("Equation 3 is : " + eq3);
    }
}
