package com.finaldemo.controller;

import com.finaldemo.PersonProperties;
import com.finaldemo.entity.BaseEntity;
import com.finaldemo.entity.CmfUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by jin on 02/01/2018.
 */
@RestController
public class HelloController {
  @Value("${name}")
  private String name;

  @Autowired
  private PersonProperties personProperties;

  @GetMapping(value = "/hello")
  private String say() {
    personProperties.setAge("30");
    return "Happy New Year, Hello " + name + ", you are " + personProperties.getName() + ", and you are " + personProperties.getAge() + " years old.";
  }

  @GetMapping(value = "/hello2")
  private String age() {
    return personProperties.getAge();
  }

  @GetMapping(value = "/getTest")
  private BaseEntity<List<CmfUserEntity>> getTest() {
    RestTemplate restTemplate = new RestTemplate();
    BaseEntity<List<CmfUserEntity>> str = restTemplate.getForObject("http://192.168.0.8:8080/user", BaseEntity.class);
    return str;
  }
}
