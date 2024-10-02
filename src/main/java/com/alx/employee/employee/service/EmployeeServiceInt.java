package com.alx.employee.employee.service;
import com.alx.employee.employee.repo.Employee;

import java.util.List;

public interface EmployeeServiceInt {
    public Employee findEmployeeById(Long id);

    public Employee saveEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public Employee patchUpdateEmployee(Employee employee);

    public void deleteEmployee(Long id);

    public List<Employee> findAllEmployees();
}
