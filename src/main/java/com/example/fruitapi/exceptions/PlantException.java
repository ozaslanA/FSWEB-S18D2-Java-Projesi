package com.example.fruitapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class PlantException extends  RuntimeException{
    private HttpStatus status;


    public PlantException(String message, HttpStatus httpStatus) {
        super(message);
        this.status = status;
    }
}
