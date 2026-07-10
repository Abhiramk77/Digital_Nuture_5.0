package com.digitalnurture.dsa.arrays.traversal;

public class ArrayTraversal {
    public void traverseForward(int[] arr) {
        System.out.print("Forward Traversal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void traverseBackward(int[] arr) {
        System.out.print("Backward Traversal: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Array Traversal Demonstration ===");
        int[] sampleArray = {12, 35, 9, 56, 23};

        ArrayTraversal demo = new ArrayTraversal();
        demo.traverseForward(sampleArray);
        demo.traverseBackward(sampleArray);
    }
}
