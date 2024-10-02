package com.alx.employee.employee.service;
import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.EmployeeRepoInt;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeServiceInt {

    public EmployeeRepoInt employeeRepoInt;

    EmployeeService(EmployeeRepoInt employeeRepoInt) {
        this.employeeRepoInt = employeeRepoInt;
    }

    public Employee findEmployeeById(String name){
        return employeeRepoInt.findEmployeeById(name);
    }
}
