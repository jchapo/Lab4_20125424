package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "regions")
@Getter
@Setter
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Float region_id;
    @Column(name = "region_name", nullable = true)
    private String region_name;
}
