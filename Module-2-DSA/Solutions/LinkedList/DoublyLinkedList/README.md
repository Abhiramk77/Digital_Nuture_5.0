# Doubly Linked List

## Problem Statement
Implement a Doubly Linked List (DLL) where each node retains a reference to both its next and previous nodes, enabling bi-directional traversal, insertion, and deletion.

---

## Complexity Analysis
- **Time Complexity**:
  - Insertion (at tail): $\mathcal{O}(1)$ (Using tail pointer)
  - Deletion: $\mathcal{O}(n)$ (Searching key takes linear time)
  - Forward/Backward Traversal: $\mathcal{O}(n)$
- **Space Complexity**: $\mathcal{O}(n)$

---

## Input and Output Examples

### Sample Execution Steps
1. Insert: `100`, `200`, `300`
2. Forward Traversal
3. Backward Traversal
4. Delete `200`
5. Delete `300`

### Expected Output
```text
=== Doubly Linked List Demonstration ===
Forward:  NULL <- 100 <=> 200 <=> 300 -> NULL
Backward: NULL <- 300 <=> 200 <=> 100 -> NULL
Deleting 200 (middle)...
Forward:  NULL <- 100 <=> 300 -> NULL
Deleting 300 (tail)...
Forward:  NULL <- 100 -> NULL
```
