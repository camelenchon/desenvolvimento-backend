package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
    private PetService service = new PetService();

    @GetMapping
    public List<Pet> listaDePets() throws Exception {
        return service.listarPets();
    }
    
    @PostMapping
    public String cadastrarNovoPet(@RequestBody Pet Pet) throws Exception{
        return service.cadastrarNovoPet(Pet);
    }

}
