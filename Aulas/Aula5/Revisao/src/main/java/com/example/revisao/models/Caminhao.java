package com.example.revisao.models;

import com.example.revisao.enums.TamanhoCaminhao;

public class Caminhao {
    private int id;
    private String modelo;
    private TamanhoCaminhao tamanhoCaminho;
    
    public Caminhao(){}
    
    public Caminhao(int id, String modelo, TamanhoCaminhao tamanhoCaminho) {
        this.id = id;
        this.modelo = modelo;
        this.tamanhoCaminho = tamanhoCaminho;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TamanhoCaminhao getTamanhoCaminho() {
        return tamanhoCaminho;
    }

    public void setTamanhoCaminho(TamanhoCaminhao tamanhoCaminho) {
        this.tamanhoCaminho = tamanhoCaminho;
    }



}
