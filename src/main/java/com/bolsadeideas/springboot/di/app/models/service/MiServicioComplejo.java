package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * Clase sin manejo de inyeccion de dependencias
 * @author pedro
 *
 */
//@Service
@Controller("miServicioComplejo")
@Primary //utilizar la palabra primary para seleccionar que clase usar para realizar la inyeccion de dependencias cuando se tienen
//dos clases que implementan la misma interfaz ya que spring no sabe cual de las dos inyectar
public class MiServicioComplejo implements IServicio{
	
	//todo componente spring tiene que tener un contructor sin argumentos
	//para que no falle a la hora de agregar al contenedor de objectos
	//Si no se usa manda error
	
	public String operacion() {
		return "Ejecutando algun proceso importante complejo";
	}
}
