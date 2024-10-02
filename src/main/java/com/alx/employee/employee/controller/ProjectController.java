package com.alx.employee.employee.controller;

import com.alx.employee.employee.repo.Project;
import com.alx.employee.employee.service.ProjectService;
import com.alx.employee.employee.service.ProjectServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController{

    private final ProjectServiceInt projectServiceInt;

    ProjectController ( ProjectServiceInt projectServiceInt) {
        this.projectServiceInt = projectServiceInt;
    }

    @GetMapping("/getProject")
    public Project getProjectById() {
        return  projectServiceInt.getEmployeeById(11L);
    }

}
