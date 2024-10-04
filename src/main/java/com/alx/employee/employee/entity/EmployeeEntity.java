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
    private Long Id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String SecondName;
    @Column(name = "salary")
    private Long salary;
    private String department;
    @Column(name = "SID")
    private String sID;
    @Column(name = "address")
    private String address;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity projectEntity;
}
