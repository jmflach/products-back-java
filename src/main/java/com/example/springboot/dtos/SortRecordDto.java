package com.example.springboot.dtos;

import jakarta.validation.constraints.NotNull;

public record SortRecordDto (@NotNull int[] array) {
    
}
