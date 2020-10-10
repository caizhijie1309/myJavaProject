package com.finaldemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jin on 02/01/2018.
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {
  private String name;
  private String age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}
