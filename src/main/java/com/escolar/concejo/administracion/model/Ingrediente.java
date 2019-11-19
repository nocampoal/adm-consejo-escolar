package com.escolar.concejo.administracion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ingrediente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIngrediente;
	private String nombre;
	@ManyToMany(mappedBy = "ingredientes")
	@JsonIgnore
	private List<Menu> menus;
	
	
	
	
	public Ingrediente() {
		super();
	}




	public Long getIdIngrediente() {
		return idIngrediente;
	}




	public void setIdIngrediente(Long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public List<Menu> getMenus() {
		return menus;
	}




	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	

}
