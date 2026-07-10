package com.digitalnurture.dsa.linkedlist.circular;

public class CircularLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Circular List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head: " + head.data + ")");
    }

    public static void main(String[] args) {
        System.out.println("=== Circular Linked List Demonstration ===");
        CircularLinkedList list = new CircularLinkedList();

        list.insert(5);
        list.insert(15);
        list.insert(25);
        list.insert(35);

        list.traverse();
    }
}
