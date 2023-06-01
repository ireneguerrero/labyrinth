DROP DATABASE IF EXISTS labyrinth;
CREATE DATABASE labyrinth;
USE labyrinth;

CREATE TABLE usuario (
    nombre VARCHAR(80) NOT NULL,
    password VARCHAR(30) NOT NULL
);

CREATE TABLE personaje (
    vida NUMERIC,
    estado BOOLEAN,
    poder NUMERIC,
    daño NUMERIC,
    fuerza NUMERIC,
    inteligencia NUMERIC,
    agilidad NUMERIC
);

USE labyrinth;

-- Agregar columna para almacenar la cantidad de llaves recogidas
ALTER TABLE personaje ADD COLUMN llaves_recogidas INT DEFAULT 0;

-- Agregar columna para almacenar el estado de las puertas (abiertas/cerradas)
ALTER TABLE personaje ADD COLUMN puertas_estado JSON DEFAULT '{}';

-- Agregar columna para almacenar la cantidad de recompensas obtenidas
ALTER TABLE personaje ADD COLUMN recompensas_obtenidas INT DEFAULT 0;
