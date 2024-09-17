package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vaga;
import com.example.demo.service.VagaService;

@RequestMapping("/vagas")
@RestController
public class VagaController {

    private VagaService vagaService;

    @Autowired
    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @GetMapping
    public ResponseEntity<List<Vaga>> getAll() throws IOException { // classe generica, encapsula o retorno, manipula o status code de retorno
        List<Vaga> listaVagas = vagaService.listarVagas();
        return ResponseEntity.status(HttpStatus.OK).body(listaVagas);
    }

    @PostMapping
    public ResponseEntity<Vaga> cadastrarNovaVaga(@RequestBody Vaga vaga) throws IOException {
        Vaga vagaCadastrada = vagaService.save(vaga);
        if (vagaCadastrada == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(vagaCadastrada);
    }

    @PutMapping
    public ResponseEntity<Vaga> update(@RequestBody Vaga vaga) throws IOException {
        Vaga vagaAtualizada = vagaService.update(vaga);

        if(vagaAtualizada == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(vagaAtualizada);

    }

}
