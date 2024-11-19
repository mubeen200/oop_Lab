package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] Mat_1 = new int[3][3];
        int[][] Mat_2 = new int[3][3];

        System.out.println("Enter values for Matrix Mat_1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Mat_1[" + i + "][" + j + "]: ");
                Mat_1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEnter values for Matrix Mat_2 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Mat_2[" + i + "][" + j + "]: ");
                Mat_2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nResult of (Mat_1 * 3) + (Mat_2)²:");
        int[][] result1 = addMatrices(multiplyMatrix(Mat_1, 3), squareMatrix(Mat_2));
        printMatrix(result1);

        System.out.println("\nResult of (Mat_2 - 3)²:");
        int[][] result2 = squareMatrix(subtractMatrix(Mat_2, 3));
        printMatrix(result2);

        System.out.println("\nResult of (Mat_2 * 5) - (Mat_1 - 2):");
        int[][] result3 = subtractMatrices(multiplyMatrix(Mat_2, 5), subtractMatrix(Mat_1, 2));
        printMatrix(result3);

        scanner.close();
    }

    public static int[][] multiplyMatrix(int[][] matrix, int scalar) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    public static int[][] squareMatrix(int[][] matrix) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] * matrix[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrix(int[][] matrix, int scalar) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] - scalar;
            }
        }
        return result;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
