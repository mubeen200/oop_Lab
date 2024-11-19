package org.example;

import java.util.*;
public class Main{
    public static void main(String[] args) {

        int totalCookiesProduced = 1000;
        int cookiesPerBox = 12;
        int boxesPerCarton = 24;
        double pricePerBox = 1.14;
        double pricePerLeftoverBox = 0.57;

        int fullBoxes = totalCookiesProduced / cookiesPerBox;
        int leftoverCookies = totalCookiesProduced % cookiesPerBox;

        int fullCartons = fullBoxes / boxesPerCarton;
        int leftoverBoxes = fullBoxes % boxesPerCarton;

        double earningsFromCartons = fullCartons * boxesPerCarton * pricePerBox;
        double earningsFromLeftoverBoxes = leftoverBoxes * pricePerLeftoverBox;
        double totalEarnings = earningsFromCartons + earningsFromLeftoverBoxes;

        System.out.println("Full cartons: " + fullCartons);
        System.out.println("Leftover boxes: " + leftoverBoxes);
        System.out.println("Leftover cookies: " + leftoverCookies);
        System.out.println("Total earnings: $" + String.format("%.2f", totalEarnings));
    }
}
