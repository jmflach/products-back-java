package com.example.springboot.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.MdcRecordDto;
import com.example.springboot.services.MdcServices;

import jakarta.validation.Valid;

@RestController
public class ServicesController {
    @PostMapping("/mdc")
    public ResponseEntity<Float> calculateMdc(@RequestBody @Valid MdcRecordDto mdcRecordDto) {

        MdcServices mdcServices = new MdcServices(mdcRecordDto.menor(), mdcRecordDto.maior());

        Float mdc = mdcServices.calculateMdc();

        return ResponseEntity.status(HttpStatus.CREATED).body(mdc);
    }
}