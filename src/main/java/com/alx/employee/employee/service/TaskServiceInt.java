package com.alx.employee.employee.service;

import com.alx.employee.employee.entity.TaskEntity;
import com.alx.employee.employee.model.TaskDTO;

import java.util.List;

public interface TaskServiceInt {
    public TaskDTO findTaskById(Long id);

    public List<TaskDTO> findAllTasks();

    public TaskDTO saveTask(TaskDTO taskDTO);

    public void deleteTask(Long id);

    public TaskDTO updateTask(TaskDTO taskDTO);

    public TaskDTO patchUpdateTask(TaskDTO taskDTO);
}
