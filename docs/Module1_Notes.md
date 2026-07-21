# Module 1 Notes

## Singleton Pattern
- Use when only one instance should exist in the application.
- Implementation:
  - private constructor
  - static instance field
  - public static `getInstance()` method
- Current Logger is lazy initialized.
- Risk: not thread-safe in this version.
- Common use cases: logs, configuration, cache, database connection.

## Factory Method Pattern
- Use when object creation should be separated from object use.
- Define a simple product interface, then implement concrete products.
- Use a factory method to return the right product.
- Adding a new product type requires changing only the factory.
- Current example: `DocumentFactory` returns `WordDocument`, `PdfDocument`, or `ExcelDocument`.

## Notes
- The factory improves code organization by moving creation logic out of client code.
- The singleton limits object instantiation to one shared instance.
