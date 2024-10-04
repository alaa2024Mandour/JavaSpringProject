package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.EmployeeEntity;
import com.alx.employee.employee.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepoInt extends JpaRepository<ProjectEntity, Long> {
    ProjectEntity findProjectEntitiesByName(String name);

    List<ProjectEntity> findProjectEntitiesByStartDate(String startDate);
}
