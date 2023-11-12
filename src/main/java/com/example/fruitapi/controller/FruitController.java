package com.example.fruitapi.controller;


import com.example.fruitapi.dto.FruitResponse;
import com.example.fruitapi.entity.Fruit;
import com.example.fruitapi.service.FruitService;
import com.example.fruitapi.service.FruitServiceImpl;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
@Validated
public class FruitController {

    private FruitService fruitService;


    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }



    @GetMapping("/")
    public List<Fruit> get(){
    return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public FruitResponse get(@Positive @PathVariable long id){
        return new FruitResponse("Succes",fruitService.getById(id));
    }

    @GetMapping("/desc")
    public  List<Fruit> getByPriceDesc(){
        return fruitService.getByPriceDesc();
    }

    @PostMapping("/")
    public Fruit save (@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }

    @PostMapping("/{name}")
    public List<Fruit> getByName(@Size(min=2,max=45) @PathVariable String name){
        return fruitService.searchByName(name);
    }


    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable long id){
        return fruitService.delete(id);

    }
}
