package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Controller;

/**
 * Clase sin manejo de inyeccion de dependencias
 * @author pedro
 *
 */
//@Service
@Controller("miServicioSimple")
public class MiServicio implements IServicio{
	
	//todo componente spring tiene que tener un contructor sin argumentos
	//para que no falle a la hora de agregar al contenedor de objectos
	//Si no se usa manda error
	
	public String operacion() {
		return "Ejecutando algun proceso importante con desacoplamiento";
	}
}
