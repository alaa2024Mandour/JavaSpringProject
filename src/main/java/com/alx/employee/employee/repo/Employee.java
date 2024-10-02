package com.alx.employee.employee.repo;

import java.util.Date;

public class Employee {
    Long id;
    String name;
    String address;
    String salary;
    String hiring_date;

    public Employee() {}

    public Employee(Long id, String name, String address, String salary, String hiring_date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.hiring_date = hiring_date;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDate() {
        return hiring_date;
    }


    public void setDate(String hiring_date) {
        this.hiring_date = hiring_date;
    }



}
