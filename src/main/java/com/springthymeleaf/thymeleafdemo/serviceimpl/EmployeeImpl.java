package com.springthymeleaf.thymeleafdemo.serviceimpl;

import com.springthymeleaf.thymeleafdemo.Entity.Employee;
import com.springthymeleaf.thymeleafdemo.Repository.EmployeeRepository;
import com.springthymeleaf.thymeleafdemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl  implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List< Employee > getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional< Employee > optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

}
