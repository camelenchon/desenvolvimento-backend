package com.example.demo;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
@SpringBootApplication
public class PlaylistAplication {

	private Playlist playlist = new Playlist();

	@GetMapping
	public List<Musica> getMusicas() {
		return playlist.getMusicas();
	}

	@GetMapping("/favoritadas")
	public List<Musica> getMusicasFavoritadas() {
		List<Musica> favoritadas = new ArrayList<>();

		for (Musica musica : playlist.getMusicas()) {
			if (musica.isEstahFavoritada()) {
				favoritadas.add(musica);
			}
		}
		return favoritadas;

	}

	@PostMapping
	public String adicionarMusica(@RequestBody Musica musica){
		for (Musica musicaNaPlaylist : playlist.getMusicas()){
			if(musica.getId() == musicaNaPlaylist.getId()){
				return "A musica ja esta na playlist";
			}
		} 
		playlist.adicionarMusica(musica);
		return "Musica foi incluida com sucesso";
	}

	public static void main(String[] args) {
		SpringApplication.run(PlaylistAplication.class, args);
	}

}
