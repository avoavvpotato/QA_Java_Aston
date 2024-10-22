package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Practical task 1
        System.out.println("Function printThreeWords");
        printThreeWords();

        //Practical task 2
        System.out.println("\nFunction checkSumSign");
        checkSumSign();

        //Practical task 3
        System.out.println("\nFunction printColor");
        printColor();

        //Practical task 4
        System.out.println("\nFunction compareNumbers");
        compareNumbers();

        //Practical task 5
        System.out.println("\nFunction checkSumRange for 9 and 1: " + checkSumRange(9, 1));
        System.out.println("Function checkSumRange for 8 and 1: " + checkSumRange(8, 1));

        //Practical task 6
        System.out.println("\nFunction checkNumberPrint function");
        checkNumberPrint(0);

        //Practical task 7
        System.out.println("\nFunction checkNumber for -1: " + checkNumber(-1));
        System.out.println("Function checkNumber for 0: " + checkNumber(0));

        //Practical task 8
        System.out.println("\nFunction printString function");
        printString("Hello", 3);

        //Practical task 9
        System.out.println("\nFunction isLeapYear function for 100: " + isLeapYear(100));
        System.out.println("Function isLeapYear function for 4: " + isLeapYear(4));
        System.out.println("Function isLeapYear function for 800: " + isLeapYear(800));

        //Practical task 10
        int[] binaryArray = {0, 1, 0, 0, 1, 1, 0, 1, 0, 1};

        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }

        System.out.println("\nPractical task 10: " + Arrays.toString(binaryArray));

        //Practical task 11
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        System.out.println("\nPractical task 11: " + Arrays.toString(array));

        //Practical task 12
        int [] givenArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < 6) {
                givenArray[i] *= 2;
            }
        }

        System.out.println("\nPractical task 12: " + Arrays.toString(givenArray));

        //Practical task 13
        int size = 6;
        int [][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - j - 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println("\nPractical task 13:");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        //Practical task 14
        System.out.println("\nPractical task 14: " + Arrays.toString(createArray(10, 5)));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -7;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 30;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumberPrint(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean checkNumber(int a) {
        return a < 0;
    }

    public static void printString(String string, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        Arrays.fill(array, initialValue);

        return array;
    }
}