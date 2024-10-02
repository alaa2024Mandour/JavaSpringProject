package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.*;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements ProjectServiceInt {
    public ProjectRepoInt projectRepoInt ;

    ProjectService (ProjectRepoInt projectRepoInt) {
        this.projectRepoInt = projectRepoInt;
    }

    public Project getEmployeeById(Long id) {
       return projectRepoInt.getProjectById(id);
    }
}
