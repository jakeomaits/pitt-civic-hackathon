package com.dsg.hackathon.civicapi.controller;

import com.dsg.hackathon.civicapi.api.HelpsApi;
import com.dsg.hackathon.civicapi.dto.Help;
import com.dsg.hackathon.civicapi.dto.HelpsResponse;
import com.dsg.hackathon.civicapi.repository.HelpRepository;
import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
    public ResponseEntity<HelpsResponse> getHelps(@Valid String userId, @Valid Boolean completed) {

        List<com.dsg.hackathon.civicapi.model.Help> helps = new ArrayList<com.dsg.hackathon.civicapi.model.Help>();
        Optional<List<com.dsg.hackathon.civicapi.model.Help>> optionalHelps = Optional.of(new ArrayList<com.dsg.hackathon.civicapi.model.Help>());

        //this is a hellish if statement but will hold up as long as we dont need more criteria.
        if (Strings.isNotBlank(userId)) {
            if (completed == null) {
                optionalHelps = helpRepository.findByUserIdOrderByCreateDateDesc(userId);
            } else {
                if (completed) {
                    optionalHelps = helpRepository.findByUserIdAndCompleteDateIsNotNullOrderByCreateDateDesc(userId);
                } else {
                    optionalHelps = helpRepository.findByUserIdAndCompleteDateIsNullOrderByCreateDateDesc(userId);
                }
            }
        } else {
            if (completed == null) {
                helps = helpRepository.findAll(Sort.by(Sort.Direction.DESC, "createDate"));
            } else {
                if (completed) {
                    optionalHelps = helpRepository.findByCompleteDateIsNotNullOrderByCreateDateDesc();
                } else {
                    optionalHelps = helpRepository.findByCompleteDateIsNullOrderByCreateDateDesc();
                }
            }
        }

        if (optionalHelps.isPresent()) {
            helps.addAll(optionalHelps.get());
        }

        com.dsg.hackathon.civicapi.dto.Help dtoHelp;
        List<com.dsg.hackathon.civicapi.dto.Help> dtoHelps = new ArrayList<Help>();

        for(com.dsg.hackathon.civicapi.model.Help help : helps){
            dtoHelp = modelMapper.map(help, com.dsg.hackathon.civicapi.dto.Help.class);
            dtoHelps.add(dtoHelp);
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
