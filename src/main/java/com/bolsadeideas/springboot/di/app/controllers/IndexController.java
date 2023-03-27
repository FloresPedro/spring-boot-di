package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {
	
	//creacion de un objeto, alto acoplamiento dificil de mantener
	//private MiServicio servicio = new MiServicio();
	//ahora se esta inyectando la instancia pero se puede desacoplar mas usando una interfaz
	//private MiServicio servicio;
	@Autowired
	@Qualifier("miServicioSimple")
	private IServicio servicio;
	
	//inyectando a travez del contructor. el mismo principio
	//para realizar la inyeccion se quedan a modo de ejemplo
	/* Se puede omitir el Autowired y funciona igual
	@Autowired
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/

	//mapeo a un arreglo de rutas
	@GetMapping({"/index","/",""})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	//inyectar via metodo set, Se escribe la notacion @Autowired en el metodo set para que busque el objeto
	//si ya se encuentra registrado en el contenedor de spring
	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	
}
