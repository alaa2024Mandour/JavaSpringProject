package com.alx.employee.employee.repo;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepo {
    public Task findTaskById(Long id) {
        return new Task(
                id,
                "Day1",
                "SpringProject",
                "1-10-2024",
                "7-10-2024"
        );
    }
}
