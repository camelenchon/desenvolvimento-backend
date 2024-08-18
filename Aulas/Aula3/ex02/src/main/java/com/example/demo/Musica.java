package com.example.demo;

public class Musica {
    private int id;
    private String nome;
    private int duracaoEmSegundos;
    private boolean estahFavoritada;

    public Musica (){

    }
    
    public Musica(int id, String nome, int duracaoEmSegundos, boolean estahFavoritada) {
        this.id = id;
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.estahFavoritada = estahFavoritada;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }
    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }
    public boolean isEstahFavoritada() {
        return estahFavoritada;
    }
    public void setEstahFavoritada(boolean estahFavoritada) {
        this.estahFavoritada = estahFavoritada;
    }

    

}
