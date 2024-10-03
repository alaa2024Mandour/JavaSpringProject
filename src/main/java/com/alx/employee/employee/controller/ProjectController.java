package com.alx.employee.employee.controller;

import com.alx.employee.employee.entity.ProjectEntity;
import com.alx.employee.employee.model.ProjectDTO;
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
    public ProjectDTO getProjectById() {
        return  projectServiceInt.getEmployeeById(11L);
    }


    @GetMapping
    public List<ProjectDTO> getAllProjects() {
        return  projectServiceInt.findAllProjects();
    }

    @PostMapping
    public ProjectDTO saveProject(@RequestBody ProjectDTO projectDTO) {
        return projectServiceInt.saveProject(projectDTO);
    }

    @PutMapping
    public ProjectDTO updateProject(@RequestBody ProjectDTO projectDTO) {
        return projectServiceInt.updateProject(projectDTO);
    }

    @PatchMapping
    public ProjectDTO patchTask(@RequestBody ProjectDTO projectDTO) {
        return projectServiceInt.patchUpdateProject(projectDTO);
    }

    @DeleteMapping
    public void deleteEmployeeById(@RequestParam Long id) {
        projectServiceInt.deleteProject(id);
    }
}
