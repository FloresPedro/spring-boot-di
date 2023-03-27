package com.bolsadeideas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	@Value("${descripcion.factura}")
	private String descripcion;
	@Autowired
	private Cliente cliente;
	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> item;
	
	//modificar datos del componente o hacer algo justo despues de la contruccion del objeto
	//inicializar recursos, objetos etc
	@PostConstruct
	public void inicializar() {
		cliente.setNombre( cliente.getNombre().concat(" ").concat("El Pedrin ") );
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}
	//despues de destruir el objeto del contenedor de spring
	//podemos usarlo para cerrar recursos etc.
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida: ".concat(descripcion));
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItem() {
		return item;
	}

	public void setItem(List<ItemFactura> item) {
		this.item = item;
	}

}
