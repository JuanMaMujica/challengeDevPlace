CREATE DATABASE IF NOT EXISTS challengebdd;	/* Creamos la base de datos "challengeBDD"*/
USE challengebdd;	/* usamos la bdd que acabamos de crear*/

/*-----------------------CREACION DE LAS TABLAS CON SUS RESPECTIVOS CAMPOS---------------*/
CREATE TABLE IF NOT EXISTS empleados (
  id_empleado int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  nombre varchar(30) NOT NULL,
  apellido varchar(30) NOT NULL,
  telefono bigint(20) DEFAULT NULL,
  email varchar(30) DEFAULT NULL,
  id_municipio int(10) NOT NULL,
  PRIMARY KEY (id_empleado),	/*Indicamos que la clave primaria es el campo id_empleado*/
  KEY municipioPerteneciente (id_municipio)	/*Creamos la relacion de la tabla Empleados con la tabla Municipios a traves del campo id_municipio*/
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS municipios (
  id_municipio int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(30) NOT NULL,
  provincia varchar(30) NOT NULL,
  PRIMARY KEY (id_municipio)	/* Indicamos que la llave primaria es id_municipio*/
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS puesto (
  id_empleado int(10) UNSIGNED NOT NULL,
  nombre_puesto varchar(40) NOT NULL,
  antiguedad tinyint(3) UNSIGNED NOT NULL,
  salario float UNSIGNED NOT NULL,
  KEY empleadoPuesto (id_empleado)	/* Creamos la relacion de la tabla Puesto con Empleados a traves del campo id_empleado*/
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Indicamos que la clave foranea de la tabla empleados que relaciona a la tabla empleados con la de municipios a traves de la relacion municipioPerteneciente es id_municipio*/
ALTER TABLE empleados
  ADD CONSTRAINT municipioPerteneciente FOREIGN KEY (id_municipio) REFERENCES municipios (id_municipio);

/*Indicamos que la clave foranea de la tabla puesto que relaciona a la tambla puesto con la de empleados a traves de la relacion empleadoPuesto es id_empleado*/
ALTER TABLE puesto
  ADD CONSTRAINT empleadoPuesto FOREIGN KEY (id_empleado) REFERENCES empleados (id_empleado);
