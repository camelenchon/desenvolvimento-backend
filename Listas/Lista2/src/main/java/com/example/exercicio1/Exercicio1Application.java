package com.example.exercicio1;

import java.util.List;

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
public class Exercicio1Application {

	private ListarIlhasDeCalor listaDeIlhas = new ListarIlhasDeCalor();

	@GetMapping("/ilhas-de-calor")
	public List<IlhaDeCalor> getListaDeIlhas() {
		return listaDeIlhas.getListaDeIlhas();
	}

	@PostMapping
	public String adicionarIlhaNaLista(@RequestBody IlhaDeCalor ilhasDeCalor) {
		listaDeIlhas.adicionarIlha(ilhasDeCalor);
		return "Ilha de calor " + ilhasDeCalor.getBairro() + " adicionada com sucesso!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}
}
