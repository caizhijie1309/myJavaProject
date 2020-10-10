//package com.finaldemo.controller;
//
///**
// * Created by jin on 03/01/2018.
// */
//
//import com.finaldemo.dao.PersonRepository;
//import com.finaldemo.entity.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class PersonController {
//  @Autowired
//  private PersonRepository personRepository;
//
//  @GetMapping(value = "/person")
//  private List<Person> getPerson() {
//    return personRepository.findAll();
//  }
//
//  @PostMapping(value = "/person")
//  private Person addPerson(@RequestParam("name") String name, @RequestParam("age") Integer age) {
//    Person person = new Person(name, age);
//    return personRepository.save(person);
//  }
//
//  @GetMapping(value = "/person/{id}")
//  private Person personFindOne(@PathVariable("id") Integer id) {
//    return personRepository.findOne(id);
//  }
//
//  @DeleteMapping(value = "/person/{id}")
//  private void deleteOneById(@PathVariable("id") Integer id) {
//    personRepository.delete(id);
//  }
//
//  @PutMapping(value = "/person/{id}")
//  private Person putOneById(@RequestParam("name") String name, @PathVariable("id") Integer id, @RequestParam("age") Integer age) {
//    Person person = personRepository.findOne(id);
//    person.setName(name);
//    person.setAge(age);
//    return personRepository.save(person);
//  }
//
//  @GetMapping(value = "/person/age/{age}")
//  private List<Person> findByage(@PathVariable("age") Integer age) {
//    return personRepository.findByAge(age);
//  }
//}
