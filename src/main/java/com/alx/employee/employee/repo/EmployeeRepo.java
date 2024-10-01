package com.alx.employee.employee.repo;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class EmployeeRepo
{
    public Employee findEmployeeById(String name){

        Date date = new Date();
        return new Employee(
                1L,
                name,
                "Alexandria",
                "5000.5",
                "2024-1-9"
                );
    }
}
