package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.Project;
import com.alx.employee.employee.repo.Task;

import java.util.List;

public interface ProjectServiceInt {
    public Project getEmployeeById(Long id);

    public List<Project> findAllProjects();

    public Project saveProject(Project project);

    public void deleteProject(Long id);

    public Project updateProject(Project project);

    public Project patchUpdateProject(Project project);

}
