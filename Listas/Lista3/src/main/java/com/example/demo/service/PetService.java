package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;

public class PetService {
    private PetRepository repository = new PetRepository();
    
    public List<Pet> listarPets() throws Exception {
        return repository.getAll();
    }

    public String cadastrarNovoPet(Pet pet) throws Exception{
        if(repository.save(pet)){
            return pet.getNome() + " cadastrado com sucesso";
        }
        return "Erro ao salvar o pet";
    } 

}
