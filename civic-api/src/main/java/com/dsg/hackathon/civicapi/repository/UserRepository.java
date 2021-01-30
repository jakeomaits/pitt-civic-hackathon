package com.dsg.hackathon.civicapi.repository;

import com.dsg.hackathon.civicapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}