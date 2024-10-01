package com.alx.employee.employee.controller;

import com.alx.employee.employee.repo.Project;
import com.alx.employee.employee.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    ProjectService projectService = new ProjectService();

    @GetMapping("/getProject")
    public Project getProjectById() {
        return  projectService.getEmployeeById(11L);
    }
}
