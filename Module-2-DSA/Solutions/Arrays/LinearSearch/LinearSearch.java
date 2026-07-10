package com.digitalnurture.dsa.arrays.linearsearch;

public class LinearSearch {
    public int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
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
