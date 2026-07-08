# Merge Sort

## Problem Statement
Implement the Merge Sort algorithm to sort an array of integers in ascending order. This uses the divide-and-conquer strategy, recursively partitioning the array and merging sub-lists back in sorted order.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(n \log n)$
  - Average Case: $\mathcal{O}(n \log n)$
  - Worst Case: $\mathcal{O}(n \log n)$
- **Space Complexity**: $\mathcal{O}(n)$ (Requires auxiliary memory to merge subarrays)

---

## Input and Output Examples

### Sample Input
```text
Array: [38, 27, 43, 3, 9, 82, 10]
```

### Expected Output
```text
=== Merge Sort Demonstration ===
Original Array: 38 27 43 3 9 82 10 
Sorted Array: 3 9 10 27 38 43 82 
```
