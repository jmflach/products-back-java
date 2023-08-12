package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MdcRecordDto (@NotNull Float maior, @NotNull Float menor) {
    
}
