package com.digitalnurture.dsa.linkedlist.doubly;

/**
 * Doubly Linked List implementation in Java.
 * Supports bi-directional traversal, insertion, and deletion.
 */
public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Node structure
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    /**
     * Inserts a new node at the end.
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /**
     * Deletes a node with target key.
     */
    public void delete(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                // If node is head
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null; // List became empty
                    }
                }
                // If node is tail
                else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                }
                // Middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    /**
     * Forward traversal.
     */
    public void traverseForward() {
        Node temp = head;
        System.out.print("Forward:  NULL <- ");
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <=> " : ""));
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }

    /**
     * Backward traversal.
     */
    public void traverseBackward() {
        Node temp = tail;
        System.out.print("Backward: NULL <- ");
        while (temp != null) {
            System.out.print(temp.data + (temp.prev != null ? " <=> " : ""));
            temp = temp.prev;
        }
        System.out.println(" -> NULL");
    }

    public static void main(String[] args) {
        System.out.println("=== Doubly Linked List Demonstration ===");
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.traverseForward();
        list.traverseBackward();

        System.out.println("Deleting 200 (middle)...");
        list.delete(200);
        list.traverseForward();

        System.out.println("Deleting 300 (tail)...");
        list.delete(300);
        list.traverseForward();
    }
}
