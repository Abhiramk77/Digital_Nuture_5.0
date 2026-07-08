# Digital Nurture 5.0 - Java FSE React Portfolio

## Student Information
- **Name:** Abhi Ram
- **Program:** Digital Nurture 5.0
- **Track:** Java Full Stack Engineer (Java FSE) + React
- **Status:** Complete (Modules 1 - 4)

---

## Program Overview
This repository contains the complete portfolio of programming assignments, design patterns, algorithmic implementations, PL/SQL scripts, and testing setups required for the completion of the Digital Nurture 5.0 program.

---

## Folder Structure
```text
DigitalNurture_AbhiRam/
├── README.md
├── LICENSE
├── Module-1-DesignPatterns/
│   ├── Exercises/
│   ├── Solutions/
│   │   ├── Singleton/
│   │   ├── FactoryMethod/
│   │   ├── Builder/
│   │   ├── Adapter/
│   │   ├── Decorator/
│   │   ├── Proxy/
│   │   ├── Observer/
│   │   ├── Strategy/
│   │   └── Command/
│   └── Screenshots/
├── Module-2-DSA/
│   ├── Exercises/
│   ├── Solutions/
│   │   ├── Arrays/
│   │   └── LinkedList/
│   └── Screenshots/
├── Module-3-PLSQL/
│   ├── Scripts/
│   ├── Output/
│   └── README/
├── Module-4-TDD/
│   ├── JUnit/
│   ├── Mockito/
│   ├── Logging/
│   ├── Lombok/
│   └── README/
└── Resources/
    ├── Notes/
    ├── LearningLinks/
    ├── GitHubGuide/
    └── SubmissionGuide/
```

---

## Technical Prerequisites & Stack Versions
The projects are configured and tested with the following technology versions:

| Component | Technology | Version |
| :--- | :--- | :--- |
| **Language** | Java Development Kit (JDK) | 17 / 21 |
| **Build Tool** | Apache Maven | 3.8+ |
| **Database** | Oracle SQL / PL/SQL | 19c / 21c |
| **Testing** | JUnit | 5.10.2 |
| **Mocking** | Mockito | 5.11.0 |
| **Logging** | SLF4J (with Logback) | 2.0.12 |
| **Boilerplate** | Project Lombok | 1.18.30 |

---

## Modules Detailed Summary

### [Module 1: Design Patterns and Principles](./Module-1-DesignPatterns/)
Contains separate Java projects implementing 9 structural, creational, and behavioral design patterns:
1. **Singleton**: Thread-safe database/logger configuration.
2. **Factory Method**: Dynamic document generation.
3. **Builder**: Highly-configurable computer builder.
4. **Adapter**: Adapting legacy/third-party payment gateway to modern application interface.
5. **Decorator**: Layered communication alerts system (SMS, Email, Slack).
6. **Proxy**: Heavy resources caching proxy pattern.
7. **Observer**: Real-time stock update notification system.
8. **Strategy**: Flexibly choosing transaction payment algorithms.
9. **Command**: Remote smart automation command execution patterns.

### [Module 2: Data Structures and Algorithms](./Module-2-DSA/)
Focuses on Java-based implementation of standard search, sort, traversal algorithms, and fundamental data structures:
- **Arrays**: Linear Traversal, Linear Search, Binary Search.
- **Sorting**: Bubble Sort, Insertion Sort, Merge Sort, Quick Sort, Heap Sort.
- **Linked Lists**: Singly, Doubly, and Circular Linked Lists.
- Detailed time and space complexity explanations included.

### [Module 3: PLSQL Programming](./Module-3-PLSQL/)
Consists of standard PL/SQL exercises including Variables, Loops, Case-structures, Custom Exception Handling, Cursor management, Stored Procedures, Functions, Packages, and Triggers.

### [Module 4: Test Driven Development & Logging](./Module-4-TDD/)
Showcases best practices in Unit Testing, Mocking, and Logging across 4 separate Maven projects:
- **JUnit**: Asserts, AAA Pattern, Parameterized tests.
- **Mockito**: Mocking Repository & REST API layers.
- **Logging**: SLF4J & Logback implementation.
- **Lombok**: Builder, Getter, Setter, and Slf4j annotation integration.

---

## Running the Projects

### Running Java Code (Module 1 & 2)
Navigate to the specific pattern or algorithm solution directory and execute:
```bash
javac Main.java
java Main
```

### Running PL/SQL scripts (Module 3)
Connect to your local Oracle SQL database instance and run the script:
```sql
@path/to/script.sql;
```

### Running TDD Maven Tests (Module 4)
From the specific project directory (`JUnit/`, `Mockito/`, `Logging/`, or `Lombok/`), run:
```bash
mvn clean test
```

---

## Author & Submission Details
- **Student Name:** Abhi Ram
- **Program:** Digital Nurture 5.0 (Java FSE React)
- **Submission Date:** July 2026
