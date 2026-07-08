# Linear Search

## Problem Statement
Scan a given integer array from left to right to find the target element. If found, print the index of the element; otherwise, print that the element was not found.

---

## Complexity Analysis
- **Time Complexity**:
  - Best Case: $\mathcal{O}(1)$ (Target is the first element)
  - Average Case: $\mathcal{O}(n)$
  - Worst Case: $\mathcal{O}(n)$ (Target is the last element or not present)
- **Space Complexity**: $\mathcal{O}(1)$ (In-place search)

---

## Input and Output Examples

### Sample Input
```text
Array: [10, 20, 80, 30, 60, 50, 110, 100, 130, 170]
Target Key: 110
```

### Expected Output
```text
=== Linear Search Demonstration ===
Element 110 found at index: 6
```
