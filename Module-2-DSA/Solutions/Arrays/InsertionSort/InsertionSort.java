package com.digitalnurture.dsa.arrays.insertionsort;

/**
 * Insertion Sort implementation in Java.
 * Builds the final sorted array one item at a time by shifting elements.
 */
public class InsertionSort {

    /**
     * Sorts the array using Insertion Sort.
     */
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Insertion Sort Demonstration ===");
        int[] arr = {12, 11, 13, 5, 6};

        System.out.print("Original Array: ");
        printArray(arr);

        InsertionSort is = new InsertionSort();
        is.sort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
