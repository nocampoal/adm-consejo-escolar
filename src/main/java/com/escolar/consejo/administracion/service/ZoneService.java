package com.escolar.consejo.administracion.service;

import java.util.List;

import com.escolar.consejo.administracion.model.Zona;

public interface ZoneService {
	public List<Zona> getAllZones();
	public Zona saveZone(Zona zone);
	public Zona getZoneById(Long idZone);
	public void deleteZone(Zona zone);
}
