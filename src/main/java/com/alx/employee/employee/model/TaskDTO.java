package com.alx.employee.employee.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    Long id;
    String name;
    String description;
    String startDate;
    String endDate;
}
