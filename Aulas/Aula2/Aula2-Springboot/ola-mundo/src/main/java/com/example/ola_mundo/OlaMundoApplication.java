package com.example.ola_mundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")

public class OlaMundoApplication {

	@GetMapping("/ola-mundo")
	public String olaMundo(){
		return "Ola mundo!";
	}
	@GetMapping("tchau-mundo")
	public String tchauMundo(){
		return "Tchau mundo";
	}

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
	}

}
