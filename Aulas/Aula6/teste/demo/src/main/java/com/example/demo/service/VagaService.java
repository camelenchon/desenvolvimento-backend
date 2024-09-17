package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Vaga;
import com.example.demo.repository.VagaRepository;

@Component
public class VagaService {

    private VagaRepository vagaRepository;

    @Autowired
    public VagaService(VagaRepository vagaRepository){
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> listarVagas() throws IOException{
        return vagaRepository.getAll();
    }

    public Vaga save(Vaga vaga) throws IOException{
        if(vagaRepository.save(vaga)){
            return vaga;

        }
        return null;
    }
    
    public Vaga update(Vaga vaga) throws IOException{
        if(vagaRepository.update(vaga)){
            return vaga;
        }
        return null;
    }

}
