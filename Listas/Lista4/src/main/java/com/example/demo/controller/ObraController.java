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

import com.example.demo.model.Obra;
import com.example.demo.service.ObraService;

@RestController
@RequestMapping("/obras")
public class ObraController {

    private ObraService obraService;

    @Autowired
    public ObraController(ObraService obraService) {
        this.obraService = obraService;
    }

    @GetMapping
    public ResponseEntity<List<Obra>> getAll() throws IOException {
        List<Obra> listaObras = obraService.listarObras();
        return ResponseEntity.status(HttpStatus.OK).body(listaObras);
    }

    @PostMapping
    public ResponseEntity<Obra> cadastrarObra(@RequestBody Obra obra) throws IOException {
        Obra obraCadastrada = obraService.cadastrarNovaObra(obra);
       
        if (obraCadastrada == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraCadastrada);
    }

    @PutMapping
    public ResponseEntity<Obra> atualizarNovaObra(@RequestBody Obra obra) throws IOException {
        Obra obraAtualizada = obraService.atualizarObra(obra);

        if(obraAtualizada == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraAtualizada);

    }
    

}
