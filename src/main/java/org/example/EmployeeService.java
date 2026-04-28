package org.example;

import java.util.Optional;

/**
 * Service interface for Employee operations
 */
public interface EmployeeService {

    /**
     * Get an employee by name
     * @param name the employee name
     * @return Optional containing the employee if found
     */
    Optional<Employee> getEmployeeByName(String name);
}

