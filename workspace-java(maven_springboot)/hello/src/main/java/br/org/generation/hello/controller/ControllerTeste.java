package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //torna acessivel via URL
public class ControllerTeste {
	@GetMapping("/hello") //atributo na URL por onde será acessado
	public String sayHello() {
		return "Hello world! Nosso primeiro projeto Spring Boot usando Maven";
	}
	@GetMapping("/bye")
	public String sayGoodBye() {
		return "Tchau!";
	}
}
