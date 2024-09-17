package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vaga {

    private int id;

   @JsonProperty("placa_veiculo")
    private String placaVeiculo;

    @JsonProperty("esta_ocupada")
    private boolean estOcupada;

    public Vaga() {
    }

    public Vaga(int id, String placaVeiculo, boolean estOcupada) {
        this.id = id;
        this.placaVeiculo = placaVeiculo;
        this.estOcupada = estOcupada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public boolean isEstOcupada() {
        return estOcupada;
    }

    public void setEstOcupada(boolean estOcupada) {
        this.estOcupada = estOcupada;
    }

}
