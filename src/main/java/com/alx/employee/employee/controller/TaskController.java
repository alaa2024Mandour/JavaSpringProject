package com.alx.employee.employee.controller;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.service.TaskServiceInt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController  {
    public TaskServiceInt taskServiceInt;

    TaskController (TaskServiceInt taskServiceInt) {
        this.taskServiceInt = taskServiceInt;
    }

    @GetMapping("/getTask")
    public Task getTaskById() {
        return taskServiceInt.findTaskById(12L);
    }

    @GetMapping
    public List<Task> findAllTasks (){
        return taskServiceInt.findAllTasks();
    }

    @PostMapping
    public Task saveTask(Task task) {
        return taskServiceInt.saveTask(task);
    }

    @PutMapping
    public Task updateTask(Task task) {
        return taskServiceInt.updateTask(task);
    }

    @PatchMapping
    public Task patchTask(Task task) {
        return taskServiceInt.patchUpdateTask(task);
    }

    @DeleteMapping
    public void deleteEmployeeById(Long id) {
        taskServiceInt.deleteTask(id);
    }

}
