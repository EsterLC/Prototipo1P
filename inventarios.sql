create database inventario;
use inventario;

create table usuarios(
	id_usuario int primary key not null,
    usuario varchar(50),
    contra varchar(50)
);

create table inventarios(
	id int primary key not null,
    nombre varchar(50),
    cantidadanterior int,
    entrada int,
    salida int,
    cantidadactual int,
    estado varchar(50)
);

insert into usuarios value (1,"usuariouno","12345");
insert into usuarios value (2,"usuario","987654");

insert into inventarios values (1, "Producto Uno", 50, 20, 50, 20, "Todavia hay existencia"); 
insert into inventarios values (2, "Producto Dos", 70, 10, 70, 10, "Orden de Producto"); 