package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String country_id;
    @Column(name = "country_name", nullable = true)
    private String country_name;
    @Column(name = "region_id", nullable = true)
    private Float region_id;

}
