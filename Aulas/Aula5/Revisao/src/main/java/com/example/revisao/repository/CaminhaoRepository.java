package com.example.revisao.repository;
import java.util.*;

import com.example.revisao.models.Caminhao;

public class CaminhaoRepository {
    private List<Caminhao> caminhoes = new ArrayList<>();

    public List<Caminhao> getAll(){
        return caminhoes;
    }

    public boolean save(Caminhao caminhao){
    for (Caminhao caminhaoNoBanco : caminhoes){
        if (caminhao.getId() == caminhaoNoBanco.getId()){
            return false;
        }
    }
    caminhoes.add(caminhao);
    return true;
    }
}
