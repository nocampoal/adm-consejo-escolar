package com.escolar.concejo.administracion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolar.concejo.administracion.model.Zona;
import com.escolar.concejo.administracion.repository.ZoneRepository;
import com.escolar.concejo.administracion.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService{
	
	@Autowired
	private ZoneRepository zoneRepository;
	
	@Override
	public List<Zona> getAllZones(){
		return zoneRepository.findAll();
	}
	
	@Override
	public Zona saveZone(Zona zone) {
		return zoneRepository.save(zone);
	}

	@Override
	public Zona getZoneById(Long idZone) {
		return zoneRepository.findById(idZone).get();
	}

	@Override
	public void deleteZone(Zona zone) {
		zoneRepository.delete(zone);
		
	}
}
