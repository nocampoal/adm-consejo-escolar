package com.escolar.consejo.administracion.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolar.consejo.administracion.model.Escuela;
import com.escolar.consejo.administracion.service.SchoolService;

@RestController
@CrossOrigin("*")
@RequestMapping("/school")
public class SchoolController {
	
	private static final Log log = LogFactory.getLog(SchoolController.class);
	
	@Autowired
	private SchoolService schoolService;
	
	@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Escuela>> getAllSchools(){
		log.info("call method getAllSchools() ");
		List<Escuela> schools = schoolService.getAllSchool();
		return new ResponseEntity<>(schools, HttpStatus.OK);
	}
	
	@PostMapping(path = "/save",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Escuela> saveSchool(@RequestBody Escuela school)  {
		log.info("call method saveSchool() ");
		try {
			schoolService.saveSchool(school);
		} 
		catch (Exception e) {
			 log.error("saveSchool method error",e);
			 return new ResponseEntity<>(school, HttpStatus.NOT_FOUND); 
		}
		 return new ResponseEntity<>(school, HttpStatus.OK); 
	 }
	

	@GetMapping(path = "/{idSchool}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Escuela> findSchoolById(@PathVariable Long idSchool) {
			Escuela school = new Escuela();
			try {
				school = schoolService.getSchoolById(idSchool);
			} catch (Exception e) {
				log.error("Error in find by zone", e);
				return  new ResponseEntity<>(school, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(school, HttpStatus.OK); 
	}
	
	@PostMapping(path = "/delete")  
	public ResponseEntity<Void> deleteSchool(@RequestBody Escuela school){
		try {
			log.info("call method deleteSchool");
			schoolService.deleteSchool(school);
		} catch (Exception e){
			log.error("Error removing zone "+school.getNombre(), e);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
