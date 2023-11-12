package com.example.fruitapi.controller;


import com.example.fruitapi.dto.VegetableResponse;
import com.example.fruitapi.entity.Vegetable;
import com.example.fruitapi.service.VegetableService;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetable")
public class VegetableController {


    private VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

     @GetMapping("/")
    public List<Vegetable> get(){
        return vegetableService.getByPriceAsc();
     }
     @GetMapping("/{id}")
    public VegetableResponse get(@Positive  @PathVariable long id){
        return new VegetableResponse("SuccesVegetables",vegetableService.getById(id));
     }

     @GetMapping("/desc")
    public List<Vegetable> getByPriceDesc(){
        return vegetableService.getByPriceDesc();
     }
     @PostMapping("/")
    public Vegetable save(@Validated  @RequestBody Vegetable vegetable){
        return vegetableService.save(vegetable);
     }
     @PostMapping("/{name}")
   public List<Vegetable> getByName(@Size(min=2,max=45) @PathVariable String name){
        return vegetableService.searchByName(name);
     }

     @DeleteMapping("{id}")
    public Vegetable delete(@PathVariable long id){
        return vegetableService.delete(id);
     }
}
