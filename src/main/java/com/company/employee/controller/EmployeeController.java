package com.company.employee.controller;

import com.company.employee.entity.Employee;
import com.company.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing employees.
 * Provides endpoints for creating, retrieving, and managing employees.
 *
 * Author: D.C. Ukwaththage
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Endpoint to save a new employee.
     *
     * @param employee the employee to be saved
     * @return the saved employee
     */
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    /**
     * Endpoint to retrieve all employees.
     *
     * @return a list of all employees
     */
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    /**
     * Endpoint to retrieve an employee by their ID.
     *
     * @param id the ID of the employee to be retrieved
     * @return the employee with the specified ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    /**
     * Endpoint to retrieve employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees in the specified department
     */
    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartmentId(@PathVariable Long departmentId) {
        return ResponseEntity.ok(employeeService.getEmployeesByDepartmentId(departmentId));
    }
}