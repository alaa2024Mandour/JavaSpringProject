package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements ProjectServiceInt {
    public ProjectRepoInt projectRepoInt ;

    ProjectService (ProjectRepoInt projectRepoInt) {
        this.projectRepoInt = projectRepoInt;
    }

    public Project getEmployeeById(Long id) {
       return projectRepoInt.getProjectById(id);
    }

    @Override
    public List<Project> findAllProjects() {
      return   projectRepoInt.findAllProjects();
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepoInt.saveProject(project);
    }


    @Override
    public void deleteProject(Long id) {
         projectRepoInt.deleteProject(id);
    }

    @Override
    public Project updateProject(Project project) {
        return projectRepoInt.updateProject(project);
    }

    @Override
    public Project patchUpdateProject(Project project) {
        return projectRepoInt.updateProject(project);
    }
}
