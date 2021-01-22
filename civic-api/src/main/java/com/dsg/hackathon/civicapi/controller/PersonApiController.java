package com.dsg.hackathon.civicapi.controller;

import com.dsg.hackathon.civicapi.api.PersonApi;
import com.dsg.hackathon.civicapi.dto.Person;
import com.dsg.hackathon.civicapi.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("${openapi.adyen.base-path:/v1}")
public class PersonApiController implements PersonApi {

    private final ModelMapper modelMapper;
    private final PersonRepository personRepository;

    @Autowired
    public PersonApiController(ModelMapper modelMapper, PersonRepository personRepository) {
        this.modelMapper = modelMapper;
        this.personRepository = personRepository;
    }

    @Override
    public ResponseEntity addPerson(@Valid Person person) {
        com.dsg.hackathon.civicapi.model.Person personModel = new com.dsg.hackathon.civicapi.model.Person();
        personModel = modelMapper.map(person, com.dsg.hackathon.civicapi.model.Person.class);
        personRepository.save(personModel);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Person> getPerson(String personId) {
        com.dsg.hackathon.civicapi.model.Person person = personRepository.getOne("1");
        if (person != null) {
            com.dsg.hackathon.civicapi.dto.Person dtoPerson = modelMapper.map(person, com.dsg.hackathon.civicapi.dto.Person.class);
            return new ResponseEntity<Person>(dtoPerson, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Person>(new Person(), HttpStatus.NOT_FOUND);
        }
    }

}
