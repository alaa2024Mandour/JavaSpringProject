package com.alx.employee.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "second_name")
    private String SecondName;
    private Double Salary;
    private String Department;
    @Column(name = "SID")
    private String SID;
    private String address;
    private String phone;
}
