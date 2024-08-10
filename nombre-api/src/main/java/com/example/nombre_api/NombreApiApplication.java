package com.example.nombre_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreApiApplication {

	@GetMapping("/nombre")
	public String obtenerNombre() {
		return "Pablo";
	}
}
