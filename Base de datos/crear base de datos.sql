CREATE DATABASE IF NOT EXISTS sistema_asignacion_unidades_aprendizaje;

USE sistema_asignacion_unidades_aprendizaje;

CREATE TABLE IF NOT EXISTS Usuario (
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Profesor (
	id_usuario INT PRIMARY KEY,
	num_profesor INT NOT NULL UNIQUE,
    nombre_profesor VARCHAR(50) NOT NULL, 
    apellido VARCHAR(50) NOT NULL,
    rfc VARCHAR(13) NOT NULL UNIQUE,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Administrador (
	id_usuario INT PRIMARY KEY,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario) ON DELETE CASCADE 
);

CREATE TABLE IF NOT EXISTS Unidad_Aprendizaje (
	id_unidad_aprendizaje INT AUTO_INCREMENT PRIMARY KEY,
    nombre_unidad_aprendizaje VARCHAR(100) NOT NULL, 
    horas_clase INT UNSIGNED NOT NULL,
    horas_taller INT UNSIGNED NOT NULL,
    horas_laboratorio INT UNSIGNED NOT NULL
);

CREATE TABLE IF NOT EXISTS Profesor_Unidad_Aprendizaje (
	num_profesor INT NOT NULL, 
    id_unidad_aprendizaje INT NOT NULL, 
    PRIMARY KEY (num_profesor, id_unidad_aprendizaje),
    FOREIGN KEY (num_profesor) REFERENCES Profesor(num_profesor) ON DELETE CASCADE, 
    FOREIGN KEY (id_unidad_aprendizaje) REFERENCES Unidad_Aprendizaje(id_unidad_aprendizaje) ON DELETE CASCADE
);