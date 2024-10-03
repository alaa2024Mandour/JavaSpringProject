package com.alx.employee.employee.service;
import com.alx.employee.employee.entity.ProjectEntity;
import com.alx.employee.employee.model.ProjectDTO;
import com.alx.employee.employee.repo.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService implements ProjectServiceInt {
    public ProjectRepoInt projectRepoInt ;

    ProjectService (ProjectRepoInt projectRepoInt) {
        this.projectRepoInt = projectRepoInt;
    }

    private ProjectEntity mapProjectToEntity(ProjectDTO projectDTO) {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setId(projectDTO.getId());
        projectEntity.setName(projectDTO.getName());
        projectEntity.setDescription(projectDTO.getDescription());
        return projectEntity;
    }

    private ProjectDTO mapProjectToDTO(ProjectEntity projectEntity) {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(projectEntity.getId());
        projectDTO.setName(projectEntity.getName());
        projectDTO.setDescription(projectEntity.getDescription());
        return projectDTO;
    }


    public ProjectDTO getEmployeeById(Long id) {
        ProjectEntity projectEntity = projectRepoInt.getProjectById(id);
       return mapProjectToDTO(projectEntity);
    }

    @Override
    public List<ProjectDTO> findAllProjects() {
        List<ProjectEntity> projectEntitys = projectRepoInt.findAllProjects();
      return   projectEntitys
              .stream()
              .map(projectEntity -> mapProjectToDTO(projectEntity))
              .collect(Collectors.toList());
    }

    @Override
    public ProjectDTO saveProject(ProjectDTO projectDTO) {
        ProjectEntity mapedProjectEntity = mapProjectToEntity(projectDTO);
        ProjectEntity savedProjectEntity = projectRepoInt.saveProject(mapedProjectEntity);
        return mapProjectToDTO(savedProjectEntity);
    }


    @Override
    public ProjectDTO updateProject(ProjectDTO projectDTO) {
        ProjectEntity mapedProjectEntity = mapProjectToEntity(projectDTO);
        ProjectEntity updatedProjectEntity = projectRepoInt.saveProject(mapedProjectEntity);
        return mapProjectToDTO(updatedProjectEntity);
    }

    @Override
    public ProjectDTO patchUpdateProject(ProjectDTO projectDTO) {
        if(projectDTO != null){
            if (projectDTO.getName() != null){
                System.out.println("Employee Name updated DONE");
            }
            if (projectDTO.getDescription() != null){
                System.out.println("Employee Description updated DONE");
            }
            if (projectDTO.getId() != null){
                System.out.println("Employee ID updated DONE");
            }
        }
        ProjectEntity mapedProjectEntity = mapProjectToEntity(projectDTO);
        ProjectEntity patchedProjectEntity = projectRepoInt.updateProject(mapedProjectEntity);
        return mapProjectToDTO(patchedProjectEntity);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepoInt.deleteProject(id);
    }
}
