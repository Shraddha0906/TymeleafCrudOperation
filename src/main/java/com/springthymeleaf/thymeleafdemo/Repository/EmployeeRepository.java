package com.springthymeleaf.thymeleafdemo.Repository;

import com.springthymeleaf.thymeleafdemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
    