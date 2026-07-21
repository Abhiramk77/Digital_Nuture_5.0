# Exercise 2: E-commerce Search

## Objective
Implement linear and binary search for product lookup.

## Problem Statement
Search for products by ID and by price range in an inventory list.

## Approach Used
- `LinearSearch` scans products in insertion order
- `BinarySearch` searches a sorted product array by ID
- `EcommerceSearchTest` compares both methods with sample data

## Code Structure
- `Product.java`: product model with ID, name, price, quantity
- `LinearSearch.java`: search by ID and price range
- `BinarySearch.java`: iterative and recursive ID search
- `EcommerceSearchTest.java`: sample products and test cases

## Sample Output
```
Product found at index 0 after 1 comparisons
Result: Product{ID=105, Name='Laptop', Price=45000.00, Qty=5}

Found 4 products in price range ₹500.0 - ₹2000.0
```

## Time Complexity
- Linear search: O(n)
- Binary search: O(log n)

## Learning Outcome
Understand when to use linear search versus binary search and how sorting affects search choice.
