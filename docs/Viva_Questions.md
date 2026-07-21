# Viva Questions

## Module 1

1. What is the Singleton pattern?  
A pattern that ensures only one instance of a class exists and provides a single access point.

2. Why use a private constructor in Singleton?  
To prevent direct creation of the class from outside.

3. How does `getInstance()` work?  
It returns the existing instance or creates it if it does not exist.

4. Why is the simple singleton version not thread-safe?  
Two threads can create separate instances at the same time.

5. What does the Factory Method pattern do?  
It creates objects using a method instead of direct construction.

6. What are the main parts of the Factory Method example?  
`Document` interface, concrete document classes, and `DocumentFactory`.

7. How do you add a new document type?  
Create a new class implementing `Document` and update the factory.

8. What is the benefit of using a factory?  
It keeps client code independent of concrete classes.

9. When should you use Singleton vs Factory Method?  
Use Singleton for one shared instance and Factory for flexible object creation.

10. What is the Open/Closed Principle in this context?  
You can add new document types without changing existing client code.

## Module 2

11. What is Linear Search?  
A search that checks each element one by one.

12. When is Linear Search a good choice?  
When data is unsorted or the list is small.

13. What is the time complexity of Linear Search?  
O(n).

14. What is Binary Search?  
A search that divides a sorted list into halves.

15. Why must data be sorted for Binary Search?  
Because the algorithm decides direction based on the middle element.

16. What is the time complexity of Binary Search?  
O(log n).

17. What is recursion?  
A function calling itself with a smaller input.

18. What are the two key parts of recursion?  
The base case and the recursive case.

19. How does the financial forecasting recursive method work?  
It applies interest year by year, using the previous year’s result.

20. Why is the formula method preferred for compound interest?  
It is faster and uses constant time.
