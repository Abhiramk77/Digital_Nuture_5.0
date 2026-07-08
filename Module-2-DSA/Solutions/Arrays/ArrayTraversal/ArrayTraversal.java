package com.digitalnurture.dsa.arrays.traversal;

/**
 * Array Traversal implementation in Java.
 * Demonstrates basic forward and backward traversal operations on a 1D array.
 */
public class ArrayTraversal {
    
    /**
     * Traverses the array in forward direction and prints elements.
     */
    public void traverseForward(int[] arr) {
        System.out.print("Forward Traversal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Traverses the array in backward direction and prints elements.
     */
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
