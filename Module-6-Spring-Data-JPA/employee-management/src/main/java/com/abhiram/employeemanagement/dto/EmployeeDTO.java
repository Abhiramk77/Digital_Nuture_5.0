package com.abhiram.employeemanagement.dto;

import jakarta.validation.constraints.*;
import lombok.*;

// DTO used for creating and updating employees
// Keeps the API contract separate from the entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Please enter a valid email")
    private String email;

    @NotBlank(message = "Department is required")
    private String department;

    @NotNull(message = "Salary cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be a positive value")
    private Double salary;
}
