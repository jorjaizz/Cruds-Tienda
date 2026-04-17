DROP DATABASE IF EXISTS tienda_crud_in5bv;
CREATE DATABASE tienda_crud_in5bv;
USE tienda_crud_in5bv;

CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(100) NOT NULL,
    descripcion_categoria VARCHAR(255)
);

CREATE TABLE usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(100) NOT NULL,
    apellido_usuario VARCHAR(100) NOT NULL,
    edad_usuario INT NOT NULL,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100) NOT NULL,
    precio_producto DOUBLE NOT NULL,
    stock INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE pedido (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    fecha_pedido VARCHAR(50) NOT NULL,
    total_pedido DOUBLE NOT NULL,
    id_usuario INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE detalle_pedido (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    cantidad INT NOT NULL,
    precio_unitario DOUBLE NOT NULL,
    id_pedido INT NOT NULL,
    id_producto INT NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES
('Electrónica', 'Dispositivos electrónicos'),
('Ropa', 'Prendas de vestir'),
('Hogar', 'Artículos para el hogar'),
('Deportes', 'Artículos deportivos'),
('Libros', 'Material de lectura'),
('Juguetes', 'Juguetes para niños'),
('Belleza', 'Productos de belleza'),
('Automotriz', 'Accesorios de vehículos'),
('Oficina', 'Material de oficina'),
('Alimentos', 'Productos comestibles');

INSERT INTO usuario (nombre_usuario, apellido_usuario, edad_usuario, username, password) VALUES
('Juan','Perez',25,'juan25','1234'),
('Maria','Lopez',30,'maria30','1234'),
('Carlos','Gomez',22,'carlos22','1234'),
('Ana','Martinez',28,'ana28','1234'),
('Luis','Rodriguez',35,'luis35','1234'),
('Sofia','Hernandez',27,'sofia27','1234'),
('Pedro','Ramirez',40,'pedro40','1234'),
('Laura','Torres',23,'laura23','1234'),
('Diego','Flores',29,'diego29','1234'),
('Elena','Castro',31,'elena31','1234');

INSERT INTO producto (nombre_producto, precio_producto, stock, id_categoria) VALUES
('Laptop',5000,10,1),
('Camisa',150,50,2),
('Silla',300,20,3),
('Balón',100,30,4),
('Libro Java',200,15,5),
('Muñeca',120,25,6),
('Perfume',250,18,7),
('Aceite Motor',180,40,8),
('Cuaderno',25,100,9),
('Arroz',10,200,10);

INSERT INTO pedido (fecha_pedido, total_pedido, id_usuario) VALUES
('2026-01-01',5000,1),
('2026-01-02',150,2),
('2026-01-03',300,3),
('2026-01-04',100,4),
('2026-01-05',200,5),
('2026-01-06',120,6),
('2026-01-07',250,7),
('2026-01-08',180,8),
('2026-01-09',25,9),
('2026-01-10',10,10);

INSERT INTO detalle_pedido (cantidad, precio_unitario, id_pedido, id_producto) VALUES
(1,5000,1,1),
(1,150,2,2),
(1,300,3,3),
(1,100,4,4),
(1,200,5,5),
(1,120,6,6),
(1,250,7,7),
(1,180,8,8),
(1,25,9,9),
(1,10,10,10);