/* ===================== CONSTRAINTS - KISITLAMALAR  =====================================
           
    NOT NULL    - Bir Sütunun  NULL içermemesini yani boş olmamasını sağlar.
    UNIQUE		- Bir sütundaki tüm değerlerin BENZERSİZ yani tek olmasını sağlar.  
    PRIMARY KEY	- Bir sütünün NULL içermemesini ve sütundaki verilerin  BENZERSİZ olmasını sağlar. (NOT NULL ve UNIQUE)
    FOREIGN KEY	- Başka bir tablodaki Primary Key’i referans göstermek için kullanılır.
                  Böylelikle, tablolar arasında ilişki kurulmuş olur. 
                  foreign ve primary ile tablolar birbirine bağlamadan da, id leri ayni olan
                  satirlarda işlem yap diyebiliriz, böylelikle ayni field verilebilir, parent child ilişkisi olmamiş olur

========================================================================================*/
 use javacan;
 
 CREATE TABLE calisanlar -- parent table -> PK
(
id CHAR(5) PRIMARY KEY, 
isim VARCHAR(50) UNIQUE,
maas int NOT NULL,
ise_baslama DATE

);

--                             id PK      isim  U      maas NN  ise_baslama
INSERT INTO calisanlar VALUES('1002', 'Haluk Bilgin' ,12000, '2018-04-14');
INSERT INTO calisanlar VALUES('1008', null, 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('1010', null, 5000, '2018-04-14'); -- null unigue kisitlamasini kabul etmez
INSERT INTO calisanlar VALUES('1004', 'Ipek Bilir', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('1005', 'Harun Bil', 5000, '2018-04-14');
-- INSERT INTO calisanlar VALUES('1006', 'Halime Bilse', NULL, '2019-04-12'); -- maas null olamaz
INSERT INTO calisanlar VALUES('1003', 'Merve Bilmiş', 5000, '2018-04-14');
-- INSERT INTO calisanlar VALUES('1007', 'Merve Bilmiş', 5000, '2018-04-14');-- Merve Bilmiş U dublicate giriş olamaz
-- INSERT INTO calisanlar VALUES('1009', 'cem', '', '2018-04-14'); 
INSERT INTO calisanlar VALUES('', 'osman', 2000, '2018-04-14');
-- INSERT INTO calisanlar VALUES('', 'osman can', 2000, '2018-04-14');-- pk '' dublicate giriş olamaz
-- INSERT INTO calisanlar VALUES( '1002', 'ayse Yılmaz' ,12000, '2018-04-14'); -- pk id 1002 dublicate giriş olamaz
-- INSERT INTO calisanlar VALUES( null, 'filiz ' ,12000, '2018-04-14'); -- pk null olamaz
     
select * from calisanlar;
     
     
-- KISITLAMALAR (  FOREIGN KEY)
     
CREATE TABLE adresler  -- child table ->FK
(
adres_id CHAR(5) ,    
sokak VARCHAR(50),
cadde VARCHAR(30),
sehir VARCHAR(15),
--           name.       FK.  Child column.         ParentTable column
CONSTRAINT id_clsnlr FOREIGN KEY(adres_id) REFERENCES calisanlar (id)-- parent table ile chil table PY ve FK ile ilişkilendirildi

);
--                          adres_id  sokak     cadde    sehir
INSERT INTO adresler VALUES('1003','Ebik Sok', '34.Cad.','IST');
INSERT INTO adresler VALUES('1003', 'Gabik Sok', '6.Cad.','Ankara');
INSERT INTO adresler VALUES('1002','Ağa Sok', '35.Cad.','Izmir');


INSERT INTO adresler VALUES('1008','Falan ', '23.Cad.','Elaziz');-- 
INSERT INTO adresler VALUES('1011','Filan ', '21.Cad.','D.Bakir');-- record sadece adresler table girer ama calisanlar table'da 1011 olmadiği için record girmez
INSERT INTO adresler VALUES(null,'Ağa Sok', '35.Cad.','Izmir');--  FK null tanabilir


select * from adresler;
select * from calisanlar;
  
  select * From calisanlar,adresler Where  calisanlar.id=adresler.adres_id; 
  
  
 
  drop table calisanlar;-- parent table delete child table delete edilmeden silinmezzzz..
   drop table adresler; -- child table delete 
   select * from adresler;-- child table yok üst sattrda silindi
    drop table calisanlar;-- parent table delete child table silindikten sonra silinir
    select * from calisanlar;-- parent table ust satrda silindi..
  
  
  
  
  
  
  