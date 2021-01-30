package com.dsg.hackathon.civicapi.repository;

import com.dsg.hackathon.civicapi.model.Help;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelpRepository extends JpaRepository<Help, String> {

}