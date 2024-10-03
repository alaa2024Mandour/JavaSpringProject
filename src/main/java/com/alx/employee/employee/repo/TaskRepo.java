package com.alx.employee.employee.repo;

import com.alx.employee.employee.entity.TaskEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepo implements  TaskRepoInt{
    public TaskEntity findTaskById(Long id) {
        return new TaskEntity(
                id,
                "Day1",
                "SpringProject",
                "1-10-2024",
                "7-10-2024"
        );
    }

    public List<TaskEntity> findAllTasks() {
        return  List.of(
                new TaskEntity(
                        1L,
                        "Day1",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ),
                new TaskEntity(
                        2L,
                        "Day2",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ),
                new TaskEntity(
                        3L,
                        "Day3",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                )

        );
    }

    public TaskEntity saveTask (TaskEntity taskEntity) {
        return taskEntity;
    }

    @Override
    public void deleteTask(Long id) {
        System.out.println("Delete Task id: " + id);
    }

    @Override
    public TaskEntity updateTask(TaskEntity taskEntity) {
        return taskEntity;
    }
}
