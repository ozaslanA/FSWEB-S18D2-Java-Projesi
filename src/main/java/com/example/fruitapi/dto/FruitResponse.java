package com.example.fruitapi.dto;

import com.example.fruitapi.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}
