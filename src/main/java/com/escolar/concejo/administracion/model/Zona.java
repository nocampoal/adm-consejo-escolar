package com.escolar.concejo.administracion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "zona")
public class Zona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_zona;
	
	@NotBlank
	private String nombre;
	
	@OneToMany(mappedBy="zona")
	private List<Escuela> escuelas;

	

	public Long getId_zona() {
		return id_zona;
	}

	public void setId_zona(Long id_zona) {
		this.id_zona = id_zona;
	}

	public List<Escuela> getEscuelas() {
		return escuelas;
	}

	public void setEscuelas(List<Escuela> escuelas) {
		this.escuelas = escuelas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
