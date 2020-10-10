package com.example.demo.Dao;

import com.example.demo.Model.disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Cookie on 2018/1/24.
 */
public interface UserPRepository extends JpaRepository<disease, Integer> {
//    disease findById(Integer id);
//
//    //
//    @Query(value = "select * from disease where disease_type =?1", nativeQuery = true)
//    List<disease> findBydisease_type(Integer disease_type);
//
//   @Query(value = "select * from disease where plant_id =?1", nativeQuery = true)
//    List<disease> findByplant_id(Integer plant_id);
//
//    @Query(value = "select * from disease where disease_name =?1", nativeQuery = true)
//    List<disease> findBydisease_name(String disease_name);




}
