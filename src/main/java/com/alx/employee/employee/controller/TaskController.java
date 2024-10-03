package com.alx.employee.employee.controller;
import com.alx.employee.employee.model.TaskDTO;
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
    public TaskDTO getTaskById() {
        return taskServiceInt.findTaskById(12L);
    }

    @GetMapping
    public List<TaskDTO> findAllTasks (){
        return taskServiceInt.findAllTasks();
    }

    @PostMapping
    public TaskDTO saveTask(@RequestBody TaskDTO taskDTO) {
        return taskServiceInt.saveTask(taskDTO);
    }

    @PutMapping
    public TaskDTO updateTask(@RequestBody TaskDTO taskDTO) {
        return taskServiceInt.updateTask(taskDTO);
    }

    @PatchMapping
    public TaskDTO patchTask(@RequestBody TaskDTO taskDTO) {
        return taskServiceInt.patchUpdateTask(taskDTO);
    }

    @DeleteMapping
    public void deleteEmployeeById(@RequestParam Long id) {
        taskServiceInt.deleteTask(id);
    }

}
