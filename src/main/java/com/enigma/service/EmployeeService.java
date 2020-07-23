package com.enigma.service;

import com.enigma.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getById(Integer id);
    public Employee insertEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Integer employee);
    public List<Employee> getEmployees();
}
