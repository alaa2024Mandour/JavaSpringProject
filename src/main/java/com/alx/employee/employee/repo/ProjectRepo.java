package com.alx.employee.employee.repo;

import org.springframework.stereotype.Repository;

@Repository
public class ProjectRepo {
    public Project getProjectById(Long id) {
        return  new Project(
                id,
                "Day1",
                "SpringProject",
                "1-10-2024",
                "7-10-2024"
        );
    }

}
