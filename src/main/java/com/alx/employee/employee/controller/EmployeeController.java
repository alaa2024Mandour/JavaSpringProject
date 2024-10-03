package com.alx.employee.employee.controller;
import com.alx.employee.employee.model.EmployeeDTO;
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
    public EmployeeDTO getEmployeeById() {
        return  employeeServiceInt.findEmployeeById(1L);
    }

    @GetMapping
    public List<EmployeeDTO> findAllEmployee (){
       return employeeServiceInt.findAllEmployees();
    }

    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
       return employeeServiceInt.saveEmployee(employeeDTO);
    }

    @PutMapping
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        if(employeeDTO != null){
            System.out.println("Employee updated DONE");
        }
       return employeeServiceInt.updateEmployee(employeeDTO);
    }

    @PatchMapping
    public EmployeeDTO patchEmployee(@RequestBody EmployeeDTO employeeDTO) {
       return employeeServiceInt.patchUpdateEmployee(employeeDTO);
    }

    @DeleteMapping
    public void deleteEmployeeById(@RequestParam Long id) {
       employeeServiceInt.deleteEmployee(id);
    }

}
