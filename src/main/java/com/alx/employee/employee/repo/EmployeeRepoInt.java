package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepoInt extends JpaRepository<EmployeeEntity, Long> {
}
