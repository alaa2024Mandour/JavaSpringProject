package com.alx.employee.employee.service;

import com.alx.employee.employee.repo.Employee;
import com.alx.employee.employee.repo.Task;

import java.util.List;

public interface TaskServiceInt {
    public Task findTaskById(Long id);

    public List<Task> findAllTasks();

    public Task saveTask(Task task);

    public void deleteTask(Long id);

    public Task updateTask(Task task);

    public Task patchUpdateTask(Task task);
}
