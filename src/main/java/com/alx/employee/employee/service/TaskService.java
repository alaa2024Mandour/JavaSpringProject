package com.alx.employee.employee.service;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.repo.TaskRepoInt;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskServiceInt {
    public TaskRepoInt taskRepoInt;

    TaskService (TaskRepoInt taskRepoInt){
        this.taskRepoInt = taskRepoInt;
    }

    public Task findTaskById(Long id){
        return  taskRepoInt.findTaskById(id);
    }
}
