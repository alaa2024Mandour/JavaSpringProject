package com.alx.employee.employee.service;
import com.alx.employee.employee.entity.TaskEntity;
import com.alx.employee.employee.model.TaskDTO;
import com.alx.employee.employee.repo.TaskRepoInt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService implements TaskServiceInt {
    public TaskRepoInt taskRepoInt;

    TaskService (TaskRepoInt taskRepoInt){
        this.taskRepoInt = taskRepoInt;
    }

    private TaskEntity mapTaskToEntity(TaskDTO taskDTO) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setId(taskDTO.getId());
        taskEntity.setName(taskDTO.getName());
        taskEntity.setDescription(taskDTO.getDescription());
        return taskEntity;
    }


    private TaskDTO mapTaskToDTO(TaskEntity taskEntity) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(taskEntity.getId());
        taskDTO.setName(taskEntity.getName());
        taskDTO.setDescription(taskEntity.getDescription());
        return taskDTO;
    }

    public TaskDTO findTaskById(Long id){
        TaskEntity taskEntity = taskRepoInt.findTaskById(id);
        return  mapTaskToDTO(taskEntity);
    }

    @Override
    public List<TaskDTO> findAllTasks() {
        List<TaskEntity> taskEntities = taskRepoInt.findAllTasks();
        return taskEntities
                .stream()
                .map(taskEntity -> mapTaskToDTO(taskEntity))
                .collect(Collectors.toList());
    }

    @Override
    public TaskDTO saveTask(TaskDTO taskDTO) {
        TaskEntity mapedTaskEntity = mapTaskToEntity(taskDTO);
        TaskEntity saveTaskEntity = taskRepoInt.saveTask(mapedTaskEntity);
        return mapTaskToDTO(saveTaskEntity);
    }


    @Override
    public TaskDTO updateTask(TaskDTO taskDTO) {
        TaskEntity mapedTaskEntity = mapTaskToEntity(taskDTO);
        TaskEntity updateTaskEntity = taskRepoInt.updateTask(mapedTaskEntity);
        return mapTaskToDTO(updateTaskEntity);
    }

    @Override
    public TaskDTO patchUpdateTask(TaskDTO taskDTO) {
        TaskEntity mapedTaskEntity = mapTaskToEntity(taskDTO);
        TaskEntity patchUdateTaskEntity = taskRepoInt.updateTask(mapedTaskEntity);
        return mapTaskToDTO(patchUdateTaskEntity);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepoInt.deleteTask(id);
    }
}
