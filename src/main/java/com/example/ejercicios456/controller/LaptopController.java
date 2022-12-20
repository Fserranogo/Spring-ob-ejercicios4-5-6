package com.example.ejercicios456.controller;

import com.example.ejercicios456.entities.Laptop;
import com.example.ejercicios456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    //atributo

    private LaptopRepository laptopRepository;

    //constructor


    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("api/laptop")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();



    }
}
