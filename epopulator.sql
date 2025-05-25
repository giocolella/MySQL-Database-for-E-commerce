SET SQL_SAFE_UPDATES = 0;
use estore;

DELETE FROM Cliente;
INSERT INTO Cliente VALUES
("BNCPLA98H05A717B", "Paolo", "Bianchi", '1998-02-05',"Via Vivaldi no.5 Batttipaglia SA","pbianchi@gmail.com","pbianchi98","Visa",'2022-07-09',1),
("BNCPLA72H19A717A", "Paolo", "Bosi", '1995-06-09',"Via Saturno no.7 Batttipaglia SA","pbosi@gmail.com","pbosi95","Visa",'2022-08-10',2),
("MRTVLL88B45A717I", "Martina", "Volli", '1988-02-05',"Via Garibali no.9 Batttipaglia SA","mvolli@gmail.com","mvolli88","Postepay",'2022-06-08',3),
("JMSGNN95P05A717F","James","Gunn",'1995-09-05',"Via Guardiani no.3 Batttipaglia SA","jgunn@gmail.com","jgunn95","Hype",'2023-05-07',2),
("LNEMTN99C49A717E","Elena","Martini",'1999-03-09',"Via Costanzo no.1 Batttipaglia SA","emartini@gmail.com","emartini99","Visa",'2023-03-10',0);

DELETE FROM Pagamento;
INSERT INTO Pagamento VALUES
(1,'2021-04-15',"Bonifico",10000.00),
(2,'2021-03-10',"Bonifico",10000.00),
(3,'2019-06-20',"Bonifico",300.00),
(4,'2019-06-20',"Bonifico",700.00),
(5,'2019-06-20',"Bonifico",1000.00),
(6,'2022-02-21',"Bonifico",6000.00),
(7,'2022-02-21',"Bonifico",3500.00),
(8,'2021-05-09',"Bonifico",250.00);


DELETE FROM Telefono;
INSERT INTO Telefono VALUES
("3383415121","BNCPLA98H05A717B"),
("3285612975","BNCPLA98H05A717B"),
("3486751290","BNCPLA72H19A717A"),
("3385649102","MRTVLL88B45A717I"),
("3450988129","MRTVLL88B45A717I"),
("3386574390","MRTVLL88B45A717I"),
("3487690123","JMSGNN95P05A717F"),
("3485423907","JMSGNN95P05A717F"),
("3456398129","LNEMTN99C49A717E"),
("3457890123","LNEMTN99C49A717E");

DELETE FROM Spedizione;
INSERT INTO Spedizione VALUES
(1,'2021-04-15','2021-04-18',10.00),
(2,'2021-03-10','2021-03-12',30.00),
(3,'2019-06-20','2019-06-25',10.00),
(4,'2019-06-20','2019-06-25',20.00),
(5,'2019-06-20','2019-06-25',10.00),
(6,'2022-02-21','2022-02-23',50.00),
(7,'2022-02-21','2022-02-23',5.00),
(8,'2021-05-09','2021-05-15',30.00);

DELETE FROM Ordine;
INSERT INTO Ordine VALUES
(1,"BNCPLA98H05A717B",1,'2021-04-15',1),
(2,"BNCPLA72H19A717A",2,'2021-03-10',2),
(3,"BNCPLA72H19A717A",3,'2019-06-20',3),
(4,"MRTVLL88B45A717I",4,'2019-06-20',4),
(5,"MRTVLL88B45A717I",5,'2019-06-20',5),
(6,"MRTVLL88B45A717I",6,'2022-02-21',6),
(7,"JMSGNN95P05A717F",7,'2022-02-21',7),
(8,"JMSGNN95P05A717F",8,'2021-05-09',8);

DELETE FROM Prodotto;
INSERT INTO Prodotto VALUES
(1,10000.00,5,"Fender","bianco"),
(2,7890.00,2,"Fender","rosso"),
(3,300.00,80,"Ibanez","bianco"),
(4,700.00,80,"Startone","blu"),
(5,1000.00,10,"Vintage","giallo ocra"),
(6,6000.00,2,"Gibson","rosso"),
(7,3500.00,10,"Yamaha","blu"),
(8,150.00,50,"Ibanez","marrone"),
(9,100.00,20,"Squier","rosso"),
(10,250.00,20,"Startone","bianco"),
(11,100.00,150,"Yamaha","blu"),
(12,300.00,20,"Yamaha","blu");

DELETE FROM Recensione;
INSERT INTO Recensione VALUES
(1,1,"BNCPLA98H05A717B","Chitarra sorprendente e professionale",'10'),
(1,4,"MRTVLL88B45A717I","Batteria discreta, arrivata leggermente graffiata in un rullante",6),
(1,7,"JMSGNN95P05A717F","Tastiera sorprendente e professionale anche se mancano molti stili",8),
(1,10,"JMSGNN95P05A717F","Batteria di bassa qualità ma utile nel suo scopo, i materiali fanno presagire una bassa durata",5),
(1,12,"BNCPLA72H19A717A","Ottima tastiera per il prezzo",7);

DELETE FROM Batteria;
INSERT INTO Batteria VALUES
(3,4),
(5,10);

DELETE FROM ChitarraElettrica;
INSERT INTO ChitarraElettrica VALUES
("Single Coil","6",1),
("Humbucker","12",2),
("Single Coil",6,3),
("P90",8,5),
("Single Coil",6,6),
("Humbucker",8,8),
("Single Coil",6,9);

DELETE FROM Tastiera;
INSERT INTO Tastiera VALUES
(20,7),
(30,11),
(80,12);

DELETE FROM Di;
INSERT INTO Di VALUES
(1,1,"BNCPLA98H05A717B"),
(1,2,"BNCPLA72H19A717A"),
(12,3,"BNCPLA72H19A717A"),
(4,4,"MRTVLL88B45A717I"),
(5,5,"MRTVLL88B45A717I"),
(6,6,"MRTVLL88B45A717I"),
(7,7,"JMSGNN95P05A717F"),
(10,8,"JMSGNN95P05A717F");