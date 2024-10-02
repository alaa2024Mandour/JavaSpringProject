package com.alx.employee.employee.service;
import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.EmployeeRepoInt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInt {

    public EmployeeRepoInt employeeRepoInt;

    EmployeeService(EmployeeRepoInt employeeRepoInt) {
        this.employeeRepoInt = employeeRepoInt;
    }


    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepoInt.findEmployeeById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepoInt.saveEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepoInt.updateEmployee(employee);
    }

    @Override
    public Employee patchUpdateEmployee(Employee employee) {
        return employeeRepoInt.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepoInt.deleteEmployee(id);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepoInt.findAllEmployees();
    }
}
