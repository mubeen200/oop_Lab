package org.example;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        float[] celsius = {289f, 400f, -36f, -180f};
        float f;

        for (float i : celsius) {
            f = (i * 9 / 5) + 32;
            System.out.println(f);
        }
    }
}
