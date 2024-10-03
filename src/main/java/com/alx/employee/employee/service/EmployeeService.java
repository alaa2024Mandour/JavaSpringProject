package com.alx.employee.employee.service;
import com.alx.employee.employee.entity.EmployeeEntity;
import com.alx.employee.employee.model.EmployeeDTO;
import com.alx.employee.employee.repo.EmployeeRepoInt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceInt {

    private EmployeeEntity mapEmployeeToEntity(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setName(employeeDTO.getName());
        employeeEntity.setSalary(employeeDTO.getSalary());
        return employeeEntity;
    }

    private EmployeeDTO mapEmployeeToDTO(EmployeeEntity employeeEntity) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeEntity.getId());
        employeeDTO.setName(employeeEntity.getName());
        employeeDTO.setSalary(employeeEntity.getSalary());
        return employeeDTO;
    }

    public EmployeeRepoInt employeeRepoInt;

    EmployeeService(EmployeeRepoInt employeeRepoInt) {
        this.employeeRepoInt = employeeRepoInt;
    }

    @Override
    public EmployeeDTO findEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepoInt.findEmployeeById(id);
        return mapEmployeeToDTO(employeeEntity);
    }

    @Override
    public List<EmployeeDTO> findAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepoInt.findAllEmployees();
        return employeeEntities
                .stream()
                .map(employeeEntity -> mapEmployeeToDTO(employeeEntity))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO ) {
        EmployeeEntity mapedEmployee = mapEmployeeToEntity(employeeDTO);
        EmployeeEntity savedEmployeeEntity = employeeRepoInt.saveEmployee(mapedEmployee);
        return mapEmployeeToDTO(savedEmployeeEntity);
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity mapedEmployee = mapEmployeeToEntity(employeeDTO);
        EmployeeEntity updatedEmployeeEntity = employeeRepoInt.updateEmployee(mapedEmployee);
        return mapEmployeeToDTO(updatedEmployeeEntity);
    }

    @Override
    public EmployeeDTO patchUpdateEmployee(EmployeeDTO employeeDTO) {
        if(employeeDTO != null){
            if (employeeDTO.getName() != null){
                System.out.println("Employee Name updated DONE");
            }
            if (employeeDTO.getSalary() != null){
                System.out.println("Employee Salary updated DONE");
            }
            if (employeeDTO.getAddress() != null){
                System.out.println("Employee Address updated DONE");
            }
        }
        EmployeeEntity mapedEmployee = mapEmployeeToEntity(employeeDTO);
        EmployeeEntity patchUpdateEmployee = employeeRepoInt.updateEmployee(mapedEmployee);
        return mapEmployeeToDTO(patchUpdateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepoInt.deleteEmployee(id);
    }
}
