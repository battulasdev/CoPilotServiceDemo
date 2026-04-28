package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    /**
     * Find an employee by name
     * @param name the employee name
     * @return Optional containing the employee if found
     */
    Optional<Employee> findByName(String name);
}
