package com.springthymeleaf.thymeleafdemo.services;

import com.springthymeleaf.thymeleafdemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
