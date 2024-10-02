package com.alx.employee.employee.repo;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepo implements ProjectRepoInt {
    public Project getProjectById(Long id) {
        return  new Project(
                id,
                "Day1",
                "SpringProject",
                "1-10-2024",
                "7-10-2024"
        );
    }

    @Override
    public List<Project> findAllProjects() {
        return List.of(
                new Project(
                        1L,
                        "Day111",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ) ,
                new Project(
                        2L,
                        "Day234",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ),
                new Project(
                        44L,
                        "Day456",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                )
        );
    }

    @Override
    public Project saveProject(Project project) {
        return null;
    }


    @Override
    public void deleteProject(Long id) {

    }

    @Override
    public Project updateProject(Project project) {
        return null;
    }

}
