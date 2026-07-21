# Circular Linked List

## Problem Statement
Implement a Circular Singly Linked List (CLL) where the final node's pointer references back to the head node, forming a continuous ring. Demonstrate insertion and round-robin traversal.

---

## Complexity Analysis
- **Time Complexity**:
  - Insertion (at tail): $\mathcal{O}(n)$ (Searching the last node)
  - Traversal: $\mathcal{O}(n)$ (Loop terminating when matching head node reference)
- **Space Complexity**: $\mathcal{O}(n)$

---

## Input and Output Examples

### Sample Input
```text
Insert: 5, 15, 25, 35
```

### Expected Output
```text
=== Circular Linked List Demonstration ===
Circular Linked List: 5 -> 15 -> 25 -> 35 -> (head: 5)
```
