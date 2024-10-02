package com.alx.employee.employee.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepo implements  TaskRepoInt{
    public Task findTaskById(Long id) {
        return new Task(
                id,
                "Day1",
                "SpringProject",
                "1-10-2024",
                "7-10-2024"
        );
    }

    public List<Task> findAllTasks() {
        return  List.of(
                new Task(
                        1L,
                        "Day1",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ),
                new Task(
                        2L,
                        "Day2",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                ),
                new Task(
                        3L,
                        "Day3",
                        "SpringProject",
                        "1-10-2024",
                        "7-10-2024"
                )

        );
    }

    public Task saveTask (Task task) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }
}
