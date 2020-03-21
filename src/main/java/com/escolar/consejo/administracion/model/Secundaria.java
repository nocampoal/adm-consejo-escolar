package com.escolar.consejo.administracion.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Secundaria extends Escuela {
	private Long cupoCena;
	private String tipoJornada;   //simple doble completa
	
}
