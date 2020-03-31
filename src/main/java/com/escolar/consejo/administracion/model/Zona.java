package com.escolar.consejo.administracion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "zona")
@Getter
@Setter
public class Zona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_zona;
	
	@NotBlank
	private String nombre;
	
	private Integer codigoPostal;
	
	@OneToMany(mappedBy="zona")
	@JsonIgnore
	private List<Escuela> escuelas;

}
