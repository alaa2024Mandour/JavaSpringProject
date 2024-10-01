package com.alx.employee.employee.repo;

public class Task {
    Long id;
    String name;
    String description;
    String start_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Task(Long id, String end_date, String start_date, String name, String description) {
        this.id = id;
        this.end_date = end_date;
        this.start_date = start_date;
        this.name = name;
        this.description = description;
    }

    String end_date;
}
