package com.example.fruitapi.service;

import com.example.fruitapi.entity.Vegetable;

import java.util.List;

public interface VegetableService {

    List<Vegetable> getByPriceAsc();
    Vegetable getById(long id);
    List<Vegetable> getByPriceDesc();
    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);

    List<Vegetable> searchByName(String name);


}
