package com.escolar.concejo.administracion.service;

import java.util.List;

import com.escolar.concejo.administracion.model.Escuela;


public interface SchoolService {
	public List<Escuela> getAllSchool();
	public Escuela saveSchool(Escuela school);
	public Escuela getSchoolById(Long idSchool);
	public void deleteSchool(Escuela school);
}
