package com.dsg.hackathon.civicapi.controller;

import com.dsg.hackathon.civicapi.api.HelpApi;
import com.dsg.hackathon.civicapi.dto.*;
import com.dsg.hackathon.civicapi.repository.HelpRepository;
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
public class HelpApiController implements HelpApi {

    private final ModelMapper modelMapper;
    private final HelpRepository helpRepository;

    @Autowired
    public HelpApiController(ModelMapper modelMapper, HelpRepository helpRepository) {
        this.modelMapper = modelMapper;
        this.helpRepository = helpRepository;
    }

    @Override
    public ResponseEntity<AddHelpResponse> addHelp(@Valid AddHelpRequest addHelpRequest) {
        com.dsg.hackathon.civicapi.model.Help helpModel = new com.dsg.hackathon.civicapi.model.Help();
        helpModel = modelMapper.map(addHelpRequest, com.dsg.hackathon.civicapi.model.Help.class);
        helpModel.setHelpId(UUID.randomUUID().toString());
        helpRepository.save(helpModel);

        AddHelpResponse addHelpResponse = new AddHelpResponse();
        addHelpResponse.setHelpId(helpModel.getHelpId());
        return new ResponseEntity<AddHelpResponse>(addHelpResponse, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Help> getHelp(String helpId) {
        com.dsg.hackathon.civicapi.model.Help help = helpRepository.getOne(helpId);
        if (help != null) {
            com.dsg.hackathon.civicapi.dto.Help dtoUser = modelMapper.map(help, com.dsg.hackathon.civicapi.dto.Help.class);
            return new ResponseEntity<Help>(dtoUser, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Help>(new Help(), HttpStatus.NOT_FOUND);
        }
    }
}
