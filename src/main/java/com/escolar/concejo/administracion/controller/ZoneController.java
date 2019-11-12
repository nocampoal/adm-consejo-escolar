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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolar.concejo.administracion.model.Zona;
import com.escolar.concejo.administracion.service.ZoneService;

@RestController
@CrossOrigin("*")
@RequestMapping("/zone")
public class ZoneController {
	
	private static final Log LOG = LogFactory.getLog(ZoneController.class);
	
	@Autowired
	private ZoneService zoneService;
	
	@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Zona> getAllZones(){
		LOG.info("Method: getAllZone() ");
		return zoneService.getAllZones();
	}
	
	@PostMapping(path = "/save",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Zona> saveZone(@RequestBody Zona zone)  {
		 LOG.info("Method: ");
		try {
			zoneService.saveZone(zone);
		} 
		catch (Exception e) {
			 LOG.error("saveZone error: "+e.getMessage());
			 return new ResponseEntity<>(zone, HttpStatus.NOT_FOUND); 
		}
		 return new ResponseEntity<>(zone, HttpStatus.OK); 
	 }
	
	
	@GetMapping(path = "/{idZone}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Zona> findZoneById(@PathVariable Long idZone) {
			Zona zone = new Zona();
			try {
				zone = zoneService.getZoneById(idZone);
			} catch (Exception e) {
				LOG.error("findZoneById error :"+e.getMessage());
				LOG.error("Error in find by zone", e);
				return  new ResponseEntity<>(zone, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(zone, HttpStatus.OK); 
	}
	
	@PostMapping(path = "/delete")   //AFINAR EL RESPONSE DE ESTE METODO DELETE
	public void deleteZone(@RequestBody Zona zone){
		try {
			zoneService.deleteZone(zone);
		} catch (Exception e){
			LOG.error("Error removing zone "+zone.getNombre(), e);
		}
	}
	
	
	
	@GetMapping("/conectionVerify")
	public String verifyConnection(){
		LOG.info("Method: verify ");
		return "Connection succesfull";
	}

}
