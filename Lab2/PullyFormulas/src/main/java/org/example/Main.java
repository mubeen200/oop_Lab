package org.example;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        double rpm1,rpm2,diameter1,diameter2;
        int weightLifted,numberOfUpRopes,forceExerted;
        rpm1 = 540;
        diameter1 = 4;
        diameter2 = 6;
        rpm2 = (diameter1/diameter2) * rpm1;
        forceExerted = 100;
        numberOfUpRopes = 5;
        weightLifted = forceExerted * numberOfUpRopes;
        System.out.println("RPM2 = " + rpm2);
        System.out.println("Weight Lifter = " + weightLifted);
    }
}
