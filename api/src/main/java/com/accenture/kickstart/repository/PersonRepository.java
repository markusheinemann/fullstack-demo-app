package com.accenture.kickstart.repository;

import com.accenture.kickstart.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
