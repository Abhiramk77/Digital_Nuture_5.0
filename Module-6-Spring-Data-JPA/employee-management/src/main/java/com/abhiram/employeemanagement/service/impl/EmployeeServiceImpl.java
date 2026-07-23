package com.abhiram.employeemanagement.service.impl;

import com.abhiram.employeemanagement.dto.EmployeeDTO;
import com.abhiram.employeemanagement.entity.Employee;
import com.abhiram.employeemanagement.exception.DuplicateEmailException;
import com.abhiram.employeemanagement.exception.EmployeeNotFoundException;
import com.abhiram.employeemanagement.repository.EmployeeRepository;
import com.abhiram.employeemanagement.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // Constructor injection
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public Employee addEmployee(EmployeeDTO dto) {
        log.info("Adding new employee with email: {}", dto.getEmail());

        // Check if email already exists
        if (employeeRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new DuplicateEmailException(dto.getEmail());
        }

        Employee employee = new Employee();
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setDepartment(dto.getDepartment());
        employee.setSalary(dto.getSalary());

        return employeeRepository.save(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees() {
        log.info("Fetching all employees");
        return employeeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Employee getEmployeeById(Long id) {
        log.info("Fetching employee by ID: {}", id);
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @Override
    @Transactional
    public Employee updateEmployee(Long id, EmployeeDTO dto) {
        log.info("Updating employee with ID: {}", id);

        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        // If email is changing, ensure new email is not taken by another user
        if (!existing.getEmail().equalsIgnoreCase(dto.getEmail())
                && employeeRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new DuplicateEmailException(dto.getEmail());
        }

        existing.setName(dto.getName());
        existing.setEmail(dto.getEmail());
        existing.setDepartment(dto.getDepartment());
        existing.setSalary(dto.getSalary());

        return employeeRepository.save(existing);
    }

    @Override
    @Transactional
    public void deleteEmployee(Long id) {
        log.info("Deleting employee with ID: {}", id);
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
        employeeRepository.delete(existing);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getEmployeesByDepartment(String department) {
        log.info("Fetching employees by department: {}", department);
        return employeeRepository.findByDepartmentIgnoreCase(department);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> searchByName(String name) {
        log.info("Searching employees by name pattern: {}", name);
        return employeeRepository.searchByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Employee> getEmployeesWithPagination(int page, int size, String sortBy, String direction) {
        log.info("Fetching paginated employees page={}, size={}, sortBy={}, direction={}", page, size, sortBy, direction);
        
        Sort sort = direction.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
                Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Employee> getEmployeesByDepartmentPaged(String department, int page, int size) {
        log.info("Fetching paginated employees for department: {}, page={}, size={}", department, page, size);
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findByDepartmentIgnoreCase(department, pageable);
    }
}
