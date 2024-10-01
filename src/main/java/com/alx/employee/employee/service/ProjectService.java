package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.EmployeeRepo;
import com.alx.employee.employee.repo.Project;
import com.alx.employee.employee.repo.ProjectRepo;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    ProjectRepo projectRepo = new ProjectRepo();
    public Project getEmployeeById(Long id) {
       return projectRepo.getProjectById(id);
    }
}
