
CREATE TABLE IF NOT EXISTS Rutas
(
    id serial,
    ruta varchar(10) not null,
    tiempo varchar(10) null ,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS Chofer
(
    id serial,
    chofer varchar(10) not null ,
    cedula varchar (16) null ,
    codLic numeric (16),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Buses
(
    id serial,
    pasageros numeric (16)not null ,
    marcas varchar(16) null,
    placas varchar (16)null ,
    id_chofer int,
    foreign key (id_chofer) references Chofer(id),
    PRIMARY KEY (id)
);
CREATE  TABLE IF NOT EXISTS Salid
(
    id serial ,
    salid numeric(10)not null ,
    horasal varchar(10)null,
    PRIMARY KEY (id),
    bus__id int,
    foreign key (bus__id) references Buses(id),
    ruta__id int,
    foreign key (ruta__id) references Rutas(id)
);