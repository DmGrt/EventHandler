package com.hrytsyshyn.eventhandler.service.common;

import com.hrytsyshyn.eventhandler.model.entity.Person;
import com.hrytsyshyn.eventhandler.model.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService extends BaseService<Person> {
    private final PersonRepository personRepository;
}
