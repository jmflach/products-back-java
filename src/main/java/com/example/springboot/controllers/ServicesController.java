package com.example.springboot.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.MdcRecordDto;
import com.example.springboot.dtos.SortRecordDto;
import com.example.springboot.services.MdcService;
import com.example.springboot.services.SortService;

import jakarta.validation.Valid;

@RestController
public class ServicesController {
    
    @PostMapping("/mdc")
    public ResponseEntity<Float> calculateMdc(@RequestBody @Valid MdcRecordDto mdcRecordDto) {

        MdcService mdcService = new MdcService(mdcRecordDto.menor(), mdcRecordDto.maior());

        Float mdc = mdcService.calculateMdc();

        return ResponseEntity.status(HttpStatus.CREATED).body(mdc);
    }

    @PostMapping("/sort")
    public ResponseEntity<Integer[]> sort(@RequestBody @Valid SortRecordDto sortRecordDto) {

        SortService sortService = new SortService(sortRecordDto.array());

        Integer sorted[] = sortService.sort();

        return ResponseEntity.status(HttpStatus.CREATED).body(sorted);
    }
}