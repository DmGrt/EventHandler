package com.hrytsyshyn.eventhandler.model.repository;

import com.hrytsyshyn.eventhandler.model.entity.Person;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {}
