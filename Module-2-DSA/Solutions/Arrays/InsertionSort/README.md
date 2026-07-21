# Insertion Sort

## Problem Statement
Implement the Insertion Sort algorithm to sort an array of integers in ascending order. This algorithm builds the sorted list one element at a time by shifting elements to the right.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(n)$ (Array is already sorted; inner loop runs in $\mathcal{O}(1)$)
  - Average Case: $\mathcal{O}(n^2)$
  - Worst Case: $\mathcal{O}(n^2)$ (Array is sorted in reverse order)
- **Space Complexity**: $\mathcal{O}(1)$ (In-place sorting)

---

## Input and Output Examples

### Sample Input
```text
Array: [12, 11, 13, 5, 6]
```

### Expected Output
```text
=== Insertion Sort Demonstration ===
Original Array: 12 11 13 5 6 
Sorted Array: 5 6 11 12 13 
```
