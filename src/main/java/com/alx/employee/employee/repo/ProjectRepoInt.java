package com.alx.employee.employee.repo;

import java.util.List;

public interface ProjectRepoInt {
    public Project getProjectById(Long id);

    public List<Project> findAllProjects();

    public Project saveProject(Project project);

    public void deleteProject(Long id);

    public Project updateProject(Project project);
}
