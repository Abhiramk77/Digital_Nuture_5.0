package com.abhiram.employeemanagement.repository;

import com.abhiram.employeemanagement.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query method - Spring Data generates the SQL automatically
    List<Employee> findByDepartment(String department);

    // Case-insensitive department search
    List<Employee> findByDepartmentIgnoreCase(String department);

    // Check if email already exists (used during add/update)
    Optional<Employee> findByEmail(String email);

    // Find employees with salary above a given amount
    List<Employee> findBySalaryGreaterThan(Double salary);

    // JPQL custom query to search by name (partial match, case-insensitive)
    @Query("SELECT e FROM Employee e WHERE LOWER(e.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Employee> searchByName(@Param("name") String name);

    // Paginated result for a specific department
    Page<Employee> findByDepartmentIgnoreCase(String department, Pageable pageable);

    // Count employees per department
    @Query("SELECT e.department, COUNT(e) FROM Employee e GROUP BY e.department")
    List<Object[]> countByDepartment();
}
