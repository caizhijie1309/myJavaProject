package com.finaldemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jin on 03/01/2018.
 */
@Entity
public class Person {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private Integer age;

  public Person() {
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
