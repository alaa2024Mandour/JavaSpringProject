package com.alx.employee.employee.service;

import com.alx.employee.employee.entity.ProjectEntity;
import com.alx.employee.employee.model.ProjectDTO;

import java.util.List;

public interface ProjectServiceInt {
    public ProjectDTO getEmployeeById(Long id);

    public List<ProjectDTO> findAllProjects();

    public ProjectDTO saveProject(ProjectDTO projectDTO);

    public void deleteProject(Long id);

    public ProjectDTO updateProject(ProjectDTO projectDTO);

    public ProjectDTO patchUpdateProject(ProjectDTO projectDTO);

}
