package com.digitalnurture.dsa.linkedlist.singly;

/**
 * Singly Linked List implementation in Java.
 * Supports insertion, deletion, and traversal operations.
 */
public class SinglyLinkedList {
    private Node head;

    // Node structure
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Inserts a new node at the end of the list.
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * Deletes the first occurrence of a key.
     */
    public void delete(int key) {
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /**
     * Prints the contents of the singly linked list.
     */
    public void traverse() {
        Node temp = head;
        System.out.print("Singly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        System.out.println("=== Singly Linked List Demonstration ===");
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertion
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.traverse();

        // Deletion
        System.out.println("Deleting 20...");
        list.delete(20);
        list.traverse();

        System.out.println("Deleting 10 (head)...");
        list.delete(10);
        list.traverse();
    }
}
