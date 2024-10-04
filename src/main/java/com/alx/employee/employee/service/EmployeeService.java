package com.alx.employee.employee.service;
import com.alx.employee.employee.entity.EmployeeEntity;
import com.alx.employee.employee.entity.ProjectEntity;
import com.alx.employee.employee.model.EmployeeDTO;
import com.alx.employee.employee.repo.EmployeeRepoInt;
import com.alx.employee.employee.repo.ProjectRepoInt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceInt {

    private EmployeeEntity mapEmployeeToEntity(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getID());
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
        employeeDTO.setID(employeeEntity.getId());
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
    public ProjectRepoInt projectRepoInt;

    EmployeeService(EmployeeRepoInt employeeRepoInt , ProjectRepoInt projectRepoInt) {
        this.employeeRepoInt = employeeRepoInt;
        this.projectRepoInt = projectRepoInt;
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
    public EmployeeDTO findByFirstName(String firstName){
        EmployeeEntity employeeEntity = employeeRepoInt.findEmployeeEntityByFirstName(firstName);
        return mapEmployeeToDTO(employeeEntity);
    }

    @Override
    public List<EmployeeDTO> findEmployeeEntitiesByAddress(String address) {
        List<EmployeeEntity> employeeEntities = employeeRepoInt.findEmployeeEntitiesByAddress(address);
        return employeeEntities
                .stream()
                .map(employee -> mapEmployeeToDTO(employee))
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
    public EmployeeDTO patchUpdateEmployee(EmployeeDTO employeeDTO , Long employeeId) {
        EmployeeEntity oldEmployeeEntity = employeeRepoInt.findById(employeeId).get();
        if(employeeDTO != null){
                if(employeeDTO.getFirstName() != null){
                    oldEmployeeEntity.setFirstName(employeeDTO.getFirstName());
                }
                if((employeeDTO.getSalary() != null) && (employeeDTO.getSalary() > 0)){
                    oldEmployeeEntity.setSalary(employeeDTO.getSalary());
                }
                if(employeeDTO.getAddress() != null){
                    oldEmployeeEntity.setAddress(employeeDTO.getAddress());
                }

        }
        EmployeeEntity patchUpdateEmployee = employeeRepoInt.save(oldEmployeeEntity);
        return mapEmployeeToDTO(patchUpdateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepoInt.deleteById(id);
    }


    @Override
    public EmployeeDTO assignProjectToEmployee(EmployeeDTO employeeDTO, Long projectId) {
        ProjectEntity projectEntity = projectRepoInt.findById(projectId).get();
        EmployeeEntity employeeEntity = mapEmployeeToEntity(employeeDTO);
        employeeEntity.setProjectEntity(projectEntity);
        EmployeeEntity updatedEmployeeEntity = employeeRepoInt.save(employeeEntity);
        return mapEmployeeToDTO(updatedEmployeeEntity);
    }
}
