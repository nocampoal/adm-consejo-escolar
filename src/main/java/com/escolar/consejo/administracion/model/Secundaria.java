package com.escolar.consejo.administracion.model;

import javax.persistence.Entity;

@Entity
public class Secundaria extends Escuela {
	private Long cupoCena;
	private String tipoJornada;   //simple doble completa
	
	
	
	public Secundaria() {
		super();	
	}
	public Long getCupoCena() {
		return cupoCena;
	}
	public void setCupoCena(Long cupoCena) {
		this.cupoCena = cupoCena;
	}
	public String getTipoJornada() {
		return tipoJornada;
	}
	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}
	
	
	
	
	

}
