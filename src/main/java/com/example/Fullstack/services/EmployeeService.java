package com.example.Fullstack.services;

import com.example.Fullstack.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);


    Employee getEmployeeById(Long id);


    Employee updateEmployee(Long id, Employee e);
}
