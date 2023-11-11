package org.fasttrackit.won14.curs7.homework7extramile;

public class Main {
    public static void main(String[] args) {
        int array[] = {8, 7, 2, 5, 3, 1};
        printAllPairs(array, 10);
        printAllTriplets(array, 10);
    }

    public static void printAllPairs(int array[], int givenSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == givenSum) {
                    System.out.println(array[i] + ", " + array[j]);
                }
            }
        }
    }

    public static void printAllTriplets(int array[], int givenSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == givenSum) {
                        System.out.println(array[i] + ", " + array[j] + ", " + array[k]);
                    }
                }
            }
        }
    }
}
