package com.digitalnurture.tdd.lombok;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeProfileTest {
    @Test
    @DisplayName("Verify Lombok Builder and Getters")
    void testLombokBuilderAndGetters() {
        EmployeeProfile emp = EmployeeProfile.builder()
                .employeeId(101)
                .firstName("Abhi")
                .lastName("Ram")
                .email("abhiram@fse.com")
                .salary(85000.00)
                .build();

        assertEquals(101, emp.getEmployeeId());
        assertEquals("Abhi", emp.getFirstName());
        assertEquals("Ram", emp.getLastName());
        assertEquals("abhiram@fse.com", emp.getEmail());
        assertEquals(85000.00, emp.getSalary());
    }

    @Test
    @DisplayName("Verify Lombok Setters")
    void testLombokSetters() {
        EmployeeProfile emp = new EmployeeProfile();
        emp.setFirstName("John");
        emp.setSalary(60000.00);

        assertEquals("John", emp.getFirstName());
        assertEquals(60000.00, emp.getSalary());
    }

    @Test
    @DisplayName("Verify Lombok toString format")
    void testLombokToString() {
        EmployeeProfile emp = new EmployeeProfile(102, "Sarah", "Davis", "sarah@fse.com", 50000.00);
        String expectedToString = "EmployeeProfile(employeeId=102, firstName=Sarah, lastName=Davis, email=sarah@fse.com, salary=50000.0)";

        assertEquals(expectedToString, emp.toString());
    }
}
