package com.company.employee.service;

import com.company.employee.entity.Employee;
import com.company.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing employees.
 * Provides methods for saving, retrieving, and managing employees.
 *
 * Author: D.C. Ukwaththage
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Saves a new employee.
     *
     * @param employee the employee to be saved
     * @return the saved employee
     */
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Retrieves all employees.
     *
     * @return a list of all employees
     */
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param id the ID of the employee to be retrieved
     * @return an Optional containing the employee if found, or empty if not found
     */
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    /**
     * Retrieves employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees in the specified department
     */
    public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }
}