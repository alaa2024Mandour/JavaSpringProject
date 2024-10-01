package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public EmployeeRepo employeeRepo= new EmployeeRepo();

    public Employee findEmployeeById(String name){
        return employeeRepo.findEmployeeById(name);
    }
}
