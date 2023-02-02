package com.accenture.kickstart.controller;

import com.accenture.kickstart.entity.Person;
import com.accenture.kickstart.repository.PersonRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/v1/people")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("")
    public Iterable<Person> listAll() {
        var people = personRepository.findAll();
        return people;
    }

    @GetMapping("/personID/{id}")
    public Person getPersonById(@PathVariable("id") Integer itemOptionId){
        return personRepository.findById(new Long(itemOptionId)).get();
    }

    @PostMapping("")
    public Person create(@Valid @RequestBody Person person) {
        return this.personRepository.save(person);
    }

}
