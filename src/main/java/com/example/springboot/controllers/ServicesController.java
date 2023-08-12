package com.example.springboot.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.MdcRecordDto;

import jakarta.validation.Valid;

@RestController
public class ServicesController {
    @PostMapping("/mdc")
    public ResponseEntity<Float> calculateMdc(@RequestBody @Valid MdcRecordDto mdcRecordDto) {
       return ResponseEntity.status(HttpStatus.CREATED).body(1.0f);
    }
}