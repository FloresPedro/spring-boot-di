package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Controller;

/**
 * Clase sin manejo de inyeccion de dependencias
 * @author pedro
 *
 */
//@Service
@Controller
public class MiServicio {
	
	public String operacion() {
		return "Ejecutando algun proceso importante con desacoplamiento";
	}
}
