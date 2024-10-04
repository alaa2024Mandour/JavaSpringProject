package com.alx.employee.employee.model;

import com.alx.employee.employee.entity.ProjectEntity;
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
    private Long Salary;
    private String Department;
    private String SID;
    private String address;
    private String phone;
    private ProjectEntity projectEntity;

}
