# Heap Sort

## Problem Statement
Implement the Heap Sort algorithm to sort an array of integers in ascending order. This method constructs a binary max-heap out of the input, then repeatedly extracts the maximum element and restores the heap.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(n \log n)$
  - Average Case: $\mathcal{O}(n \log n)$
  - Worst Case: $\mathcal{O}(n \log n)$
- **Space Complexity**: $\mathcal{O}(1)$ (In-place sort, heap is structured within original array)

---

## Input and Output Examples

### Sample Input
```text
Array: [12, 11, 13, 5, 6, 7]
```

### Expected Output
```text
=== Heap Sort Demonstration ===
Original Array: 12 11 13 5 6 7 
Sorted Array: 5 6 7 11 12 13 
```
