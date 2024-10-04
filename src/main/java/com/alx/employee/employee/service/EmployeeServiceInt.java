package com.alx.employee.employee.service;
import com.alx.employee.employee.model.EmployeeDTO;

import java.util.List;

public interface EmployeeServiceInt {
    public EmployeeDTO findEmployeeById(Long id);

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);

    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);

    public EmployeeDTO patchUpdateEmployee(EmployeeDTO employeeDTO, Long employeeId);

    public void deleteEmployee(Long id);

    public List<EmployeeDTO> findAllEmployees();

    public EmployeeDTO findByFirstName(String name);

    public List<EmployeeDTO> findEmployeeEntitiesByAddress(String address);

    EmployeeDTO assignProjectToEmployee(EmployeeDTO employeeDTO, Long projectId);
}
