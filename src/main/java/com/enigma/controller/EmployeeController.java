package com.enigma.controller;

import com.enigma.entity.Employee;
import com.enigma.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @CrossOrigin
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    @CrossOrigin
    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }
    @CrossOrigin
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
    @CrossOrigin
    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable Integer id) {
        return employeeService.getById(id);
    }
    @CrossOrigin
    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }
}
