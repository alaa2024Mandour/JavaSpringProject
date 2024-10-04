package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.EmployeeEntity;
import com.alx.employee.employee.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepoInt extends JpaRepository<TaskEntity, Long> {
}
