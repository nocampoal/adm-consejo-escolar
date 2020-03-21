package com.escolar.consejo.administracion.service;

import java.util.List;

import com.escolar.consejo.administracion.model.Escuela;


public interface SchoolService {
	public List<Escuela> getAllSchool();
	public Escuela saveSchool(Escuela school);
	public Escuela getSchoolById(Long idSchool);
	public void deleteSchool(Escuela school);
}
