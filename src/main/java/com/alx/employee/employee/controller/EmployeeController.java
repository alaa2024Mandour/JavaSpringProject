package com.alx.employee.employee.controller;
import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.service.EmployeeServiceInt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
   private final EmployeeServiceInt employeeServiceInt;

   EmployeeController(EmployeeServiceInt employeeServiceInt) {
       this.employeeServiceInt = employeeServiceInt;
   }

    @GetMapping("/getEmployee")
    public Employee getEmployeeById() {
        return  employeeServiceInt.findEmployeeById(1L);
    }

    @GetMapping
    public List<Employee> findAllEmployee (){
       return employeeServiceInt.findAllEmployees();
    }

    @PostMapping
    public Employee saveEmployee(Employee employee) {
       return  employeeServiceInt.saveEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(Employee employee) {
       return employeeServiceInt.updateEmployee(employee);
    }

    @PatchMapping
    public  Employee patchEmployee(Employee employee) {
       return employeeServiceInt.updateEmployee(employee);
    }

    @DeleteMapping
    public void deleteEmployeeById(Long id) {}

}
