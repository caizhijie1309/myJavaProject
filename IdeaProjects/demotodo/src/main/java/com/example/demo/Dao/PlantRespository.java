package com.example.demo.Dao;

import com.example.demo.Model.Plant;
import com.example.demo.Model.Test;
import com.example.demo.Model.disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Cookie on 2018/1/31.
 */
public interface PlantRespository extends JpaRepository<Plant, Integer> {
    @Query(value = "select id,disease_name,disease_type,disease_description from disease where plant_id = (select id from plant where plant_name = '123')",nativeQuery = true)
    List<Object[]> findByplant_name();
}
