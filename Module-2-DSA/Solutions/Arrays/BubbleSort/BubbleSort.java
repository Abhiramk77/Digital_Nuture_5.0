package com.digitalnurture.dsa.arrays.bubblesort;

public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Bubble Sort Demonstration ===");
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original Array: ");
        printArray(arr);

        BubbleSort bs = new BubbleSort();
        bs.sort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
