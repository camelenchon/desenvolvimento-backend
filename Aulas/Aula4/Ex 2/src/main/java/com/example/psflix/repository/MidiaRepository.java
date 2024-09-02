package com.example.psflix.repository;
import com.example.psflix.model.Midia;
import java.util.*;



public class MidiaRepository {
    private List<Midia> midias = new ArrayList<>();

    public MidiaRepository(){
        midias.add(new Midia(1, "Lagoa Azul", "Filme"));
    }

    public List<Midia> getAll(){
        return midias;
    }

    public void save(Midia midia){
        midias.add(midia);
    }
    


    

}
