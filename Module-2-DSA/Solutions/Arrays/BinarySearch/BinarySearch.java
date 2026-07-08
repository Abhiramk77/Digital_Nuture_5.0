package com.digitalnurture.dsa.arrays.binarysearch;

/**
 * Binary Search implementation in Java.
 * Performs search on a sorted array by dividing search intervals in half.
 */
public class BinarySearch {

    /**
     * Binary Search implementation using iterative approach.
     * @return index of key if found, otherwise -1.
     */
    public int search(int[] sortedArr, int key) {
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow

            // Check if key is present at mid
            if (sortedArr[mid] == key) {
                return mid;
            }

            // If key greater, ignore left half
            if (sortedArr[mid] < key) {
                low = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        System.out.println("=== Binary Search Demonstration ===");
        int[] sortedArr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        BinarySearch bs = new BinarySearch();
        int resultIndex = bs.search(sortedArr, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
