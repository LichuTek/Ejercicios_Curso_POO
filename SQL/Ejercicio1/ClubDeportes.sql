/* ======== EJERCICIO PRACTICO ======== 

Crear una base de datos llamada CLUB en donde se encuentren dos tablas: socios y deportes.

Modelado

De cada socio se solicita: num_socio, nombre, apellido y dni. Además de esto, cada socio puede realizar solo UN DEPORTE.
De cada deporte se solicita: codigo, nombre, es_grupal. Como existen deportes grupales, puede suceder que más de una persona haga un mismo deporte.
Realizar el modelado de la base de datos (con las correspondientes tablas y relaciones).
Agregar al menos 10 registros en la tabla socios y 3 en la tabla deportes (se sugiere tenis, futbol y basquet).


Consultas SQL:

-Obtener la lista completa de todos los socios.
-Obtener la lista completa de todos los deportes.
-Obtener la lista de socios que practiquen tenis.
-Obtener la cantidad de socios que practiquen futbol.



*/


/*=== MODELADO ==== */
CREATE TABLE IF NOT EXISTS `deporte` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `es_grupal` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;


CREATE TABLE IF NOT EXISTS `socio` (
  `num_socio` int(11) NOT NULL,
  `dni` varchar(50) DEFAULT NULL,
  `num_deporte` int(11) NOT NULL DEFAULT 0,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`num_socio`),
  KEY `FK_socio_deporte` (`num_deporte`),
  CONSTRAINT `FK_socio_deporte` FOREIGN KEY (`num_deporte`) REFERENCES `deporte` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;



/*======= DATOS A INSERTAR ========*/
INSERT INTO `deporte` (`codigo`, `nombre`, `es_grupal`) VALUES
	(1, 'futbol', 1),
	(2, 'tenis', 0),
	(3, 'basquet', 1);


INSERT socio VALUES (1, '44353136', 1, 'Juan', 'Fernandez');
INSERT socio VALUES (2, '44353146', 2, 'Marcos', 'Saliguero');
INSERT socio VALUES (3, '44353132', 3, 'Federico', 'Hernandez');
INSERT socio VALUES (4, '39201568', 1, 'Lucia', 'Gomez');
INSERT socio VALUES (5, '40123987', 2, 'Carlos', 'Martinez');
INSERT socio VALUES (6, '38976543', 3, 'Sofia', 'Lopez');
INSERT socio VALUES (7, '42345678', 1, 'Juan', 'Perez');
INSERT socio VALUES (8, '41123456', 2, 'Maria', 'Rodriguez');
INSERT socio VALUES (9, '45678912', 3, 'Andres', 'Fernandez');
INSERT socio VALUES (10, '40123450', 1, 'Elena', 'Garcia');

/* CONSULTAS */ 

--(1)-- 

SELECT * FROM socio

--(2)-- 

SELECT * FROM deporte

--(3)--

SELECT * FROM socio WHERE socio.num_deporte = 
    (SELECT codigo FROM deporte WHERE nombre = 'tenis')
--(4)--
SELECT COUNT(num_socio) FROM socio WHERE socio.num_deporte =
    (SELECT codigo FROM deporte WHERE nombre = 'futbol')







