package com.example.ejercicios456.controller;

import com.example.ejercicios456.entities.Laptop;
import com.example.ejercicios456.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    //atributo

    private LaptopRepository laptopRepository;

    //constructor

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    // CRUD sobre la entidad Laptop

    // Buscar todos los laptops (lista de laptops)

    @GetMapping("api/laptop")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();



    }
// crear un nuevo laptop en base de datos
@PostMapping("api/laptop")
    public Laptop create(@RequestBody Laptop laptop){

        // guardar el laptop recibido por parámetro en la base de datos
        return laptopRepository.save(laptop);
    }
}
