package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "departments")
@Getter
@Setter
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer department_id;
    @Column(name = "department_name", nullable = true)
    private String department_name;
    @Column(name = "manager_id", nullable = true)
    private Integer manager_id;
    @Column(name = "location_id", nullable = true)
    private Integer location_id;

}
