# Quick Sort

## Problem Statement
Implement the Quick Sort algorithm to sort an array of integers in ascending order. This uses the partition-based divide-and-conquer strategy, selecting a pivot element and ordering elements relative to it.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(n \log n)$ (Balanced partitions)
  - Average Case: $\mathcal{O}(n \log n)$
  - Worst Case: $\mathcal{O}(n^2)$ (Unbalanced partitions, e.g. pivot is always the smallest or largest element)
- **Space Complexity**: $\mathcal{O}(\log n)$ (Stack frame allocation for recursive partitioning)

---

## Input and Output Examples

### Sample Input
```text
Array: [10, 7, 8, 9, 1, 5]
```

### Expected Output
```text
=== Quick Sort Demonstration ===
Original Array: 10 7 8 9 1 5 
Sorted Array: 1 5 7 8 9 10 
```
