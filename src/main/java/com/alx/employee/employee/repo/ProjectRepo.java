package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.ProjectEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepo implements ProjectRepoInt {
    public ProjectEntity getProjectById(Long id) {
        return  new ProjectEntity(
                id,
                "Day1",
                "SpringProject",
                "1-10-2024",
                "7-10-2024"
        );
    }

    @Override
    public List<ProjectEntity> findAllProjects() {
        return List.of(
                new ProjectEntity(
                        1L,
                        "Day111",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ) ,
                new ProjectEntity(
                        2L,
                        "Day234",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ),
                new ProjectEntity(
                        44L,
                        "Day456",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                )
        );
    }

    @Override
    public ProjectEntity saveProject(ProjectEntity projectEntity) {
        return projectEntity;
    }


    @Override
    public void deleteProject(Long id) {
        System.out.println("Delete Project id: " + id);
    }

    @Override
    public ProjectEntity updateProject(ProjectEntity projectEntity) {
        return projectEntity;
    }

}
