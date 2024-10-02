package com.alx.employee.employee.controller;

import com.alx.employee.employee.repo.Project;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.service.ProjectServiceInt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController{

    private final ProjectServiceInt projectServiceInt;

    ProjectController ( ProjectServiceInt projectServiceInt) {
        this.projectServiceInt = projectServiceInt;
    }

    @GetMapping("/getProject")
    public Project getProjectById() {
        return  projectServiceInt.getEmployeeById(11L);
    }


    @GetMapping
    public List<Project> getAllProjects() {
        return  projectServiceInt.findAllProjects();
    }

    @PostMapping
    public Project saveProject(Project project) {
        return projectServiceInt.saveProject(project);
    }

    @PutMapping
    public Project updateProject(Project project) {
        return projectServiceInt.updateProject(project);
    }

    @PatchMapping
    public Project patchTask(Project project) {
        return projectServiceInt.patchUpdateProject(project);
    }

    @DeleteMapping
    public void deleteEmployeeById(Long id) {
        projectServiceInt.deleteProject(id);
    }
}
