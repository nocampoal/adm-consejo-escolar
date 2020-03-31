package com.escolar.consejo.administracion.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="menu")
@Getter
@Setter
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMenu;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private String dia;
	@ManyToMany
	private List<Ingrediente> ingredientes;
	private String tipoEscuela;
	private String tipo; //desay, almz, meriend, cena
	
}
