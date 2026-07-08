package com.digitalnurture.dsa.arrays.quicksort;

/**
 * Quick Sort implementation in Java.
 * Uses a pivot element to partition the array into smaller and larger element subarrays.
 */
public class QuickSort {

    /**
     * Partitions the array around a pivot (last element in this case).
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * Main recursive quicksort algorithm.
     */
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            // partitionIndex is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Quick Sort Demonstration ===");
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.print("Original Array: ");
        printArray(arr);

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
