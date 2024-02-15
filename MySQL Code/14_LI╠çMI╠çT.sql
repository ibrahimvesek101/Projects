   
-- *****************************LİMİT**********************************
    CREATE TABLE kisiler 
    (   id int PRIMARY KEY,
        ssn CHAR(9) ,
        isim VARCHAR(50), 
        soyisim VARCHAR(50), 
        maas int,
        adres VARCHAR(50) 
    );
    
    INSERT INTO kisiler VALUES(1,123456789, 'Haluk','Bilgin', 50000,'Istanbul');
    INSERT INTO kisiler VALUES(2,234567890, 'Haluk','Bilir', 40000,'Ankara');
    INSERT INTO kisiler VALUES(3,345678901, 'Haluk','Bil',33000,'Izmir');
    INSERT INTO kisiler VALUES(4,256789012, 'Hasan','Hasmayan',21000,'Adana');
    INSERT INTO kisiler VALUES(5,344678901, 'Halime','Baak', 15000,'Ankara');
    INSERT INTO kisiler VALUES(6,345458901, 'Hanimiş ','Bee',7000,'Istanbul');
    INSERT INTO kisiler VALUES(7,123456711, 'Çin','Li', 23000,'Fizan');
    INSERT INTO kisiler VALUES(8,234567812, 'Kim','TutarSeni',42000,'Gonya');
    INSERT INTO kisiler VALUES(9,345678913, 'Gemi','TutarBeni',38000,'Gayseri');
    INSERT INTO kisiler VALUES(10,256789231, 'Tatar','Irmizan',20000,'Denizli');
    INSERT INTO kisiler VALUES(11,344678134, 'Durmuş','Mu', 17000,'Muş');
    INSERT INTO kisiler VALUES(12,345458752, 'Sultan ','Sülüman',18000,'Cangiri');
    INSERT INTO kisiler VALUES(13,345458752, 'Sultan ','Sülüman',18000,'Cangiri');
    INSERT INTO kisiler VALUES(14,345458752, 'Sultan ','Sülüman',18000,'Cangiri');
    select * from kisiler;

/* ----------------------------------------------------------------------------
  task01-> kisiler’den  ilk 10 veriyi listeleyen query create ediniz…
-----------------------------------------------------------------------------*/
select * from kisiler limit 10;


/* ----------------------------------------------------------------------------
  task02-> kisiler’den 5. veriden sonraki 4 (6,7,8,9)    listeleyen query create ediniz…
-----------------------------------------------------------------------------*/
select * from kisiler limit 5,4; -- 5 den sonraki(5 haric) var olan  4 (6,7,8,9) record return eder.
select * from kisiler limit 10,12; -- cincix code. :)  10 den sonraki(10 haric) var olan 12 (11,12,13) record return eder.
select * from kisiler limit 7,12; -- 7 den sonraki(7 haric) 12 (8...) record return eder.

select * from kisiler -- amele code 
where id>10
limit 2; -- id = 11,12 return 


  /* ----------------------------------------------------------------------------
  task03-> MAAŞ'ı en yüksek 3 kişinin bilgilerini listeleyen query create ediniz…
-----------------------------------------------------------------------------*/
select * from kisiler 
order by maas desc
limit 3;

 /* ----------------------------------------------------------------------------
  task04-> MAAŞ'ı en düşük  5 kişinin bilgilerini listeleyen query create ediniz…
-----------------------------------------------------------------------------*/
select * from kisiler 
order by maas 
limit 5;

/* ----------------------------------------------------------------------------
  task05-> MAAŞ'a göre sıralamada 4. 5.  6. kişilerin bilgilerini listeleyen query create ediniz…
-----------------------------------------------------------------------------*/  
select * from kisiler 
order by maas 
limit 3,3;

 

  
