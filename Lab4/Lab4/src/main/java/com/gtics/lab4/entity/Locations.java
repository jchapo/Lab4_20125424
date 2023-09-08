package com.gtics.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locations")
@Getter
@Setter
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer location_id;
    @Column(name = "street_address", nullable = true)
    private String street_address;
    @Column(name = "postal_code", nullable = true)
    private String postal_code;
    @Column(name = "city", nullable = true)
    private String city;
    @Column(name = "state_province", nullable = true)
    private String state_province;
    @Column(name = "country_id", nullable = true)
    private String country_id;

}
