package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/app")
@SpringBootApplication
public class DemoApplication {
	private static List<Pokemon> pokedex = new ArrayList<>();

	@GetMapping("/pokemons")
	public static List<Pokemon> getPokemons() {
		return pokedex;
	}

	@PostMapping
	public static String adicionarPokemon(@RequestBody Pokemon pokemon){
		for (Pokemon pokemonNaLista : pokedex){
			if (pokemon.getId() == pokemonNaLista.getId()){
				return "Pokemon ja existe";
			}
		}
		pokedex.add(pokemon);
		return "Pokemon " + pokemon.getNome() + " incluido na pokedex";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		pokedex.add(new Pokemon(1, "charmander"));
		pokedex.add(new Pokemon(2, "squirtle"));
		pokedex.add(new Pokemon(3, "bulbassaur"));
	}

}
