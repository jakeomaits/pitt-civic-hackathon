package com.dsg.hackathon.civicapi.controller;

import com.dsg.hackathon.civicapi.api.HelpsApi;
import com.dsg.hackathon.civicapi.dto.Help;
import com.dsg.hackathon.civicapi.dto.HelpsResponse;
import com.dsg.hackathon.civicapi.repository.HelpRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${openapi.adyen.base-path:/v1}")
public class HelpsApiController implements HelpsApi {

    private final ModelMapper modelMapper;
    private final HelpRepository helpRepository;

    @Autowired
    public HelpsApiController(ModelMapper modelMapper, HelpRepository helpRepository) {
        this.modelMapper = modelMapper;
        this.helpRepository = helpRepository;
    }



    @Override
    public ResponseEntity<HelpsResponse> getHelps(@Valid String userId) {
        Optional<List<com.dsg.hackathon.civicapi.model.Help>> helps = helpRepository.findByUserIdOrderByCreateDateDesc(userId);
        com.dsg.hackathon.civicapi.dto.Help dtoHelp;
        List<com.dsg.hackathon.civicapi.dto.Help> dtoHelps = new ArrayList<Help>();

        if (helps.isPresent()) {
            for(com.dsg.hackathon.civicapi.model.Help help : helps.get()){
                dtoHelp = modelMapper.map(help, com.dsg.hackathon.civicapi.dto.Help.class);
                dtoHelps.add(dtoHelp);
            }
        }

        if (!dtoHelps.isEmpty()) {
            HelpsResponse helpsResponse = new HelpsResponse();
            helpsResponse.setHelps(dtoHelps);
            return new ResponseEntity<HelpsResponse>(helpsResponse, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<HelpsResponse>(new HelpsResponse(), HttpStatus.NOT_FOUND);
        }
    }
}
