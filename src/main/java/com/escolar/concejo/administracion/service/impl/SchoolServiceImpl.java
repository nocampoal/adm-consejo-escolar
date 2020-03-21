package com.escolar.concejo.administracion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolar.concejo.administracion.model.Escuela;
import com.escolar.concejo.administracion.repository.SchoolRepository;
import com.escolar.concejo.administracion.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{
	
	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public List<Escuela> getAllSchool() {
		
		return schoolRepository.findAll();
	}

	@Override
	public Escuela saveSchool(Escuela school) {
		
		return schoolRepository.save(school);
	}

	@Override
	public Escuela getSchoolById(Long idSchool) {
		
		return schoolRepository.findById(idSchool).get();
	}

	@Override
	public void deleteSchool(Escuela school) {
		schoolRepository.delete(school);
		
	}
	
	

}
