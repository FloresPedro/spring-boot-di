package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	//creacion de un objeto, alto acoplamiento dificil de mantener
	//private MiServicio servicio = new MiServicio();
	//ahora se esta inyectando la instancia
	@Autowired
	private MiServicio servicio;
	
	//mapeo a un arreglo de rutas
	@GetMapping({"/index","/",""})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
}
