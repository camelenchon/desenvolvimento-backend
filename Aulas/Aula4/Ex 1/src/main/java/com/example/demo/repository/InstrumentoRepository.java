package com.example.demo.repository;
import java.math.BigDecimal;
import java.util.*;

import com.example.demo.model.Instrumento;

public class InstrumentoRepository {

    private List<Instrumento> instrumentos = new ArrayList<>();

    public InstrumentoRepository(){
        instrumentos
            .add(new Instrumento(1, "Guitarra", new BigDecimal(2100.00)));
        instrumentos
            .add(new Instrumento(2, "Bateria", new BigDecimal(1500.50)));
    }
    public void save(Instrumento instrumento){
        instrumentos.add(instrumento);
    }

    public List<Instrumento> getAll(){
        return instrumentos;
    }
}
