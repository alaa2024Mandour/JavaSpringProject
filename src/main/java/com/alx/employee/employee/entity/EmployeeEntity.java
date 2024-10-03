package com.alx.employee.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    Long id;
    String name;
    String address;
    String salary;
    String hiring_date;
}
