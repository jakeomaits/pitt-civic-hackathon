package com.dsg.hackathon.civicapi.controller;

import com.dsg.hackathon.civicapi.api.UserApi;
import com.dsg.hackathon.civicapi.dto.AddUserRequest;
import com.dsg.hackathon.civicapi.dto.AddUserResponse;
import com.dsg.hackathon.civicapi.dto.User;
import com.dsg.hackathon.civicapi.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("${openapi.adyen.base-path:/v1}")
public class UserApiController implements UserApi {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserApiController(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<AddUserResponse> addUser(@Valid AddUserRequest addUserRequest) {
        com.dsg.hackathon.civicapi.model.User userModel = new com.dsg.hackathon.civicapi.model.User();
        userModel = modelMapper.map(addUserRequest, com.dsg.hackathon.civicapi.model.User.class);
        userModel.setUserId(UUID.randomUUID().toString());
        userModel.setPoints(0);
        userRepository.save(userModel);

        AddUserResponse addUserResponse = new AddUserResponse();
        addUserResponse.setUserId(userModel.getUserId());
        return new ResponseEntity<AddUserResponse>(addUserResponse, HttpStatus.CREATED);
    }


    @Override
    public ResponseEntity<User> getUser(String userId) {
        com.dsg.hackathon.civicapi.model.User user = userRepository.getOne(userId);
        if (user != null) {
            com.dsg.hackathon.civicapi.dto.User dtoUser = modelMapper.map(user, com.dsg.hackathon.civicapi.dto.User.class);
            return new ResponseEntity<User>(dtoUser, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<User>(new User(), HttpStatus.NOT_FOUND);
        }
    }

}
