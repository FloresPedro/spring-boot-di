package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

/**
 * Otra forma de inyectar bean's l contenedor de spring
 * muy util de registrar cuando son clases de terceros
 * o otras API's se queda comentado para que el proyecto levante
 * @author pedro
 *
 */
@Configuration
public class AppConfig {
	//Se registran todos los beans que se van a agregar al contenedor
	//Se puede utilizar @Primary sin ningun problema y a si definir un bean que se tome por defecto
	//
	/*
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	*/
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony",150);
		Producto producto2 = new Producto("Bicicleta 26'",300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
}
