package com.alx.employee.employee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long ID;
    private String FirstName;
    private String SecondName;
    private Double Salary;
    private String Department;
    private String SID;
    private String address;
    private String phone;
}
