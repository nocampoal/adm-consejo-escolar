package com.escolar.consejo.administracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolar.consejo.administracion.model.Zona;

@Repository
public interface ZoneRepository extends JpaRepository<Zona, Long>{

}
