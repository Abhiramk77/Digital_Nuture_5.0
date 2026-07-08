package com.digitalnurture.tdd.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * EmployeeProfile model class demonstrating Lombok annotations.
 * Lombok automatically generates constructors, getters, setters, toString representation, and builder patterns.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmployeeProfile {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
}
