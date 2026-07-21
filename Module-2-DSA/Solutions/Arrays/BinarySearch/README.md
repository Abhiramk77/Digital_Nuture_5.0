# Binary Search

## Problem Statement
Search for a target key in a pre-sorted integer array. Use the divide-and-conquer strategy to narrow down the search interval by half on each iteration.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(1)$ (Target is exactly at the middle element on first iteration)
  - Average Case: $\mathcal{O}(\log n)$
  - Worst Case: $\mathcal{O}(\log n)$
- **Space Complexity**: $\mathcal{O}(1)$ (Iterative approach requires constant space)

---

## Input and Output Examples

### Sample Input
```text
Sorted Array: [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
Target Key: 23
```

### Expected Output
```text
=== Binary Search Demonstration ===
Element 23 found at index: 5
```
