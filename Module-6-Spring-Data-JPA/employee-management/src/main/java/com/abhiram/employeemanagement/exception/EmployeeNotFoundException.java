package com.abhiram.employeemanagement.exception;

// Thrown when an employee is not found in the database
public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Long id) {
        super("Employee with ID " + id + " not found");
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
