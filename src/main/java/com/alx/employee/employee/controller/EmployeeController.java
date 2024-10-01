package com.alx.employee.employee.controller;

import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/getEmployee")
    public Employee getEmployeeById() {
        return  employeeService.findEmployeeById("A'laa Yasser");
    }
}
