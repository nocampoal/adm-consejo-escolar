package com.escolar.consejo.administracion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "escuela")
@Getter
@Setter
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
	private Long cupodmc;
	private Long cupoComedor;
	private String nombreInstitucion; // 
	private String nivel; //inicial, primaria,secundaria,superior
	private String tipoMenu; //simple, doble, completo (nivel=secundiaria)


}
