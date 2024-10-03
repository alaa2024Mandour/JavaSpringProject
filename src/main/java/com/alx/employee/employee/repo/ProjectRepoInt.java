package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.ProjectEntity;

import java.util.List;

public interface ProjectRepoInt {
    public ProjectEntity getProjectById(Long id);

    public List<ProjectEntity> findAllProjects();

    public ProjectEntity saveProject(ProjectEntity projectEntity);

    public void deleteProject(Long id);

    public ProjectEntity updateProject(ProjectEntity projectEntity);
}
