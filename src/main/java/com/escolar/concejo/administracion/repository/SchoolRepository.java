package com.escolar.concejo.administracion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolar.concejo.administracion.model.Escuela;

@Repository
public interface SchoolRepository extends JpaRepository<Escuela, Long>{

}
