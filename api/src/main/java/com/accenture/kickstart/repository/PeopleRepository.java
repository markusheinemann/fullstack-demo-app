package com.accenture.kickstart.repository;

import com.accenture.kickstart.entity.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Long> {

}
