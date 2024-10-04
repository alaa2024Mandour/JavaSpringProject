package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoInt extends JpaRepository<EmployeeEntity, Long> {

//    @Query(value = "select * from employees e where e.FirstName = :FirstName" , nativeQuery = true)
    EmployeeEntity findEmployeeEntityByFirstName(String firstName);

   List<EmployeeEntity> findEmployeeEntitiesByAddress(String address);
}
