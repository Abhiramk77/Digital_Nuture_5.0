package com.digitalnurture.dsa.arrays.mergesort;

/**
 * Merge Sort implementation in Java.
 * Uses a divide-and-conquer strategy to divide the array recursively and merge the sorted halves.
 */
public class MergeSort {

    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     */
    private void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = l; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Main function that sorts arr[l..r] using merge()
     */
    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Merge Sort Demonstration ===");
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.print("Original Array: ");
        printArray(arr);

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
