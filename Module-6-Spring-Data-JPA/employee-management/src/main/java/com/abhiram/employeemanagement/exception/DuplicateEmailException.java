package com.abhiram.employeemanagement.exception;

// Thrown when trying to add an employee with an email that already exists
public class DuplicateEmailException extends RuntimeException {

    public DuplicateEmailException(String email) {
        super("An employee with email '" + email + "' already exists");
    }
}
