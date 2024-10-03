package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.TaskEntity;

import java.util.List;

public interface TaskRepoInt {
    public TaskEntity findTaskById(Long id);

    public List<TaskEntity> findAllTasks();

    public TaskEntity saveTask(TaskEntity taskEntity);

    public void deleteTask(Long id);

    public TaskEntity updateTask(TaskEntity taskEntity);
}
