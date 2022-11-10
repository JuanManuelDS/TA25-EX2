drop table if exists departamentos;

CREATE TABLE departamentos (
codigo INT,
nombre VARCHAR(100),
presupuesto INT,
PRIMARY KEY (codigo));

drop table if exists empleados;

CREATE TABLE empleados (
dni VARCHAR(8),
nombre VARCHAR(100),
apellidos VARCHAR (255),
departamento INT REFERENCES departamentos(codigo) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (dni));

insert into departamentos (codigo, nombre, presupuesto) values (1, 'Accounting', 419494);
insert into departamentos (codigo, nombre, presupuesto) values (2, 'Sales', 327263);
insert into departamentos (codigo, nombre, presupuesto) values (3, 'Legal', 749426);
insert into departamentos (codigo, nombre, presupuesto) values (4, 'Training', 36591);
insert into departamentos (codigo, nombre, presupuesto) values (5, 'Product Management', 581239);
insert into departamentos (codigo, nombre, presupuesto) values (6, 'Research and Development', 919014);
insert into departamentos (codigo, nombre, presupuesto) values (7, 'Human Resources', 310396);
insert into departamentos (codigo, nombre, presupuesto) values (8, 'Product Management', 846711);
insert into departamentos (codigo, nombre, presupuesto) values (9, 'Training', 167324);
insert into departamentos (codigo, nombre, presupuesto) values (10, 'Support', 860687);

insert into empleados (dni, nombre, apellidos, departamento) values ('61824574', 'Sophey', 'Coghlan', 4);
insert into empleados (dni, nombre, apellidos, departamento) values ('73514407', 'Janka', 'Mitro', 9);
insert into empleados (dni, nombre, apellidos, departamento) values ('40458342', 'Layton', 'Donnett', 5);
insert into empleados (dni, nombre, apellidos, departamento) values ('10257651', 'Lion', 'Smeed', 7);
insert into empleados (dni, nombre, apellidos, departamento) values ('94720719', 'Zia', 'Robinett', 1);
insert into empleados (dni, nombre, apellidos, departamento) values ('65804271', 'Rianon', 'Spurriar', 2);
insert into empleados (dni, nombre, apellidos, departamento) values ('91055029', 'Hyacinth', 'Upwood', 10);
insert into empleados (dni, nombre, apellidos, departamento) values ('44466155', 'Reinwald', 'Nell', 1);
insert into empleados (dni, nombre, apellidos, departamento) values ('29041590', 'Codi', 'Labram', 3);
insert into empleados (dni, nombre, apellidos, departamento) values ('61885333', 'Caria', 'Ferreiro', 4);



