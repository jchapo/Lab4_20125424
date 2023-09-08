package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "job_history")
@Getter
@Setter
public class Job_history {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer job_history_id;
    @Column(name = "employee_id", nullable = true)
    private Integer employee_id;
    @Column(name = "start_date", nullable = true)
    private Date start_date;
    @Column(name = "end_date", nullable = true)
    private Date end_date;
    @Column(name = "job_id", nullable = true)
    private String  job_id;
    @Column(name = "department_id", nullable = true)
    private Integer department_id;

}
