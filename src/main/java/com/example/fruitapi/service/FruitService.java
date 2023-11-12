package com.example.fruitapi.service;

import com.example.fruitapi.entity.Fruit;

import java.util.List;

public interface FruitService {


    List<Fruit> getByPriceAsc();
    Fruit getById(long id);
    List<Fruit> getByPriceDesc();
    Fruit save(Fruit fruit);
    Fruit delete(long id);
    List<Fruit> searchByName(String name);

}
