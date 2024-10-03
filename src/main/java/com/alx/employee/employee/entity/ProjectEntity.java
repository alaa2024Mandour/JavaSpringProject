package com.alx.employee.employee.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEntity {
    Long id;
    String name;
    String description;
    String start_date;
    String end_date;

}
