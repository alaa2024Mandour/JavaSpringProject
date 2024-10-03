package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class EmployeeRepo implements EmployeeRepoInt
{
    public EmployeeEntity findEmployeeById(Long id){

        Date date = new Date();
        return new EmployeeEntity(
                id,
                "A'laa Yasser",
                "Alexandria",
                "5000.5",
                "2024-1-9"
                );
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return List.of(
                new EmployeeEntity(
                        1L,
                        "A'laa Yasser",
                        "Alexandria",
                        "5000.5",
                        "2024-1-9"
                ),
                new EmployeeEntity(
                        2L,
                        "Khaled Mohammed",
                        "Alexandria",
                        "5000.5",
                        "2024-1-9"
                ),
                new EmployeeEntity(
                        3L,
                        "Ali Ahmed",
                        "Alexandria",
                        "5000.5",
                        "2024-1-9"
                )
        );
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeEntity;
    }

    @Override
    public void deleteEmployee(Long id) {
        System.out.println("Delete Employee id: " + id);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeEntity;
    }
}
