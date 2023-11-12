package com.example.fruitapi.dto;

import com.example.fruitapi.entity.Vegetable;

public record VegetableResponse(String message, Vegetable vegetable) {
}
