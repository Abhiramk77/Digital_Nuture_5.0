# Singly Linked List

## Problem Statement
Implement a Singly Linked List supporting:
1. Append Insertion: Adding elements to the tail of the list.
2. Deletion: Unlinking elements matching a target data value.
3. Traversal: Accessing elements sequentially starting from the head.

---

## Complexity Analysis
- **Time Complexity**:
  - Insertion (at tail): $\mathcal{O}(n)$ (If maintaining tail pointer, it is $\mathcal{O}(1)$)
  - Deletion: $\mathcal{O}(n)$ (Searching for key takes linear time)
  - Traversal: $\mathcal{O}(n)$
- **Space Complexity**: $\mathcal{O}(n)$ (Memory scaling linearly with total node allocations)

---

## Input and Output Examples

### Sample Execution Steps
1. Insert: `10`, `20`, `30`, `40`
2. Delete: `20`
3. Delete: `10` (head node removal)

### Expected Output
```text
=== Singly Linked List Demonstration ===
Singly Linked List: 10 -> 20 -> 30 -> 40 -> NULL
Deleting 20...
Singly Linked List: 10 -> 30 -> 40 -> NULL
Deleting 10 (head)...
Singly Linked List: 30 -> 40 -> NULL
```
