package com.alx.employee.employee.controller;

import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    public TaskService taskService = new TaskService();

    @GetMapping("/getTask")
    public Task getTaskById() {
        return taskService.findTaskById(12L);
    }
}
