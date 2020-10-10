package com.example.demo.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Cookie on 2018/1/25.
 */
@Entity
@Table(name = "disease")
public class disease {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name="plant_id")
    private  int plant_id;

    @NotNull
    @Column(name="disease_name")
    private  String disease_name;

    @NotNull
    @Column(name="disease_type")
    private  int disease_type;

    @Column(name="disease_part")
    private  String disease_part;


    @Column(name="disease_period")
    private  String disease_period;


    @Column(name="disease_option_rel")
    private  String disease_option_rel;


    @Column(name="disease_description")
    private  String disease_description;


    @Column(name="disease_symptom")
    private  String disease_symptom;

    @Column(name="disease_character")
    private  String disease_character;


    @Column(name="disease_create_time")
    private  int disease_create_time;


    @Column(name="disease_delete_time")
    private  int disease_delete_time;


    @Column(name="disease_update_time")
    private  int disease_update_time;


    @Column(name="disease_prevention")
    private  String disease_prevention;


    @Column(name="disease_image")
    private  String disease_image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public int getDisease_type() {
        return disease_type;
    }

    public void setDisease_type(int disease_type) {
        this.disease_type = disease_type;
    }

    public String getDisease_part() {
        return disease_part;
    }

    public void setDisease_part(String disease_part) {
        this.disease_part = disease_part;
    }

    public String getDisease_period() {
        return disease_period;
    }

    public void setDisease_period(String disease_period) {
        this.disease_period = disease_period;
    }

    public String getDisease_option_rel() {
        return disease_option_rel;
    }

    public void setDisease_option_rel(String disease_option_rel) {
        this.disease_option_rel = disease_option_rel;
    }

    public String getDisease_description() {
        return disease_description;
    }

    public void setDisease_description(String disease_description) {
        this.disease_description = disease_description;
    }

    public String getDisease_symptom() {
        return disease_symptom;
    }

    public void setDisease_symptom(String disease_symptom) {
        this.disease_symptom = disease_symptom;
    }

    public String getDisease_character() {
        return disease_character;
    }

    public void setDisease_character(String disease_character) {
        this.disease_character = disease_character;
    }

    public int getDisease_create_time() {
        return disease_create_time;
    }

    public void setDisease_create_time(int disease_create_time) {
        this.disease_create_time = disease_create_time;
    }

    public int getDisease_delete_time() {
        return disease_delete_time;
    }

    public void setDisease_delete_time(int disease_delete_time) {
        this.disease_delete_time = disease_delete_time;
    }

    public int getDisease_update_time() {
        return disease_update_time;
    }

    public void setDisease_update_time(int disease_update_time) {
        this.disease_update_time = disease_update_time;
    }

    public String getDisease_prevention() {
        return disease_prevention;
    }

    public void setDisease_prevention(String disease_prevention) {
        this.disease_prevention = disease_prevention;
    }

    public String getDisease_image() {
        return disease_image;
    }

    public void setDisease_image(String disease_image) {
        this.disease_image = disease_image;
    }
}
