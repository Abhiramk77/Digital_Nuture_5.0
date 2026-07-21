# Module 2 Notes

## Linear Search
- Check each item in order until the target is found.
- Works on unsorted data.
- Time complexity: O(n).
- Use for small arrays or one-time searches.

## Binary Search
- Works only on sorted arrays.
- Compare the middle element and narrow the range each step.
- Iterative version uses O(1) space.
- Recursive version uses O(log n) stack space.
- Time complexity: O(log n).

## Recursion in Financial Forecasting
- Base case: year 0 returns principal.
- Recursive step: future value at year n is previous year value × (1 + rate).
- Naive recursion is simple but uses stack frames.
- Iterative approach uses a loop and is more direct.
- Formula approach uses `Math.pow()` and is the fastest.

## Practical Points
- Use binary search when the list is sorted and there are many lookups.
- Use recursion for problems that naturally break into smaller sub-problems.
- Prefer formula or iterative code for numeric forecasting when possible.
