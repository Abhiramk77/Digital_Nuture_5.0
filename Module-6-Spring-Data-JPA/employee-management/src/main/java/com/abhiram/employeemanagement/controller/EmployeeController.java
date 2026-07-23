package com.abhiram.employeemanagement.controller;

import com.abhiram.employeemanagement.dto.EmployeeDTO;
import com.abhiram.employeemanagement.entity.Employee;
import com.abhiram.employeemanagement.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
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
    public Employee addEmployee(@Valid @RequestBody EmployeeDTO dto) {
        log.info("Adding employee");
        return employeeService.addEmployee(dto);
    }

    // 2. View All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        log.info("Getting all employees");
        return employeeService.getAllEmployees();
    }

    // 3. View Employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        log.info("Getting employee by id: {}", id);
        return employeeService.getEmployeeById(id);
    }

    // 4. Update Employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDTO dto) {
        log.info("Updating employee id: {}", id);
        return employeeService.updateEmployee(id, dto);
    }

    // 5. Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        log.info("Deleting employee id: {}", id);
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully with ID: " + id;
    }

    // 6. Search Employee by Department
    @GetMapping("/department/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
        log.info("Searching department: {}", department);
        return employeeService.getEmployeesByDepartment(department);
    }

    // Custom query search by name
    @GetMapping("/search")
    public List<Employee> searchByName(@RequestParam String name) {
        log.info("Searching name: {}", name);
        return employeeService.searchByName(name);
    }

    // 7 & 8. Pagination and Sorting
    @GetMapping("/paged")
    public Page<Employee> getEmployeesWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {
        log.info("Getting page {} of employees", page);
        return employeeService.getEmployeesWithPagination(page, size, sortBy, direction);
    }
}
