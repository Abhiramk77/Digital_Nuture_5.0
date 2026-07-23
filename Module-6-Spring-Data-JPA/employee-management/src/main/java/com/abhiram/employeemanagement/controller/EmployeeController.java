package com.abhiram.employeemanagement.controller;

import com.abhiram.employeemanagement.dto.EmployeeDTO;
import com.abhiram.employeemanagement.entity.Employee;
import com.abhiram.employeemanagement.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // 1. Add Employee
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody EmployeeDTO dto) {
        log.info("REST request to add employee");
        Employee emp = employeeService.addEmployee(dto);
        return new ResponseEntity<>(emp, HttpStatus.CREATED);
    }

    // 2. View All Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        log.info("REST request to view all employees");
        List<Employee> list = employeeService.getAllEmployees();
        return ResponseEntity.ok(list);
    }

    // 3. View Employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        log.info("REST request to view employee by id: {}", id);
        Employee emp = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(emp);
    }

    // 4. Update Employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDTO dto) {
        log.info("REST request to update employee id: {}", id);
        Employee updated = employeeService.updateEmployee(id, dto);
        return ResponseEntity.ok(updated);
    }

    // 5. Delete Employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        log.info("REST request to delete employee id: {}", id);
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    // 6. Search Employee by Department
    @GetMapping("/department/{department}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String department) {
        log.info("REST request to search by department: {}", department);
        List<Employee> list = employeeService.getEmployeesByDepartment(department);
        return ResponseEntity.ok(list);
    }

    // Custom query search by name
    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchByName(@RequestParam String name) {
        log.info("REST request to search by name: {}", name);
        List<Employee> list = employeeService.searchByName(name);
        return ResponseEntity.ok(list);
    }

    // 7 & 8. Pagination and Sorting
    @GetMapping("/paged")
    public ResponseEntity<Page<Employee>> getEmployeesWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {
        log.info("REST request for pagination");
        Page<Employee> pagedResult = employeeService.getEmployeesWithPagination(page, size, sortBy, direction);
        return ResponseEntity.ok(pagedResult);
    }
}
