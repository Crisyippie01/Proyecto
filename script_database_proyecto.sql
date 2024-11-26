Create database ShopofPets;
use ShopofPets;

create table Cliente(
	usuario		varchar(20) not null,
    contraseña	varchar(20) not null,
    primary key(usuario)
);

create table Mascota(
	idMascota int not null auto_increment,
    edad int not null,
    peso double not null,
    nombre varchar(20) not null,
    descripcion varchar(50) not null,
    usuario		varchar(20),
    primary key(idMascota),
    foreign key(usuario) references Cliente(usuario)
);

create table Staff(
	usuario varchar(20) not null,
    contraseña varchar(20) not null,
    primary key(usuario)
);

create table Cargo(
	idCargo int not null auto_increment,
    descripcion varchar(20) not null, 
    primary key(idCargo)
);

create table Empleado(
	rut    varchar(20) not null,
	nombre varchar(20) not null,
    cargo int not null,
    sueldo double not null,
    primary key(rut),
    foreign key(cargo) references Cargo(idCargo)
);

INSERT INTO		cargo(idCargo,descripcion)
VALUES(	1,"cajero");

INSERT INTO		cargo(idCargo,descripcion)
VALUES(	2,"Ayudante");

INSERT INTO		cargo(idCargo,descripcion)
VALUES(	3,"Veterinario");