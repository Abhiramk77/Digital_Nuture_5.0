package com.abhiram.employeemanagement.service.impl;

import com.abhiram.employeemanagement.dto.EmployeeDTO;
import com.abhiram.employeemanagement.entity.Employee;
import com.abhiram.employeemanagement.exception.DuplicateEmailException;
import com.abhiram.employeemanagement.exception.EmployeeNotFoundException;
import com.abhiram.employeemanagement.repository.EmployeeRepository;
import com.abhiram.employeemanagement.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // 1. Add Employee
    @Override
    public Employee addEmployee(EmployeeDTO dto) {
        log.info("Adding employee with email: {}", dto.getEmail());

        Optional<Employee> checkEmail = employeeRepository.findByEmail(dto.getEmail());
        if (checkEmail.isPresent()) {
            throw new DuplicateEmailException(dto.getEmail());
        }

        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());

        return employeeRepository.save(emp);
    }

    // 2. View All Employees
    @Override
    public List<Employee> getAllEmployees() {
        log.info("Getting all employees");
        return employeeRepository.findAll();
    }

    // 3. View Employee by ID
    @Override
    public Employee getEmployeeById(Long id) {
        log.info("Getting employee by id: {}", id);
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    // 4. Update Employee
    @Override
    public Employee updateEmployee(Long id, EmployeeDTO dto) {
        log.info("Updating employee with id: {}", id);

        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());

        return employeeRepository.save(emp);
    }

    // 5. Delete Employee
    @Override
    public void deleteEmployee(Long id) {
        log.info("Deleting employee with id: {}", id);

        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        employeeRepository.delete(emp);
    }

    // 6. Search Employee by Department
    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        log.info("Searching department: {}", department);
        return employeeRepository.findByDepartment(department);
    }

    // Custom query search by name
    @Override
    public List<Employee> searchByName(String name) {
        log.info("Searching name: {}", name);
        return employeeRepository.searchByName(name);
    }

    // 7 & 8. Pagination and Sorting
    @Override
    public Page<Employee> getEmployeesWithPagination(int page, int size, String sortBy, String direction) {
        log.info("Fetching page {} sorted by {}", page, sortBy);

        Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page, size, sort);

        return employeeRepository.findAll(pageable);
    }
}
