package com.example.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Cookie on 2018/1/31.
 */
@Entity
@Table(name = "plant")
public class Plant {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "plant_name")
    private String plant_name;

    @Column(name = "plant_image")
    private String plant_image;

    @Column(name = "plant_create_time")
    private String plant_create_time;

    @Column(name = "plant_update_time")
    private String plant_update_time;

    @Column(name = "plant_delete_time")
    private String plant_delete_time;
}
