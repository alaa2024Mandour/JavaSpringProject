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
    public Employee saveEmployee(@RequestBody Employee employee) {
       return employeeServiceInt.saveEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        if(employee != null){
            System.out.println("Employee updated DONE");
        }
       return employeeServiceInt.updateEmployee(employee);
    }

    @PatchMapping
    public  Employee patchEmployee(@RequestBody Employee employee) {
       if(employee != null){
           if (employee.getName() != null){
               System.out.println("Employee Name updated DONE");
           }
           if (employee.getSalary() != null){
               System.out.println("Employee Salary updated DONE");
           }
           if (employee.getAddress() != null){
               System.out.println("Employee Address updated DONE");
           }
       }
       return employeeServiceInt.patchUpdateEmployee(employee);
    }

    @DeleteMapping
    public void deleteEmployeeById(@RequestParam Long id) {
       employeeServiceInt.deleteEmployee(id);
    }

}
