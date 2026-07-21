package com.digitalnurture.dsa.arrays.quicksort;

public class QuickSort {
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

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
