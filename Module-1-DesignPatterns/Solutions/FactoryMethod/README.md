# Factory Method Design Pattern

## Pattern Explanation
The Factory Method Pattern is a **Creational Design Pattern** that defines an interface for creating an object, but lets subclasses decide which class to instantiate. The Factory Method lets a class defer instantiation to subclasses.

It is particularly useful when:
- A class cannot anticipate the class of objects it must create.
- A class wants its subclasses to specify the objects it creates.

---

## Class Details
- **`Document.java`**: Product interface defining document operations.
- **`WordDocument.java`**: Concrete product implementing Word operations.
- **`PdfDocument.java`**: Concrete product implementing PDF operations.
- **`DocumentFactory.java`**: Creator base class declaring the factory method.
- **`WordDocumentFactory.java`**: Concrete creator generating Word documents.
- **`PdfDocumentFactory.java`**: Concrete creator generating PDF documents.
- **`Main.java`**: Client application driver.

---

## How to Compile & Run
Navigate to the root of the FactoryMethod package and run:
```bash
cd src
javac com/digitalnurture/designpatterns/factorymethod/*.java
java com.digitalnurture.designpatterns.factorymethod.Main
```

## Example Output
```text
=== Testing Factory Method Pattern ===
Using Word Document Factory:
Opening Microsoft Word Document...
Closing Microsoft Word Document...

Using PDF Document Factory:
Opening Adobe PDF Document...
Closing Adobe PDF Document...
```
