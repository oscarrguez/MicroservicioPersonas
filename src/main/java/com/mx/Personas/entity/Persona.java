package com.mx.Personas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PERSONAS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

	/*
CURP NVARCHAR2(25) PRIMARY KEY,
NOMBRE NVARCHAR2(50),
APELLIDO NVARCHAR2(50),
EDAD NUMBER,
CIUDAD NVARCHAR2(50),
GENERO NVARCHAR2(50),
ESTADO_CIVIL NVARCHAR2(50)
*/
	@Id
	private String curp;
	private String nombre;
	private String apellido;
	private int edad;
	private String ciudad;
	private String genero;
	@Column(name="ESTADO_CIVIL")
	private String estadoCivil;

	
}
