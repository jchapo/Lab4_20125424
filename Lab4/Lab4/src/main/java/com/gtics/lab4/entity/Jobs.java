package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jobs")
@Getter
@Setter
public class Jobs {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String job_id;
    @Column(name = "job_title", nullable = true)
    private String job_title;
    @Column(name = "min_salary", nullable = true)
    private Integer min_salary;
    @Column(name = "max_salary", nullable = true)
    private Integer max_salary;

}
