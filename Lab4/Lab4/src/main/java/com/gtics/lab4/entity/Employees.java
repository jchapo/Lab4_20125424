package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    @Column(name = "first_name", nullable = true)
    private String first_name;
    @Column(name = "last_name", nullable = true)
    private String last_name;
    @Column(name = "email", nullable = true)
    private String email;
    @Column(name = "password", nullable = true)
    private String password;
    @Column(name = "phone_number", nullable = true)
    private String phone_number;
    @Column(name = "hire_date", nullable = true)
    private Date hire_date;
    @Column(name = "job_id", nullable = true)
    private String job_id;

    @Column(name = "salary", nullable = true)
    private Float salary;
    @Column(name = "commission_pct", nullable = true)
    private Float commission_pct;

    @ManyToOne
    @JoinColumn(name = "first_name")
    private Employees employees;
    @Column(name = "manager_id", nullable = true)
    private Integer manager_id;

    @ManyToOne
    @JoinColumn(name = "department_name")
    private Departments departments;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Departments departments2;
    @Column(name = "department_id", nullable = true)
    private Integer department_id;

    @Column(name = "enabled", nullable = true)
    private Integer enabled;

    @ManyToOne
    @JoinColumn(name = "city")
    private Locations locations;

}
