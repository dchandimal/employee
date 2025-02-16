package com.company.employee.repository;

import com.company.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for managing Employee entities.
 * Provides methods for retrieving employees by department ID.
 *
 * Author: D.C. Ukwaththage
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Finds employees by their department ID.
     *
     * @param departmentId the ID of the department
     * @return a list of employees in the specified department
     */
    List<Employee> findByDepartmentId(Long departmentId);
}