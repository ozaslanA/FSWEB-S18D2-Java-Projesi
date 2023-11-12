package com.example.fruitapi.exceptions;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PlantErrorResponse {
    private int status;
    private String message;
    private LocalDate  date;

}
