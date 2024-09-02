package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.demo.model.Instrumento;
import com.example.demo.service.InstrumentoService;

@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {
    private InstrumentoService service = new InstrumentoService();

    @GetMapping
    public List<Instrumento> getAInstrumentos() {
        return service.obterInstrumentosCadastrados();
    }
    
    

    @PostMapping
    public String cadastrarInstrumento(@RequestBody Instrumento instrumento){
        return service.cadastrarInstrumento(instrumento);
    }

    }



