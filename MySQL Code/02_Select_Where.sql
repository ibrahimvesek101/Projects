/***************************
      SELECT - WHERE -> filtreleme
****************************/
/*
verileri select komutu ile  db'den çekerken filtrelem yapmak için WHERE komutu SELECT ile kullanilir.
syntax -> SELECT column1,column2.... FROM tablo_Name WHERE koşul;
*/
use javaCAN;
 create table öğrenciler(
 id int,
 isim varchar(45),
 adres varchar(50),
 snav_Not int
 );
 
 insert into öğrenciler values(101,'Celine','Ankara',99);
 insert into öğrenciler values(102,'Murat','BUrsa',88);
 insert into öğrenciler values(103,'NUr','Istanbul',77);
 insert into öğrenciler values(104,'Abdi','KÖtaya',43);
 insert into öğrenciler values(105,'Mustafa','Gayseri',38);
 insert into öğrenciler values(107,'Haluk','Denizli',10);
 insert into öğrenciler values(107,'Aydin','MARAŞ',61);
  select * from öğrenciler;

-- Task01-> sinav notu 80'den büyük öğrencileri listeleyen query create ediniz...
select * from öğrenciler WHERE snav_Not>=80;
-- Task02-> sinav notu 80'den büyük öğrencilerin id'lerini listeleyen query create ediniz...
select id,snav_not from öğrenciler WHERE snav_Not>=80;
-- Task03-> adresi Ankara olan öğrencilerin isim ve adreslerini listeleyen query create ediniz...
select isim, adres from öğrenciler where adres='ANKARA' ;
select isim, adres from öğrenciler where adres = 'ankara';
select * from öğrenciler where adres = 'Ankara';-- incase sensitive 

-- Task04 -> id'si 104 olan öğrencilerin tüm bilgilerini listeleyen query create ediniz.
select * from öğrenciler where id=104;

/*********************************
              SELECT - BETWEEN
**********************************/ 
create table personel 
(
id char(4),
isim varchar(50),
maas int
);


insert into personel values('1001', 'Haluk Bilgin', 70000);
insert into personel values('1002', 'Mert Can', 85000);
insert into personel values('1003', 'Ipek Bilir', 65000);
insert into personel values('1004', 'Java Tar', 95000);
insert into personel values('1005', 'Javva Nur', 80000);
insert into personel values('1006', 'Java Naz', 100000);
insert into personel values('1006', 'Java Su', 333000);
insert into personel values('1006', 'Java Can', 222000);

select * from personel;

-- BETWEEN 2 mantıksal ifade ile  belirtilen   veriler arasındaki dataları  listeler
-- ahan da TRICK -> BETWEEN de; belirttigini sınır degerleri de, listelemeye dahildir.


/*********************************
              AND - OR
**********************************/ 
/*
AND (ve): Belirtilen şartların her ikiside gerçekleşiyorsa o kayıt listelenir.
En az bir tanesi gerçekleşmez ise listelemez.kaynana gibi kötümser

SELECT * FROM matematik sinav1 > 50 AND sinav2 > 50
Hem sinav1 hemde sinav2 alanı, 50'de büyük olan kayıtları listeler.

OR (veya): Belirtilen şartlardan en az biri gerçekleşirse, kayıt listelenir. ANA gibi iyimser

SELECT * FROM matematik sinav1 > 50 OR sinav2 > 50
Hem sinav1 veya sinav2 alanı, 50'de büyük olan kayıtları listeler.
*/

-- Task04 -> id'si 1002 ile 1005 arasında olan personel bilgilerini listeleyen query create ediniz.
-- 1. yol
select * from personel where id between '1002' and '1005';
-- 2. yol
select * from personel where id >= '1002' and id<='1005';

-- Task05 -> Mert CAN ile Ipek Bilir  arasındaki personel bilgilerini listeleyen query create ediniz.

select * from personel where isim between 'haluk bilgin' and 'java naz';

-- Task06 ->  Maaşı 70000 veya ismi Java Naz  olan personeli listeleyen query create ediniz.
select * from personel where maas=7000 or isim='java Naz';
select * from personel where maas=70000 or isim='java Naz';

/*********************************
                       IN
**********************************/ 
/*
IN: Birden fazla mantıksal ifade ile tanımlabilen durumları tek komutla
sorgu yazabilme imkanı verir.
 
Syntax->  SELECT sutun1, sutun2 ....
 FROM tablo_adı
 WHERE sutun_adı IN (deger1, deger2)
*/

-- Task07 -> id'si 1001,1002 ve 1004 olan personel bilgilerini listeleyen query create ediniz.
-- 1. yol cincix code 
select * from personel where id in(1001,1002,1004);
-- 2. yol amele code
select * from personel where id =1001 or id=1002 or id=1004;

-- Task08 -> Maaşı sadece 70000 ve 100000 olan personeli listeleyen query create ediniz.
select * from personel where maas in(70000,100000,333);

-- Task08.5 -> Maaşı sadece 70000 ve ismi javva Nur olan personeli listeleyen query create ediniz. ->  in ?

select * from personel where maas in('javva Nur',70000);-- 70000
select * from personel where maas=70000 or isim='javva Nur'; -- 70000 javva nur

-- Ahan da Trick-> 'in' için sabit bir column ama 'or' için birden farkl colum sorgulanabilir

/*********************************
              SELECT - LIKE
**********************************/ 

/*
SELECT - LIKE
LIKE: Sorgulama yaparken belirli patternleri kullanabilmesini  sağlar

Syntax –> SELECT sutun1, sutun2, ...FROM tablo_adı WHERE sutünN LIKE pattern

PATTERN İÇİN
% -> 0 veya daha fazla karakteri belirtir.
_ -> Tek bir karakteri belirtir.  - : karakter sayısı kadar kullanılır.
*/

-- Task09 -> İsmi J harfi ile başlayan personeli listeleyen query create ediniz.
select * from personel where isim like 'j%';-- isim sutunda ilk character j olup sonrasinin sarti olmayan record sorgusu
-- Task09.5 -> İsmi J harfi ile başlayan 8 harfli personeli listeleyen query create ediniz.
select * from personel where isim like 'j_______';-- isim sutunda ilk character j olup sonrasnda 7 karakter  olan record sorgusu


-- Task10 -> İsmi N harfi ile biten personeli listeleyen query create ediniz.
select * from personel where isim like '%n';-- isim sutunda son character n olup öncesinin şarti olmayan   record sorgusu 


-- Task11 -> İsminin 2. harfi E olan personeli listeleyen query create ediniz.
select * from personel where isim like '_e%';-- isim sutunda 2.character e olup sonrasinin şarti olmayan   record sorgusu 


-- Task12 -> İsminin 2. harfi E olup diğer harflerinde A olan personel listeleyen query create ediniz.

select * from personel where isim like '_e%a%';
-- Task13 -> İsminde A harfi olmayan personeli listeleyen query create ediniz.

select * from personel where isim not like '%a%';

-- Task14 -> Maaşı 6 haneli olan personeli listeleyen query create ediniz.

select * from personel where maas like '______';

-- Task15-> ismi 1. harfi j ve 7. harfi A olan personeli listeleyen query create ediniz.
select * from personel where isim  like 'j_____a%';



