package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "Mentalidade de Crescimento <br /> Proatividade <br /> Responsabilidade Pessoal <br /> Trabalho em Equipe";
	}
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Saber como criar um banco de dados e tabelas <br /> Saber como criar um DER <br /> Compreender e usar REST <br /> Praticar usando SQL  e Sping Boot";   
	}	
		
		
}
	


