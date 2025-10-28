package com.educandoweb.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/")
	public String hello() {
		return "🚀 Projeto Course rodando com sucesso, Djalma!";
	}
}
