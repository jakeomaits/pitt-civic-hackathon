package com.dsg.hackathon.civicapi.repository;

import com.dsg.hackathon.civicapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {

}