package com.accenture.kickstart.controller;

import com.accenture.kickstart.entity.People;
import com.accenture.kickstart.repository.PeopleRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/v1/people")
public class PeopleController {

    private final PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @GetMapping("")
    public Iterable<People> listAll() {
        var people = peopleRepository.findAll();
        return people;
    }

    @PostMapping("")
    public People create(@Valid @RequestBody People person) {
        return this.peopleRepository.save(person);
    }

}
