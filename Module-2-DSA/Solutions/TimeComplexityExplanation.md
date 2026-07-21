# Time Complexity Explanation

This guide provides a comprehensive summary of the time and space complexities for all the data structures and algorithms implemented in Module 2.

## Algorithms and Operations Complexity Table

| Algorithm / Operation | Best Case Time | Average Case Time | Worst Case Time | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Array Traversal** | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ |
| **Linear Search** | $\mathcal{O}(1)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ |
| **Binary Search** | $\mathcal{O}(1)$ | $\mathcal{O}(\log n)$ | $\mathcal{O}(\log n)$ | $\mathcal{O}(1)$ |
| **Bubble Sort** | $\mathcal{O}(n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(1)$ |
| **Insertion Sort** | $\mathcal{O}(n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(1)$ |
| **Merge Sort** | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n)$ |
| **Quick Sort** | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(\log n)$ |
| **Heap Sort** | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(1)$ |
| **Singly Linked List** | $\mathcal{O}(1)$ (head) | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ |
| **Doubly Linked List** | $\mathcal{O}(1)$ (head/tail) | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ |
| **Circular Linked List**| $\mathcal{O}(1)$ (head) | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ |

## Detailed Insights

1. **Sorting Efficiencies**:
   - **Merge Sort** guarantees $\mathcal{O}(n \log n)$ time performance but requires extra auxiliary space $\mathcal{O}(n)$ to hold the divided array values during merges.
   - **Quick Sort** is highly efficient in practice (typically outperforming Merge Sort due to cache locality), but in the worst case (when the array is already sorted and we pick the last element as pivot), the performance degrades to $\mathcal{O}(n^2)$.
   - **Heap Sort** offers in-place sorting ($\mathcal{O}(1)$ auxiliary space) while guaranteeing $\mathcal{O}(n \log n)$ time complexity across all cases.

2. **Linked Lists**:
   - Operations at the head (insertion, deletion) are $\mathcal{O}(1)$.
   - Accessing or deleting an arbitrary element at a specific index requires traversing the chain, which is $\mathcal{O}(n)$.
