SET SQL_SAFE_UPDATES = 0;
use store;

DELETE FROM Cliente;
INSERT INTO Cliente VALUES
("BNCPLA98H05A717B","Paolo","Bianchi",'1998-06-05'),
("BNCPLA72H19A717A","Paolo","Bianchi",'1972-06-19'),
("MRTVLL88B45A717I","Martina","Volli",'1988-02-05'),
("JMSGNN95P05A717F","James","Gunn",'1995-09-05'),
("LNEMTN99C49A717E","Elena","Martini",'1999-03-09');

DELETE FROM Pagamento;
INSERT INTO Pagamento VALUES
(1,10.00,"MRTVLL88B45A717I",'2021-08-09'),
(2,5.00,"LNEMTN99C49A717E",'2021-06-05'),
(3,5.00,"MRTVLL88B45A717I",'2021-09-19'),
(4,15.00,"LNEMTN99C49A717E",'2021-05-05'),
(5,5.00,"BNCPLA98H05A717B",'2022-01-08'),
(6,5.00,"MRTVLL88B45A717I",'2022-01-09'),
(7,10.00,"BNCPLA72H19A717A",'2022-02-09'),
(8,5.00,"JMSGNN95P05A717F",'2022-02-12');

DELETE FROM Chitarra;
INSERT INTO Chitarra VALUES
(1,"Fender",5000.00,7,"rosso","Stratocaster","Humbucker",NULL),
(2,"Vintage",500.00,15,"rosso","Gibson",NULL,5),
(3,"Fender",7000.00,3,"rosso","Stratocaster","Single Coil",NULL),
(4,"Ibanez",150.00,150,"rosso","Stratocaster","Humbucker",NULL),
(5,"Ibanez",199.99,95,"rosso","Gibson",NULL,3),
(6,"Martin",3000.00,5,"rosso","Stratocaster","P90",NULL),
(7,"Fender",1500.00,5,"rosso","Stratocaster","Single Coil",NULL),
(8,"Ibanez",350.00,15,"rosso","Gibson",NULL,7),
(9,"Martin",2500.00,2,"rosso","Stratocaster","P90",NULL),
(10,"Fender",1800.00,1,"rosso","Stratocaster","Single Coil",NULL);

DELETE FROM Fornitore;
INSERT INTO Fornitore VALUES
(9,"VExpress",3),
(10,"Guithunter",15),
(12,"Sans",0),
(15,"StateofPick",1),
(22,"ACDConsegne",20),
(25,"Autumn",7),
(26,"Guita",10),
(27,"PickPack",5);

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

DELETE FROM RelativoA;
INSERT INTO RelativoA VALUES
(3,3,1),
(1,2,2),
(2,6,1),
(4,7,2),
(5,8,3),
(6,10,1),
(7,1,2),
(8,7,3);

DELETE FROM Ha;
INSERT INTO Ha VALUES
(9,1),
(9,2),
(10,3),
(10,1),
(12,4),
(12,5),
(15,2),
(15,6),
(15,7),
(22,8),
(22,5),
(25,9),
(26,10),
(26,4),
(27,4),
(27,10);