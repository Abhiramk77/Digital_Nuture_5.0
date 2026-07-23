package com.abhiram.employeemanagement.controller;

import com.abhiram.employeemanagement.dto.EmployeeDTO;
import com.abhiram.employeemanagement.entity.Employee;
import com.abhiram.employeemanagement.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // 1. Add Employee
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody EmployeeDTO dto) {
        log.info("REST request to add employee: {}", dto);
        Employee createdEmployee = employeeService.addEmployee(dto);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    // 2. View All Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        log.info("REST request to get all employees");
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    // 3. View Employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        log.info("REST request to get employee by ID: {}", id);
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    // 4. Update Employee
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDTO dto) {
        log.info("REST request to update employee with ID: {}", id);
        return ResponseEntity.ok(employeeService.updateEmployee(id, dto));
    }

    // 5. Delete Employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        log.info("REST request to delete employee with ID: {}", id);
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully with ID: " + id);
    }

    // 6. Search Employee by Department
    @GetMapping("/department/{department}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String department) {
        log.info("REST request to search employees by department: {}", department);
        return ResponseEntity.ok(employeeService.getEmployeesByDepartment(department));
    }

    // Custom query search by name
    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchByName(@RequestParam String name) {
        log.info("REST request to search employees by name: {}", name);
        return ResponseEntity.ok(employeeService.searchByName(name));
    }

    // 7 & 8. Pagination and Sorting
    @GetMapping("/paged")
    public ResponseEntity<Page<Employee>> getEmployeesWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {
        log.info("REST request for paginated employees page={}, size={}, sortBy={}, direction={}", page, size, sortBy, direction);
        return ResponseEntity.ok(employeeService.getEmployeesWithPagination(page, size, sortBy, direction));
    }
}
