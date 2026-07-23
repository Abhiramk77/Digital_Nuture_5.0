# Module 6: Spring Data JPA with Spring Boot and Hibernate - Employee Management System

**Developer**: Abhiram  
**Technology Stack**: Java 17, Spring Boot 3.2.5, Spring Data JPA, Hibernate, MySQL, Lombok, Maven

---

## 📌 Project Overview

This project is a complete RESTful Web Service for managing employee records built as part of **Module 6: Spring Data JPA**. It follows standard Java layered architecture (Controller -> Service -> Repository -> Entity) and utilizes modern features like Spring Data JPA query methods, custom JPQL queries, DTO validation, global exception handling, and logging.

---

## 🚀 Features

1. **Add Employee** - Create new employee with validation (unique email, positive salary).
2. **View All Employees** - Fetch complete list of employees.
3. **View Employee by ID** - Retrieve specific employee details or handle `404 Not Found`.
4. **Update Employee** - Update existing employee data with validations.
5. **Delete Employee** - Remove employee by ID.
6. **Search by Department** - Find employees belonging to a specific department.
7. **Search by Name** - Custom JPQL query for case-insensitive partial match search.
8. **Pagination & Sorting** - Pageable requests with custom sort direction and page size.
9. **Global Exception Handling** - Consistent JSON error responses for `404 Not Found`, `400 Bad Request` (validation), `409 Conflict` (duplicate email), and generic `500`.
10. **SLF4J Logging** - Logging service operations and controller request execution.

---

## 📁 Project Structure

```
employee-management/
│
├── src/main/java
│   └── com/abhiram/employeemanagement/
│       ├── config/
│       ├── controller/
│       │   └── EmployeeController.java
│       ├── dto/
│       │   └── EmployeeDTO.java
│       ├── entity/
│       │   └── Employee.java
│       ├── exception/
│       │   ├── DuplicateEmailException.java
│       │   ├── EmployeeNotFoundException.java
│       │   └── GlobalExceptionHandler.java
│       ├── repository/
│       │   └── EmployeeRepository.java
│       ├── service/
│       │   ├── EmployeeService.java
│       │   └── impl/
│       │       └── EmployeeServiceImpl.java
│       └── EmployeeManagementApplication.java
│
├── src/main/resources
│   ├── application.properties
│   └── data.sql
│
├── pom.xml
├── README.md
├── Postman_Collection.json
└── .gitignore
```

---

## 🛠️ Database Setup (MySQL)

1. Ensure MySQL server is installed and running on port `3306`.
2. Create the database schema:
   ```sql
   CREATE DATABASE employee_db;
   ```
3. Update `src/main/resources/application.properties` with your database credentials if different:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=root
   ```

---

## 🏃 How to Run

1. Open the project in VS Code / IntelliJ IDEA.
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot Application:
   ```bash
   mvn spring-boot:run
   ```
   Or run `EmployeeManagementApplication.java` directly from your IDE.

---

## 📡 API Documentation & Endpoints

| Method | Endpoint | Description | Request Body / Params |
|--------|----------|-------------|-----------------------|
| `POST` | `/api/employees` | Add new employee | JSON (EmployeeDTO) |
| `GET` | `/api/employees` | Get all employees | None |
| `GET` | `/api/employees/{id}` | Get employee by ID | None |
| `PUT` | `/api/employees/{id}` | Update employee | JSON (EmployeeDTO) |
| `DELETE` | `/api/employees/{id}` | Delete employee | None |
| `GET` | `/api/employees/department/{dept}` | Search by department | None |
| `GET` | `/api/employees/search?name={name}` | Search by name (JPQL) | `name` query param |
| `GET` | `/api/employees/paged` | Pagination & Sorting | `page`, `size`, `sortBy`, `direction` |

---

## 🧪 Testing with Postman

Import `Postman_Collection.json` included in the root directory into Postman to test all endpoints out-of-the-box.
