package com.alx.employee.employee.controller;

import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.Project;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.service.EmployeeService;
import com.alx.employee.employee.service.EmployeeServiceInt;
import com.alx.employee.employee.service.ProjectService;
import com.alx.employee.employee.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   private final EmployeeServiceInt employeeServiceInt;

   EmployeeController(EmployeeServiceInt employeeServiceInt) {
       this.employeeServiceInt = employeeServiceInt;
   }

    @GetMapping("/getEmployee")
    public Employee getEmployeeById() {
        return  employeeServiceInt.findEmployeeById("A'laa Yasser");
    }

}
