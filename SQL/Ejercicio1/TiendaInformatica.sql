/*
===============EJERCICIO PRACTICO TIENDA DE INFORMATICA ==============

Crear una base de datos llamada infotienda en donde se encuentren dos tablas: producto y fabricante.

--=== MODELADO ===--

-De cada producto se solicita: código, nombre y precio. Además de esto, cada producto lo puede realizar solo UN FABRICANTE.
-De cada fabricante se solicita: código, nombre, dirección. Puede suceder que distintos productos tengan al mismo fabricante.
-Realizar el modelado de la base de datos (con las correspondientes tablas y relaciones).
-Agregar al menos 10 registros en la tabla productos y 3 en la tabla fabricantes.

--=== CONSULTAS ===--
-Obtener la lista completa de todos los productros ordenados por precio de mas barato a mas caro
-Obtener la lista completa de todos los fabricantes ordenados por nombre de forma ascendente
-Obtener el nombre y precio de todos los productos que valgan mas de $10000
-Obtener el nombre y precio del producto mas barato



*/

--1)

CREATE TABLE IF NOT EXISTS `fabricantes` (
  `codigo` int(11) NOT NULL,
  `nombre` int(11) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

CREATE TABLE IF NOT EXISTS `productos` (
  `codigo` int(10) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `cod_fabricante` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `FK_productos_fabricantes` (`cod_fabricante`),
  CONSTRAINT `FK_productos_fabricantes` FOREIGN KEY (`cod_fabricante`) REFERENCES `fabricantes` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

INSERT fabricantes VALUES (1, 'La Chalquita', '188 BackStreet');
INSERT fabricantes VALUES (2, 'Techno Supplies', '451 Silicon Valley');
INSERT fabricantes VALUES (3, 'Fresh Goods Co.', '32 Market St.');

INSERT productos VALUES (1, 'Laptop Acer Aspire', 750.00, 2);
INSERT productos VALUES (2, 'Smartphone Galaxy S10', 600.00, 2);
INSERT productos VALUES (3, 'Teclado Mecánico RGB', 120.00, 2);
INSERT productos VALUES (4, 'Impresora Canon PIXMA', 90.00, 3);
INSERT productos VALUES (5, 'Smart TV LG 55"', 800.00, 1);
INSERT productos VALUES (6, 'Cámara Nikon D3500', 450.00, 3);
INSERT productos VALUES (7, 'Tablet Huawei MatePad', 300.00, 1);
INSERT productos VALUES (8, 'Audífonos Sony WH-1000XM4', 250.00, 1);
INSERT productos VALUES (9, 'Disco Duro Externo WD 1TB', 70.00, 2);
INSERT productos VALUES (10, 'Monitor Dell 24"', 180.00, 3);


--2)


SELECT * FROM productos ORDER BY precio DESC

SELECT * FROM fabricantes ORDER BY nombre ASC

SELECT nombre,precio FROM productos WHERE precio > 10000

SELECT nombre,precio FROM productos ORDER BY ASC LIMIT 0,1 -- ESTA SOLUCION TRAE UN RANGO DE DATOS DE 0,1

SELECT nombre, MIN(precio) FROM productos -- Esta es otra solucion posible