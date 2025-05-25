use mysql;
DROP USER IF EXISTS 'theuser'@'localhost';
CREATE USER 'theuser'@'localhost' IDENTIFIED BY 'theuser';
DROP DATABASE IF EXISTS store;
CREATE DATABASE store;
GRANT ALL ON store.* TO 'theuser'@'localhost';

USE store;

DROP TABLE IF EXISTS Cliente;
CREATE TABLE Cliente(
cf CHAR(16) NOT NULL,
nome VARCHAR(20) NOT NULL,
cognome VARCHAR(20) NOT NULL,
dataNascita DATE NOT NULL,
PRIMARY KEY(cf)
);
DROP TABLE IF EXISTS Pagamento;
CREATE TABLE Pagamento(
id INT NOT NULL auto_increment,
sconto decimal(5,2) default 0.00,
idCliente CHAR(16) NOT NULL,
dataPagamento DATE NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(idCliente) REFERENCES CLIENTE(cf) ON UPDATE cascade ON DELETE cascade
);
DROP TABLE IF EXISTS Chitarra;
CREATE TABLE Chitarra(
codice INT NOT NULL,
marca Varchar(20) NOT NULL,
prezzo double(7,2) NOT NULL,
quantità INT NOT NULL default 0,
colore VARCHAR(20) NOT NULL,
tipo ENUM('Stratocaster','Gibson') NOT NULL,
tipoPickup VARCHAR(30),
numSelettori INT,
PRIMARY KEY(codice)
);
DROP TABLE IF EXISTS Fornitore;
CREATE TABLE Fornitore(
codice INT NOT NULL,
nome varchar(20) not null,
anniEsperienza INT default 0 NOT NULL,
PRIMARY KEY(codice)
);
DROP TABLE IF EXISTS Telefono;
CREATE TABLE Telefono(
numTelefono char(10) not null,
idCliente CHAR(16) NOT NULL,
PRIMARY KEY(numTelefono,idCliente),
FOREIGN KEY(idCliente) REFERENCES CLIENTE(cf) ON UPDATE cascade ON DELETE cascade
);
DROP TABLE IF EXISTS RelativoA;
CREATE TABLE RelativoA(
idPagamento INT NOT NULL,
idChitarra INT NOT NULL,
quantità int not null,
PRIMARY KEY(idPagamento,idChitarra),
FOREIGN KEY(idPagamento) REFERENCES PAGAMENTO(id) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idChitarra) REFERENCES CHITARRA(codice) ON UPDATE cascade ON DELETE cascade
);
DROP TABLE IF EXISTS Ha;
CREATE TABLE Ha(
idFornitore INT NOT NULL,
idChitarra INT NOT NULL,
PRIMARY KEY(idFornitore,idChitarra),
FOREIGN KEY(idFornitore) REFERENCES FORNITORE(codice) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idChitarra) REFERENCES CHITARRA(codice) ON UPDATE cascade ON DELETE cascade
);
