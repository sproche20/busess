
CREATE TABLE Rutas
(
    id serial,
    ruta varchar(10),
    tiempo varchar(10),
    PRIMARY KEY (id)
);
CREATE TABLE Chofer
(
    id serial,
    chofer varchar(10),
    cedula numeric (16),
    codLic numeric (16),
    PRIMARY KEY (id)
);
CREATE TABLE Buses
(
    id serial,
    marca varchar(10),
    placa numeric (16),
    capPas numeric (16),
    id_chofer int,
    foreign key (id_chofer) references Chofer(id),
    PRIMARY KEY (id)
);
CREATE  TABLE Salid
(
    id serial ,
    salid numeric(10) ,
    horasal varchar(10),
    PRIMARY KEY (id),
    bus__id int,
    foreign key (bus__id) references Buses(id),
    ruta__id int,
    foreign key (ruta__id) references Rutas(id)
);