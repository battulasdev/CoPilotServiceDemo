package org.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

/**
 * Service implementation for Employee operations
 */
@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    /**
     * Constructor injection for EmployeeRepository
     * @param employeeRepository the employee repository
     */
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Get an employee by name
     * @param name the employee name
     * @return Optional containing the employee if found
     */
    @Override
    public Optional<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}

