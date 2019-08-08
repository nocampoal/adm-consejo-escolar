package com.escolar.concejo.administracion.service;

import java.util.List;

import com.escolar.concejo.administracion.model.Zona;

public interface ZoneService {
	public List<Zona> getAllZones();
	public Zona saveZone(Zona zone);
	public Zona getZoneById(Long idZone);
}
