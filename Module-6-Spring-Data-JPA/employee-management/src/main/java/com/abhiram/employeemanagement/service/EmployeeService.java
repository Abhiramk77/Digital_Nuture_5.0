package com.abhiram.employeemanagement.service;

import com.abhiram.employeemanagement.dto.EmployeeDTO;
import com.abhiram.employeemanagement.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(EmployeeDTO dto);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, EmployeeDTO dto);

    void deleteEmployee(Long id);

    List<Employee> getEmployeesByDepartment(String department);

    List<Employee> searchByName(String name);

    // Pagination + sorting
    Page<Employee> getEmployeesWithPagination(int page, int size, String sortBy, String direction);

    // Paginated search by department
    Page<Employee> getEmployeesByDepartmentPaged(String department, int page, int size);
}
