package com.alx.employee.employee.controller;
import com.alx.employee.employee.entity.CustomResponse;
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
    public CustomResponse<EmployeeDTO> getEmployeeById() {
       EmployeeDTO employeeDTO = employeeServiceInt.findEmployeeById(1L);
        return  new CustomResponse<>("01","Success",employeeDTO);
    }

    @GetMapping
    public CustomResponse<List<EmployeeDTO>> findAllEmployee (){
        List<EmployeeDTO> employeeDTO = employeeServiceInt.findAllEmployees();
        return  new CustomResponse<>("01","Success",employeeDTO);
    }

    @PostMapping
    public CustomResponse<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO _employeeDTO) {
        EmployeeDTO employeeDTO = employeeServiceInt.saveEmployee(_employeeDTO);
       return new CustomResponse<>("01","Success",employeeDTO);
    }

    @PutMapping
    public CustomResponse<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO _employeeDTO) {
        if(_employeeDTO != null){
            System.out.println("Employee updated DONE");
        }
        EmployeeDTO employeeDTO = employeeServiceInt.updateEmployee(_employeeDTO);
        return new CustomResponse<>("01","Success",employeeDTO);
    }

    @PatchMapping
    public CustomResponse<EmployeeDTO> patchEmployee(@RequestBody EmployeeDTO _employeeDTO , @RequestParam Long employeeId) {
        EmployeeDTO employeeDTO = employeeServiceInt.patchUpdateEmployee(_employeeDTO, employeeId);
        return new CustomResponse<>("01","Success",employeeDTO);
    }

    @DeleteMapping
    public void deleteEmployeeById(@RequestParam Long id) {
       employeeServiceInt.deleteEmployee(id);
    }

    @GetMapping("/byFirstName")
    public CustomResponse<EmployeeDTO> findEmployeeByFirstName(@RequestParam String firstName) {
        EmployeeDTO employeeDTO = employeeServiceInt.findByFirstName(firstName);
        return new CustomResponse<>("01","Success",employeeDTO);
    }

    @GetMapping("/employeesByAddress")
    public CustomResponse<List<EmployeeDTO>> findAllEmployeesBySalary(@RequestParam String address) {
        List<EmployeeDTO> employeeDTO =  employeeServiceInt.findEmployeeEntitiesByAddress(address);
        return new CustomResponse<>("01","Success",employeeDTO);
    }


    @PutMapping("/assignProject")
    public CustomResponse<EmployeeDTO> assignProjectEmployee(@RequestBody EmployeeDTO _employeeDTO,@RequestParam Long projectId) {
        EmployeeDTO employeeDTO =  employeeServiceInt.assignProjectToEmployee(_employeeDTO,projectId);
        return new CustomResponse<>("01","Success",employeeDTO);
    }
}
