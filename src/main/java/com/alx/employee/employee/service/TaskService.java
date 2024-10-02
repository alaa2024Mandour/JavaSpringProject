package com.alx.employee.employee.service;
import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.Task;
import com.alx.employee.employee.repo.TaskRepoInt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements TaskServiceInt {
    public TaskRepoInt taskRepoInt;

    TaskService (TaskRepoInt taskRepoInt){
        this.taskRepoInt = taskRepoInt;
    }

    public Task findTaskById(Long id){
        return  taskRepoInt.findTaskById(id);
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepoInt.findAllTasks();
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepoInt.saveTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepoInt.deleteTask(id);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepoInt.updateTask(task);
    }

    @Override
    public Task patchUpdateTask(Task task) {
        return taskRepoInt.updateTask(task);
    }
}
