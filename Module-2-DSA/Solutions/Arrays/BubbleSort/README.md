# Bubble Sort

## Problem Statement
Implement the Bubble Sort algorithm to sort an array of integers in ascending order. Optimize the algorithm using a `swapped` flag to exit early if the array becomes sorted before all passes complete.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(n)$ (Array is already sorted)
  - Average Case: $\mathcal{O}(n^2)$
  - Worst Case: $\mathcal{O}(n^2)$ (Array is sorted in reverse order)
- **Space Complexity**: $\mathcal{O}(1)$ (In-place sorting)

---

## Input and Output Examples

### Sample Input
```text
Array: [64, 34, 25, 12, 22, 11, 90]
```

### Expected Output
```text
=== Bubble Sort Demonstration ===
Original Array: 64 34 25 12 22 11 90 
Sorted Array: 11 12 22 25 34 64 90 
```
