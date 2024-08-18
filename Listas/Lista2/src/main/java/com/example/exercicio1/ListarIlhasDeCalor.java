package com.example.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListarIlhasDeCalor {
    public List<IlhaDeCalor> ilhadeCalor = new ArrayList<>();

    public ListarIlhasDeCalor(){
        ilhadeCalor.add(new IlhaDeCalor(1,"Zona Sul","Norte"));
    }
    public List<IlhaDeCalor> getListaDeIlhas(){
        return this.ilhadeCalor;
    }

    public void adicionarIlha(IlhaDeCalor ilhasDeCalor){
        this.ilhadeCalor.add(ilhasDeCalor);

    }

}
