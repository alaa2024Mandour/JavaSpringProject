package com.alx.employee.employee.repo;

import java.util.List;

public interface EmployeeRepoInt {
    public Employee findEmployeeById(Long id);

    public List<Employee> findAllEmployees();

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Long id);

    public Employee updateEmployee(Employee employee);
}
