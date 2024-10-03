package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeRepoInt {
    public EmployeeEntity findEmployeeById(Long id);

    public List<EmployeeEntity> findAllEmployees();

    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    public void deleteEmployee(Long id);

    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
}
