package com.alx.employee.employee.model;

import com.alx.employee.employee.entity.ProjectEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {
    Long id;
    String name;
    String description;
    String startDate;
    String endDate;
}
