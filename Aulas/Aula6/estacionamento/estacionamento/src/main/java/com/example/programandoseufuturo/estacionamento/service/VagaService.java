package com.example.programandoseufuturo.estacionamento.service;

import java.io.IOException;

import org.springframework.stereotype.Component;

import main.java.com.example.programandoseufuturo.estacionamento.repository.VagaRepository;

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

    public boolean save(Vaga vaga) throws IOException{
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
