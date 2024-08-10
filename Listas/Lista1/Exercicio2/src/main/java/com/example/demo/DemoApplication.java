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

	@GetMapping("/{quilometragem}")
	public String verificarQuilometragem(@PathVariable String quilometragem) {
		int quantidadeQuilometrosConvertidade = Integer.parseInt(quilometragem);
		int quantidadeQuilometros = quantidadeQuilometrosConvertidade * 25;

		return "O preco da expedicao eh " + quantidadeQuilometros + " pratas";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
