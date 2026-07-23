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

    // Find employees by department
    List<Employee> findByDepartment(String department);

    // Find employee by email
    Optional<Employee> findByEmail(String email);

    // Custom JPQL query to search employee by name
    @Query("SELECT e FROM Employee e WHERE LOWER(e.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Employee> searchByName(@Param("name") String name);

    // Pagination for department
    Page<Employee> findByDepartment(String department, Pageable pageable);
}
