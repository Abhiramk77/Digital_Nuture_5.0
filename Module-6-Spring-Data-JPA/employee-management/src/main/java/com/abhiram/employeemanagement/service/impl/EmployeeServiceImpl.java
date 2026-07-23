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

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(EmployeeDTO dto) {
        log.info("Adding employee: {}", dto.getEmail());

        // Check if email already exists
        Optional<Employee> check = employeeRepository.findByEmail(dto.getEmail());
        if (check.isPresent()) {
            throw new DuplicateEmailException(dto.getEmail());
        }

        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());

        return employeeRepository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        log.info("Fetching all employees");
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        log.info("Fetching employee ID: {}", id);
        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (!empOpt.isPresent()) {
            throw new EmployeeNotFoundException(id);
        }
        return empOpt.get();
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO dto) {
        log.info("Updating employee ID: {}", id);

        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (!empOpt.isPresent()) {
            throw new EmployeeNotFoundException(id);
        }

        Employee emp = empOpt.get();

        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());

        return employeeRepository.save(emp);
    }

    @Override
    public void deleteEmployee(Long id) {
        log.info("Deleting employee ID: {}", id);

        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (!empOpt.isPresent()) {
            throw new EmployeeNotFoundException(id);
        }

        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        log.info("Fetching department: {}", department);
        return employeeRepository.findByDepartmentIgnoreCase(department);
    }

    @Override
    public List<Employee> searchByName(String name) {
        log.info("Searching name: {}", name);
        return employeeRepository.searchByName(name);
    }

    @Override
    public Page<Employee> getEmployeesWithPagination(int page, int size, String sortBy, String direction) {
        log.info("Fetching page: {}", page);

        Sort sort = Sort.by(sortBy).ascending();
        if (direction.equalsIgnoreCase("desc")) {
            sort = Sort.by(sortBy).descending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> getEmployeesByDepartmentPaged(String department, int page, int size) {
        log.info("Fetching department page: {}", page);
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findByDepartmentIgnoreCase(department, pageable);
    }
}
