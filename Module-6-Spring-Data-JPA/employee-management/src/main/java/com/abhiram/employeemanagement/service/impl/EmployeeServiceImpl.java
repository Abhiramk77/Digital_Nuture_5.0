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
import java.util.Optional;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public Employee addEmployee(EmployeeDTO dto) {
        log.info("Adding employee with email: {}", dto.getEmail());

        // Check duplicate email using simple if condition
        Optional<Employee> existingOpt = employeeRepository.findByEmail(dto.getEmail());
        if (existingOpt.isPresent()) {
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
    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees() {
        log.info("Getting all employees list");
        return employeeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Employee getEmployeeById(Long id) {
        log.info("Getting employee with id: {}", id);
        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (empOpt.isEmpty()) {
            throw new EmployeeNotFoundException(id);
        }
        return empOpt.get();
    }

    @Override
    @Transactional
    public Employee updateEmployee(Long id, EmployeeDTO dto) {
        log.info("Updating employee with id: {}", id);

        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (empOpt.isEmpty()) {
            throw new EmployeeNotFoundException(id);
        }

        Employee emp = empOpt.get();

        // Check duplicate email if changed
        if (!emp.getEmail().equalsIgnoreCase(dto.getEmail())) {
            Optional<Employee> emailCheck = employeeRepository.findByEmail(dto.getEmail());
            if (emailCheck.isPresent()) {
                throw new DuplicateEmailException(dto.getEmail());
            }
        }

        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());

        return employeeRepository.save(emp);
    }

    @Override
    @Transactional
    public void deleteEmployee(Long id) {
        log.info("Deleting employee with id: {}", id);
        Optional<Employee> empOpt = employeeRepository.findById(id);
        if (empOpt.isEmpty()) {
            throw new EmployeeNotFoundException(id);
        }
        employeeRepository.delete(empOpt.get());
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getEmployeesByDepartment(String department) {
        log.info("Finding employees in department: {}", department);
        return employeeRepository.findByDepartmentIgnoreCase(department);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> searchByName(String name) {
        log.info("Searching employees with name: {}", name);
        return employeeRepository.searchByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Employee> getEmployeesWithPagination(int page, int size, String sortBy, String direction) {
        log.info("Getting page {} of employees sorted by {}", page, sortBy);

        Sort sort = Sort.by(sortBy).ascending();
        if ("desc".equalsIgnoreCase(direction)) {
            sort = Sort.by(sortBy).descending();
        }

        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Employee> getEmployeesByDepartmentPaged(String department, int page, int size) {
        log.info("Getting page {} of department {}", page, department);
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findByDepartmentIgnoreCase(department, pageable);
    }
}
