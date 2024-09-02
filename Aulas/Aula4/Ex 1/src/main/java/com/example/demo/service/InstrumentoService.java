package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Instrumento;
import com.example.demo.repository.InstrumentoRepository;

public class InstrumentoService {
    private InstrumentoRepository repository = new InstrumentoRepository();
    
    public String cadastrarInstrumento(Instrumento instrumento){
        for (Instrumento instrumentoNaLista : repository.getAll()){
            if(instrumento.getId() == instrumentoNaLista.getId()){
                return "ID ja cadastrado..";
            }
        }
        repository.save(instrumento);
        return "Instrumento "+ instrumento.getNome()
        + " cadastrado com sucesso!";
    }

    public List<Instrumento> obterInstrumentosCadastrados() {
       return repository.getAll();
    }
}
