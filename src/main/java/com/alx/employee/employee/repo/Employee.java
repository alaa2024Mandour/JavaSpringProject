package com.alx.employee.employee.repo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    Long id;
    String name;
    String address;
    String salary;
    String hiring_date;
}
