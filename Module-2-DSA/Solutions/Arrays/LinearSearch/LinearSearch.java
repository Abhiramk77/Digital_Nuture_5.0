package com.digitalnurture.dsa.arrays.linearsearch;

/**
 * Linear Search implementation in Java.
 * Sequentially checks each element of the list until a match is found.
 */
public class LinearSearch {

    /**
     * Searches for a target key in the array.
     * @return index of target key if found, otherwise -1.
     */
    public int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Key found at index i
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        System.out.println("=== Linear Search Demonstration ===");
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int target = 110;

        LinearSearch ls = new LinearSearch();
        int resultIndex = ls.search(arr, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
