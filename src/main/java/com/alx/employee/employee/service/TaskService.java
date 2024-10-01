package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.EmployeeRepo;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.repo.TaskRepo;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public TaskRepo taskRepo = new TaskRepo();

    public Task findTaskById(Long id){
        return  taskRepo.findTaskById(id);
    }
}
