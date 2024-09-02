package com.example.demo.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Pet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetRepository {
    public static final int ZERO_BYTES = 0;
    private File arquivo = new File("src/main/resources/database/tb_pets.json");
    private ObjectMapper objectMapper = new ObjectMapper();
    
    public List<Pet> getAll() throws Exception{
        if(!arquivo.exists()){
            arquivo.createNewFile();
        }
        List<Pet> pets = null;
        if(arquivo.length() > ZERO_BYTES){
            pets = objectMapper.readValue(arquivo, 
            new TypeReference<ArrayList<Pet>>() { });
        }else{
            pets = new ArrayList<>();
        }
    return pets;
    }

    public boolean save(Pet pet) throws Exception{
        List<Pet> pets = this.getAll();
        for (Pet petNoBanco : pets){
            if (petNoBanco.getId() == pet.getId()){
                return false;
            }

        }
        pets.add(pet);
        return true;
    }

}
