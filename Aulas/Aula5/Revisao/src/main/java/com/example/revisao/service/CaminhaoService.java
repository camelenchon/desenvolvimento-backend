package com.example.revisao.service;

import java.util.List;

import com.example.revisao.models.Caminhao;
import com.example.revisao.repository.CaminhaoRepository;

public class CaminhaoService {
    private CaminhaoRepository repository = new CaminhaoRepository();

    public List<Caminhao> listarCaminhoes(){
        return repository.getAll();
    }

    public String cadastrarNovoCaminhao(Caminhao caminhao){
        if (repository.save(caminhao)){
            return "caminhao de modelo" + caminhao.getModelo() + "foi salvo com sucesso";
        }
        return "caminhao devem ter ID unico";
    }
}
