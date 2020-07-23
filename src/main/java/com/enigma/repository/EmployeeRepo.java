package com.enigma.repository;

import com.enigma.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    boolean existsEmployeeByIdNumber(Integer id);
}
