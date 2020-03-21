package com.escolar.consejo.administracion.model;

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
	private Long id_escuela;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idZona")
	private Zona zona;
	private String direccion;
	private String director;
	private Long cupomc;
	private Long cupoComedor;
	private String nombreInstitucion; // 

	

	public Escuela() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_escuela() {
		return id_escuela;
	}

	public void setId_escuela(Long id_escuela) {
		this.id_escuela = id_escuela;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Long getCupomc() {
		return cupomc;
	}

	public void setCupomc(Long cupomc) {
		this.cupomc = cupomc;
	}

	public Long getCupoComedor() {
		return cupoComedor;
	}

	public void setCupoComedor(Long cupoComedor) {
		this.cupoComedor = cupoComedor;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	
	
	
	
	
}
