package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class DemoApplication {

	

	@GetMapping("/idade{idade}")
	public String verificarMaioridade(String idade) {
		int idadeConvertida = Integer.parseInt(idade);

		if (idadeConvertida >= 18) {
			return "maior de idade";
		}
		return "menor de idade";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}