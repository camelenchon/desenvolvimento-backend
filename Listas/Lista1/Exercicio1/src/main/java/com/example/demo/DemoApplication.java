package com.example.demo;

import javax.print.DocFlavor.STRING;

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

	@GetMapping("/{senha}")
	public String verificarSenha(@PathVariable String senha) {
		if ("senha123".equals(senha)) {
			return "Entrada autorizada";
		} else {
			return "Senha incorreta, entrada NAO autorizada!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
