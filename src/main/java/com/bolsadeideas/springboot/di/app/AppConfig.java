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
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Monitor LG LCD 24'", 500);
		Producto producto2 = new Producto("Notebook Asus ",800);
		Producto producto3 = new Producto("Impresora HP ",200);
		Producto producto4 = new Producto("Escritorio oficina ",300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
