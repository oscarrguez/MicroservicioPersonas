package com.mx.Personas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Personas.entity.Persona;

public interface PersonaDao extends JpaRepository<Persona, String>{

}
