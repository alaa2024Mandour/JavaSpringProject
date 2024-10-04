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
        employeeEntity.setID(employeeDTO.getID());
        employeeEntity.setFirstName(employeeDTO.getFirstName());
        employeeEntity.setSecondName(employeeDTO.getSecondName());
        employeeEntity.setSalary(employeeDTO.getSalary());
        employeeEntity.setDepartment(employeeDTO.getDepartment());
        employeeEntity.setAddress(employeeDTO.getAddress());
        employeeEntity.setPhone(employeeDTO.getPhone());
        employeeEntity.setSID(employeeDTO.getSID());
        return employeeEntity;
    }

    private EmployeeDTO mapEmployeeToDTO(EmployeeEntity employeeEntity) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setID(employeeEntity.getID());
        employeeDTO.setFirstName(employeeEntity.getFirstName());
        employeeDTO.setSecondName(employeeEntity.getSecondName());
        employeeDTO.setSalary(employeeEntity.getSalary());
        employeeDTO.setDepartment(employeeEntity.getDepartment());
        employeeDTO.setAddress(employeeEntity.getAddress());
        employeeDTO.setPhone(employeeEntity.getPhone());
        employeeDTO.setSID(employeeEntity.getSID());
        return employeeDTO;
    }

    public EmployeeRepoInt employeeRepoInt;

    EmployeeService(EmployeeRepoInt employeeRepoInt) {
        this.employeeRepoInt = employeeRepoInt;
    }

    @Override
    public EmployeeDTO findEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepoInt.findById(id).get();
        return mapEmployeeToDTO(employeeEntity);
    }

    @Override
    public List<EmployeeDTO> findAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepoInt.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity -> mapEmployeeToDTO(employeeEntity))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO ) {
        EmployeeEntity mapedEmployee = mapEmployeeToEntity(employeeDTO);
        EmployeeEntity savedEmployeeEntity = employeeRepoInt.save(mapedEmployee);
        return mapEmployeeToDTO(savedEmployeeEntity);
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity mapedEmployee = mapEmployeeToEntity(employeeDTO);
        EmployeeEntity updatedEmployeeEntity = employeeRepoInt.save(mapedEmployee);
        return mapEmployeeToDTO(updatedEmployeeEntity);
    }

    @Override
    public EmployeeDTO patchUpdateEmployee(EmployeeDTO employeeDTO) {
        if(employeeDTO != null){
            if (employeeDTO.getFirstName() != null){
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
        EmployeeEntity patchUpdateEmployee = employeeRepoInt.save(mapedEmployee);
        return mapEmployeeToDTO(patchUpdateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepoInt.deleteById(id);
    }
}
