/*============================= SUBQUERIES ====================================
 SORGU içinde çalişan SORGUYA SUBQUERY (ALT SORGU) denilir.
================================================================================*/

use javacan;

CREATE TABLE calisanlar 
(
id int, 
isim VARCHAR(50), 
sehir VARCHAR(50), 
maas int, 
isyeri VARCHAR(20)
);
INSERT INTO calisanlar VALUES(123456789, 'Haluk Bilgin', 'Istanbul', 50000, 'IBM');
INSERT INTO calisanlar VALUES(234567890, 'Ipek Bilir', 'Istanbul', 25000, 'Google');
INSERT INTO calisanlar VALUES(345678901, 'Harun Bilmiş', 'Ankara', 13000, 'IBM');
INSERT INTO calisanlar VALUES(456789012, 'Harun Bilmiş', 'Izmir', 10000, 'Microsoft');
INSERT INTO calisanlar VALUES(567890123, 'Harun Bilmiş', 'Ankara', 17000, 'Amazon');
INSERT INTO calisanlar VALUES(456789012, 'Ipek Bilir', 'Ankara', 15000, 'Microsoft');
INSERT INTO calisanlar VALUES(123456710, 'Halime Bak', 'Bursa', 25000, 'IBM');
    
CREATE TABLE markalar
(
marka_id int, 
marka_isim VARCHAR(20), 
calisan_sayisi int
);
INSERT INTO markalar VALUES(100, 'IBM', 12000);
INSERT INTO markalar VALUES(101, 'Microsoft', 18000);
INSERT INTO markalar VALUES(102, 'Amazon', 10000);
INSERT INTO markalar VALUES(103, 'Google', 21000);
    
select * from calisanlar;
select * from markalar;
    

-- task01-> calisan sayisi 15.000’den cok olan markalarin isimlerini ve bu markada calisanlarin 
-- isimlerini ve maaşlarini listeleyen query create ediniz...

select isim, maas,isyeri from calisanlar where isyeri in-- ana sorgu -> calisanlar table
(select marka_isim from markalar where calisan_sayisi>15000);-- sub sorgu -> sarti veren markalar table

-- subquery ile yaplan sorgu 2 ayr tablonun sorgusunun birleşmiş halidir
-- (select marka_isim from markalar where calisan_sayisi>15000);-- Ana sorgu
-- select isim, maas,isyeri from calisanlar where isyeri in('Google','Microsoft);-- sub sorgu

-- task02-> marka_id’si 101’den büyük olan marka çalişanlarinin isim, maaş ve şehirlerini listeleyen query create ediniz...
select isim, maas,sehir from calisanlar  where isyeri in -- ana sorgu -> calisanlar table
(select marka_isim from markalar where marka_id>101);-- sub sorgu -> sarti veren markalar table

-- select isim, maas,sehir from calisanlar  where isyeri in('amazon','google');-- ana sorgu
-- (select marka_isim from markalar where marka_id>101)-- sub sorgu

-- task03-> Ankara’da calisani olan markalarin marka id'lerini ve calisan sayilarini listeleyen query create ediniz...
select marka_id,calisan_sayisi from markalar Where marka_isim in -- ana sorgu
(select isyeri from calisanlar where sehir='Ankara');-- sub sorgu-> Amazon, IBM, Microsoft
  
/* ===================== AGGREGATE METOT KULLANIMI ===========================
    Aggregate Metotlari (SUM,COUNT, MIN, MAX, AVG) Subquery içinde kullanilabilir.
    Ancak, Sorgu tek bir değer döndürüyor olmalidir.
    SYNTAX: sum() şeklinde olmalı sum ile () arasında boşluk olmammalı
==============================================================================*/   
      
-- task04-> Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin toplam maaşini listeleyen query create ediniz...
select marka_isim, calisan_sayisi ,(select sum(maas) from calisanlar where isyeri=marka_isim) as maas_toplam from markalar;
-- as maas_toplam-> sub sorguda olusan column için alias(as) isim atamasi yapildi...



-- task05-> Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin ortalama maaşini listeleyen query create ediniz...

-- select marka_isim,calisan_sayisi,(select avg(maas) from calisanlar where isyeri=marka_isim) as ort_maas from markalar;
select marka_isim,calisan_sayisi,(select round(avg(maas)) from calisanlar where isyeri=marka_isim) as ort_maas from markalar;
-- round() -> sorgu ciktisini yuvarlayarak tam sayi return eder.



-- task06-> Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin maksimum ve minumum maaşini listeleyen query create ediniz...
select marka_isim,calisan_sayisi, (select min(maas) from calisanlar where isyeri=marka_isim) as min_maas  from markalar;
select marka_isim,calisan_sayisi, (select max(maas) from calisanlar where isyeri=marka_isim) as max_maas from markalar;
select marka_isim,calisan_sayisi, (select min(maas) from calisanlar where isyeri=marka_isim) as min_maas ,(select max(maas) from calisanlar where isyeri=marka_isim) as max_maas from markalar;

 
-- task07-> Her markanin id’sini, ismini ve toplam kaç şehirde bulunduğunu listeleyen query create ediniz...
select marka_id,marka_isim, (select count(sehir) from calisanlar where isyeri=marka_isim) as sehir_sayisi from markalar;

