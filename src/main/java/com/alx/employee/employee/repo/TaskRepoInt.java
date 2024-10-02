package com.alx.employee.employee.repo;

import java.util.List;

public interface TaskRepoInt {
    public Task findTaskById(Long id);

    public List<Task> findAllTasks();

    public Task saveTask(Task task);

    public void deleteTask(Long id);

    public Task updateTask(Task task);
}
