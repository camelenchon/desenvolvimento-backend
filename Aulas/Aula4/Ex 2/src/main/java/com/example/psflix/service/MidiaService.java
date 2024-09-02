package com.example.psflix.service;

import java.util.*;

import com.example.psflix.repository.MidiaRepository;
import com.example.psflix.model.Midia;

public class MidiaService {
    private MidiaRepository respository = new MidiaRepository();
    

    public List<Midia> obterMidiasCadastradas(){
        return respository.getAll();
    }

    public String cadastrarNovaMidia(Midia midia){
        if (midia.getTitulo() == null || midia.getTitulo().isEmpty()){
            return "Titulo invalido";
        }
        respository.save(midia);
        return "Midia" + midia.getTitulo()+ "cadastrada com sucesso!";
    }

}
