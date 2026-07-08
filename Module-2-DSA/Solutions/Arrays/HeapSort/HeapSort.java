package com.digitalnurture.dsa.arrays.heapsort;

/**
 * Heap Sort implementation in Java.
 * Uses a binary max-heap to sort the array elements.
 */
public class HeapSort {

    /**
     * Sorts the array using Heap Sort.
     */
    public void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * To heapify a subtree rooted with node i which is an index in arr[].
     * @param n size of heap
     * @param i root node index
     */
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Heap Sort Demonstration ===");
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.print("Original Array: ");
        printArray(arr);

        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
