package com.example.demo;

import java.util.*;

public class Playlist {
    private List<Musica> musicas = new ArrayList<>();

    public Playlist(){
        musicas.add(new Musica(1, "welcome to my life", 300, true));
        musicas.add(new Musica(2, "vicios e virtudes", 400, true));
        musicas.add(new Musica(3, "chorando se foi", 350, false));
    }

    public List<Musica> getMusicas(){
        return this.musicas;
    }
    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
    }
}
