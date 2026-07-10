package com.digitalnurture.dsa.arrays.binarysearch;

public class BinarySearch {
    public int search(int[] sortedArr, int key) {
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sortedArr[mid] == key) {
                return mid;
            }

            if (sortedArr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
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
