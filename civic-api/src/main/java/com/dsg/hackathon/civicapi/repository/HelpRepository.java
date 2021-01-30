package com.dsg.hackathon.civicapi.repository;

import com.dsg.hackathon.civicapi.model.Help;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HelpRepository extends JpaRepository<Help, String> {

    Optional<List<Help>> findByUserIdOrderByCreateDateDesc(String userId);

    Optional<Help> findByHelpId(String helpId);

}