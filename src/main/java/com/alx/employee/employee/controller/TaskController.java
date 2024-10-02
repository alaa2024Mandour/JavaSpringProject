package com.alx.employee.employee.controller;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.service.TaskServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController  {
    public TaskServiceInt taskServiceInt;

    TaskController (TaskServiceInt taskServiceInt) {
        this.taskServiceInt = taskServiceInt;
    }

    @GetMapping("/getTask")
    public Task getTaskById() {
        return taskServiceInt.findTaskById(12L);
    }
}
