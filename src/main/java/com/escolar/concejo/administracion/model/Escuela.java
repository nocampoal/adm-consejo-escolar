package com.escolar.concejo.administracion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "escuela")
public class Escuela {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="zona")
	private Zona zona;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	
	
	
	
}
