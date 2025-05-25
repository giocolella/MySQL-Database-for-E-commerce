use mysql;
DROP USER IF EXISTS 'theuser'@'localhost';
CREATE USER 'theuser'@'localhost' IDENTIFIED BY 'theuser';
DROP DATABASE IF EXISTS estore;
CREATE DATABASE estore;
GRANT ALL ON estore.* TO 'theuser'@'localhost';

USE estore;

DROP TABLE IF EXISTS Cliente;
CREATE TABLE Cliente(
cf CHAR(16) NOT NULL,
nome VARCHAR(20) NOT NULL,
cognome VARCHAR(20) NOT NULL,
dataNascita DATE NOT NULL,
indirizzo varchar(40) not null,
email varchar(70) not null,
passw varchar(40) not null,
cartadiCredito varchar(30) not null,
scadenzaCarta date not null,
numTotaleAcquisti int not null default 0,
PRIMARY KEY(cf)
);

DROP TABLE IF EXISTS Pagamento;
CREATE TABLE Pagamento(
id INT NOT NULL auto_increment,
dataPagamento DATE not null,
tipo varchar(20) not null,
importo double(7,2) not null,
PRIMARY KEY(id)
);

DROP TABLE IF EXISTS Telefono;
CREATE TABLE Telefono(
numTelefono char(10) not null,
idCliente CHAR(16) NOT NULL,
PRIMARY KEY(numTelefono,idCliente),
FOREIGN KEY(idCliente) REFERENCES Cliente(cf) ON UPDATE cascade ON DELETE cascade
);

DROP TABLE IF EXISTS Spedizione;
CREATE TABLE Spedizione(
codice int not null auto_increment,
dataPartenza date not null,
dataArrivo date,
costo double(5,2) not null,
primary key(codice)
);

DROP TABLE IF EXISTS Ordine;
CREATE TABLE Ordine(
id int auto_increment,
idCliente char(16) not null,
idPagamento int not null,
dataOrdine date not null,
idSpedizione int not null,
primary key(id,idCliente),
FOREIGN KEY(idCliente) REFERENCES Cliente(cf) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idSpedizione) REFERENCES Spedizione(codice) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idPagamento) REFERENCES Pagamento(id) ON UPDATE cascade ON DELETE cascade
);

DROP TABLE IF EXISTS Prodotto;
CREATE TABLE Prodotto(
codice int not null auto_increment,
prezzo double(7,2) not null,
quantitaDisponibile int not null default 0,
marca varchar(20) not null,
colore varchar(20) not null,
primary key(codice)
);

DROP TABLE IF EXISTS Recensione;
CREATE TABLE Recensione(
numero int not null auto_increment,
idProdotto int not null,
idCliente char(16) not null,
descrizione text(1000) not null,
voto enum('1','2','3','4','5','6','7','8','9','10') not null,
primary key(numero,idProdotto),
FOREIGN KEY(idProdotto) REFERENCES Prodotto(codice) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idCliente) REFERENCES Cliente(cf) ON UPDATE cascade ON DELETE cascade
);

DROP TABLE IF EXISTS Batteria;
CREATE TABLE Batteria(
numeroRullanti int unsigned not null,
idProdotto int not null,
primary key(numeroRullanti,idProdotto),
FOREIGN KEY(idProdotto) REFERENCES Prodotto(codice) ON UPDATE cascade ON DELETE cascade
);

DROP TABLE IF EXISTS ChitarraElettrica;
CREATE TABLE ChitarraElettrica(
tipoPickup varchar(30) not null,
numeroCorde int unsigned not null,
idProdotto int not null,
primary key(tipoPickup,numeroCorde,idProdotto),
FOREIGN KEY(idProdotto) REFERENCES Prodotto(codice) ON UPDATE cascade ON DELETE cascade
);

DROP TABLE IF EXISTS Tastiera;
CREATE TABLE Tastiera(
numeroStili int unsigned not null,
idProdotto int not null,
primary key(numeroStili,idProdotto),
FOREIGN KEY(idProdotto) REFERENCES Prodotto(codice) ON UPDATE cascade ON DELETE cascade
);

DROP TABLE IF EXISTS Di;
CREATE TABLE Di(
idProdotto int not null,
idOrdine int not null,
idCliente char(16) not null,
primary key(idProdotto,idOrdine,idCliente),
FOREIGN KEY(idProdotto) REFERENCES Prodotto(codice) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idOrdine) REFERENCES Ordine(id) ON UPDATE cascade ON DELETE cascade,
FOREIGN KEY(idCliente) REFERENCES Ordine(idCliente) ON UPDATE cascade ON DELETE cascade
);

