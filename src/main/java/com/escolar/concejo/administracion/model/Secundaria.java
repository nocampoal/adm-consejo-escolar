package com.escolar.concejo.administracion.model;

import javax.persistence.Entity;

@Entity
public class Secundaria extends Escuela {
	private Long cupoCena;
	private String tipo;  //tipo que?  //simple doble completa
	public Long getCupoCena() {
		return cupoCena;
	}
	public void setCupoCena(Long cupoCena) {
		this.cupoCena = cupoCena;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
