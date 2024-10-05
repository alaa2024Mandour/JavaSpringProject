package com.alx.employee.employee.controller;
import com.alx.employee.employee.entity.CustomResponse;
import com.alx.employee.employee.model.EmployeeDTO;
import com.alx.employee.employee.service.EmployeeServiceInt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee/view")
public class EmployeeViewController {
   private final EmployeeServiceInt employeeServiceInt;

   EmployeeViewController(EmployeeServiceInt employeeServiceInt) {
       this.employeeServiceInt = employeeServiceInt;
   }

    @GetMapping("/getEmployee")
    public String getEmployeeById(Long id, Model model){
       EmployeeDTO employeeDTO = employeeServiceInt.findEmployeeById(id);
        CustomResponse<EmployeeDTO> customResponse =new CustomResponse(
                "01",
                "Success",
                employeeDTO);
        model.addAttribute("employee", customResponse.getData());
        return "emp";
    }

    @GetMapping
    public String findAllEmployee (Model model){
        List<EmployeeDTO> employeeDTO = employeeServiceInt.findAllEmployees();
        CustomResponse<List<EmployeeDTO>> customResponse = new CustomResponse<>("01","Success",employeeDTO);
        model.addAttribute("employee", customResponse.getData());
        return  "allEmp";
    }

    @GetMapping("/saveEmployee")
    public String saveEmployee(Model model) {
        model.addAttribute("employee", new EmployeeDTO());
        return "AddEmp";
    }

    @PostMapping
    public String saveEmployee(EmployeeDTO _employeeDTO , Model model) {
        EmployeeDTO employeeDTO = employeeServiceInt.saveEmployee(_employeeDTO);
        model.addAttribute("employee", new EmployeeDTO());
        return "AddEmp";
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
    public ResponseEntity<?> patchEmployee(@RequestBody EmployeeDTO _employeeDTO , @RequestParam Long employeeId) {
        EmployeeDTO employeeDTO = employeeServiceInt.patchUpdateEmployee(_employeeDTO, employeeId);
        CustomResponse<EmployeeDTO> customResponse = new CustomResponse<>("01","Success",employeeDTO);
        return new ResponseEntity<>(customResponse, HttpStatus.ALREADY_REPORTED);
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
