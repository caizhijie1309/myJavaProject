package com.example.demo.Dao;

/**
 * Created by Cookie on 2018/1/22.
 */

import javax.transaction.Transactional;

import com.example.demo.Model.UserLogin;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserLoginDao extends CrudRepository<UserLogin, Long> {
    UserLogin findByloginName(String loginName);
}
