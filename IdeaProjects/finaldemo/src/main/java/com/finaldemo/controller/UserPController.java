package com.finaldemo.controller;

import com.finaldemo.dao.p.UserPRepository;
import com.finaldemo.dao.s.MessagePRepository;
import com.finaldemo.entity.p.UserP;
import com.finaldemo.entity.s.MessageP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jin on 06/01/2018.
 */
@RestController
public class UserPController {
  @Autowired
  private UserPRepository userPRepository;
  @Autowired
  private MessagePRepository messagePRepository;

  @PostMapping(value = "userP")
  private UserP postUserP(@RequestParam("age") Integer age, @RequestParam("name") String name) {
    UserP userp = new UserP();
    userp.setAge(age);
    userp.setName(name);
    return userPRepository.save(userp);
  }

  @PostMapping(value = "messageP")
  private MessageP postMessageP(@RequestParam("content") String content, @RequestParam("name") String name) {
    MessageP messageP = new MessageP();
    messageP.setContent(content);
    messageP.setName(name);
    return messagePRepository.save(messageP);
  }

  @GetMapping(value = "/userP")
  private List<UserP> get() {
    return userPRepository.findAll();
  }

  @GetMapping(value = "/")
  private String re404() {
    return "404 Not Found!";
  }
}
