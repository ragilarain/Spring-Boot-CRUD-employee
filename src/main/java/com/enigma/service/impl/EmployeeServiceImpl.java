package com.enigma.service.impl;

import com.enigma.Exception.BadRequstException;
import com.enigma.Exception.NotFoundException;
import com.enigma.entity.Employee;
import com.enigma.entity.Position;
import com.enigma.repository.EmployeeRepo;
import com.enigma.service.EmployeeService;
import com.enigma.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    PositionService positionService;

    @Override
    public Employee getById(Integer id) {
        if (!employeeRepo.findById(id).isPresent()) {
            throw new NotFoundException("Id not found");
        }
        return employeeRepo.findById(id).get();
    }

    @Override
    public Employee insertEmployee(Employee employee) {
        if (employeeRepo.existsEmployeeByIdNumber(employee.getIdNumber())) {
            throw new BadRequstException("NIP was using by another employee. Find another NIP");
        }
        System.out.println(employee.getPositionIdTransient());
        Position position = positionService.getById(employee.getPositionIdTransient());
        employee.setPositionId(position);
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }
}
