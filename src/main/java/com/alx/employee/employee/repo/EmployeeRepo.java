package com.alx.employee.employee.repo;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class EmployeeRepo implements EmployeeRepoInt
{
    public Employee findEmployeeById(Long id){

        Date date = new Date();
        return new Employee(
                id,
                "A'laa Yasser",
                "Alexandria",
                "5000.5",
                "2024-1-9"
                );
    }

    @Override
    public List<Employee> findAllEmployees() {
        return List.of(
                new Employee(
                        1L,
                        "A'laa Yasser",
                        "Alexandria",
                        "5000.5",
                        "2024-1-9"
                ),
                new Employee(
                        2L,
                        "Khaled Mohammed",
                        "Alexandria",
                        "5000.5",
                        "2024-1-9"
                ),
                new Employee(
                        3L,
                        "Ali Ahmed",
                        "Alexandria",
                        "5000.5",
                        "2024-1-9"
                )
        );
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employee;
    }

    @Override
    public void deleteEmployee(Long id) {
        System.out.println("Delete Employee id: " + id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employee;
    }
}
