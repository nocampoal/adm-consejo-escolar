package com.escolar.concejo.administracion.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolar.concejo.administracion.model.Escuela;
import com.escolar.concejo.administracion.service.SchoolService;

@RestController
@CrossOrigin("*")
@RequestMapping("/school")
public class SchoolController {
	
	private static final Log log = LogFactory.getLog(SchoolController.class);
	
	@Autowired
	private SchoolService schoolService;
	
	@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Escuela> getAllSchools(){
		log.info("CALL method: getAllSchools() ");
		return schoolService.getAllSchool();
	}
	
	@PostMapping(path = "/save",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Escuela> saveSchool(@RequestBody Escuela school)  {
		log.info("CALL method: saveSchool() ");
		try {
			schoolService.saveSchool(school);
		} 
		catch (Exception e) {
			log.error("saveSchool error: "+e.getMessage());
			 return new ResponseEntity<>(school, HttpStatus.NOT_FOUND); 
		}
		 return new ResponseEntity<>(school, HttpStatus.OK); 
	 }

}
