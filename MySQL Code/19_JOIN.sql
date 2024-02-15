use javacan;
/*============================== JOIN İSLEMLERİ ===============================
    
    Set Operatorleri (Union,Union All, {oracle->Intersect,Minus}) farklı tablolardaki sutunlari 
    birlestirmek için kullanilir.
    
    Join islemleri ise farklı Tablolari birlestirmek icin kullanilir. Diger 
    bir ifade ile farkli tablolardaki secilen sutunlar ile yeni bir tablo 
    olusturmak icin kullanilabilir.
    
    JOIN islemleri Iliskisel Veritabanlari icin cok onemli bir ozelliktir. Çunku
    Foreign Key'ler ile iliskili olan tablolardan istenilen sutunlari cekmek 
    icin JOIN islemleri kullanilabilir.
    
    mySQL'de 3 Cesit Join islemi kullanilabilmektedir.
    
    1) INNER JOIN:  Tablolardaki ortak olan sonuc kumesini gosterir
    2) LEFT JOIN:  Ilk tabloda (Sol) olan sonuclari gosterir
    3) RIGHT JOIN:  Ikinci tabloda (sağ) olan tum sonuclari gosterir
       full JOIN=(left join + union  + right join) Tablodaki tum sonuclari gosterir
==============================================================================*/   
    CREATE TABLE sirket 
    (
        sirket_id int, 
        sirket_isim VARCHAR(20)
    );
    
    INSERT INTO sirket VALUES(100, 'Toyota');
    INSERT INTO sirket VALUES(101, 'Honda');
    INSERT INTO sirket VALUES(102, 'Ford');
    INSERT INTO sirket VALUES(103, 'Hyundai');
  select * from sirket;
    CREATE TABLE siparis
    (
        siparis_id int,
        sirket_id int, 
        siparis_tarihi DATE
    );
    
    INSERT INTO siparis VALUES(11, 101, '2020-04-17');
    INSERT INTO siparis VALUES(22, 102, '2020-04-18');
    INSERT INTO siparis VALUES(33, 103, '2020-04-19');
    INSERT INTO siparis VALUES(44, 104, '2020-04-20');
    INSERT INTO siparis VALUES(55, 105, '2020-04-21');
    select * from siparis;
    /*=============================== INNER JOIN  ==================================
    
    Iki tablonun kesisim kumesi ile yeni bir tablo olusturmak icin kullanilir.
    
    Syntax
    -----------
    SELECT sutun1,sutun2....sutunN
    FROM tablo1 
    INNER JOIN tablo2
    ON tablo1.sutun = tablo2.sutun;
================================================================================  
    
  
/* -----------------------------------------------------------------------------
  task01-> Iki Tabloda sirket_id’si ayni olanlarin sirket_ismi, siparis_id ve 
  siparis_tarihleri listeleyen query create ediniz...
------------------------------------------------------------------------------*/
select siparis.sirket_id, sirket_isim,siparis_id,siparis_tarihi
-- from sirket
from siparis
-- inner join siparis
inner join sirket
on siparis.sirket_id=sirket.sirket_id;



    -- INNER JOIN ile sadece iki tablodaki ortak olan satirlar secilir.
    -- Diger bir ifadeyle iki tablodaki ortak olan sirket_id degerleri icin 
    -- ilgili sutunlar listenir.  
    -- INNER anahtar kelimesi opsiyoneldir.
    
        
/*=============================== LEFT JOIN  ==================================
    
    LEFT JOIN, 1. tablodan (sol tablo) SELECT ile ifade edilen sutunlara ait tum
    satirlari getirir. 
    Ancak, diger tablodan sadece ON ile belirtilen kosula uyan satirlari getirir. 
        
    Syntax
    -----------
    SELECT sutun1,sutun2....sutunN
    FROM tablo1 
    LEFT JOIN tablo2
    ON tablo1.sutun = tablo2.sutun;
==============================================================================*/  
            
/* -----------------------------------------------------------------------------
  task02-> sirket tablosundaki tum sirketi ve bu sirkete ait olan 
  siparis_id ve siparis_tarihleri listeleyen query create ediniz...
------------------------------------------------------------------------------*/   

select sirket.sirket_id,sirket_isim,siparis_id,siparis_tarihi
from sirket
left join siparis
on siparis.sirket_id=sirket.sirket_id;


select sirket.sirket_id,sirket_isim,siparis_id,siparis_tarihi
from siparis
right join sirket
on siparis.sirket_id=sirket.sirket_id;

    -- Left Join’de ilk tablodaki (fromdan sonra gelen)tum satirlar gosterilir.
    -- Ilk tablodaki satirlara 2.tablodan kosula uyan ortak satirlar 
	-- gosterilir, ancak ortak olmayan kisimlar bos kalir
          
/*=============================== RIGHT JOIN  ==================================
    
    RIGHT JOIN, 2. tablodan (sag tablo) SELECT ile ifade edilen sutunlara ait tum
    satirlari getirir. 
    Ancak, diger tablodan sadece ON ile belirtilen kosula uyan satirlari getirir. 
        
    Syntax
    -----------
    SELECT sutun1,sutun2....sutunN
    FROM tablo1 
    RIGHT JOIN tablo2
    ON tablo1.sutun = tablo2.sutun;
==============================================================================*/   
      
/* -----------------------------------------------------------------------------
  task03-> siparis tablosundaki tum siparis_id ve siparis_tarihleri ile 
  bunlara karşılık gelen sirket_isimlerini listeleyen query create ediniz...
------------------------------------------------------------------------------*/   
 select siparis_id,siparis.sirket_id,siparis_tarihi,sirket_isim
 from sirket
 right join siparis
 on siparis.sirket_id=sirket.sirket_id;
 
  select siparis_id,siparis.sirket_id,siparis_tarihi,sirket_isim
 from siparis
 left join sirket
 on siparis.sirket_id=sirket.sirket_id;
 

    -- Right Join’de 2. tablodaki tum satirlar gosterilir.
    -- 2 tablodaki satirlara 1.tablodan kosula uyan ortak satirlar gosterilir
    -- ancak ortak olmayan kisimlar bos kalirir.
    
    
    /*=============================== full JOIN  ==================================
    full JOIN: (left join + union  + right join)
   full  JOIN, Her iki tablo icin secilen sutunlara ait olan tum satirlari 
    getirmek icin kullanilir. 
    
    Syntax
    -----------
    SELECT sutun1,sutun2....sutunN
    FROM tablo1 
    left JOIN tablo2
    ON tablo1.sutun = tablo2.sutun
    union 
    SELECT sutun1,sutun2....sutunN
    FROM tablo1 
    right JOIN tablo2
    ON tablo1.sutun = tablo2.sutun
==============================================================================*/   
   
/* -----------------------------------------------------------------------------
  task04-> sirket ve siparis adındaki tablolarda yer alan sirket_isim, 
  siparis_id ve siparis_tarihleri listeleyen query create ediniz...
------------------------------------------------------------------------------*/ 
 select sirket_isim, sirket.sirket_id,
  siparis_id,siparis_tarihi
 
 from sirket
 left join siparis
  on sirket.sirket_id=siparis.sirket_id
 union
 
 select sirket_isim, sirket.sirket_id,
  siparis_id,siparis_tarihi
 from sirket
 right join siparis
 on sirket.sirket_id=siparis.sirket_id;
 
 
 
-- **********************************************

	CREATE TABLE bolum (
      bolum_id   int PRIMARY KEY,
      bolum_isim VARCHAR(14),
      konum      VARCHAR(13)
    );
    
    INSERT INTO bolum VALUES (10,'MUHASEBE','IST');
    INSERT INTO bolum VALUES (20,'MUDURLUK','ANKARA');
    INSERT INTO bolum VALUES (30,'SATIS','IZMIR');
    INSERT INTO bolum VALUES (40,'ISLETME','BURSA');
    INSERT INTO bolum VALUES (50,'DEPO', 'YOZGAT');
    select *  from bolum;
 
    CREATE TABLE personel (
      personel_id   int PRIMARY KEY,
      personel_isim VARCHAR(10),
      meslek        VARCHAR(9),
      mudur_id      int,
      maas          int,
      bolum_id      int
    );
    
   SELECT * FROM personel;
  
    INSERT INTO personel VALUES (7369,'AHMET','KATIP',1111,800,20);
    INSERT INTO personel VALUES (7499,'BAHATTIN','SATISE',1222,1600,30);
    INSERT INTO personel VALUES (7521,'NESE','SATISE',1222,1250,30);
    INSERT INTO personel VALUES (1111,'MUZAFFER','MUDUR',7839,2975,20);
    INSERT INTO personel VALUES (7654,'MUHAMMET','SATISE',1222,1250,30);
    INSERT INTO personel VALUES (1222,'EMINE','MUDUR',7839,2850,30);
    INSERT INTO personel VALUES (1333,'HARUN','MUDUR',7839, 2450,10);
    INSERT INTO personel VALUES (7788,'MESUT','ANALIST',1111,3000,20);
    INSERT INTO personel VALUES (7839,'SEHER','BASKAN',NULL,5000,10);
    INSERT INTO personel VALUES (7844,'DUYGU','SATISE',1222,1500,30);
    INSERT INTO personel VALUES (7876,'ALI','KATIP',1111,1100,20);
    INSERT INTO personel VALUES (7900,'MERVE','KATIP',1222,950,30);
    INSERT INTO personel VALUES (7902,'NAZLI','ANALIST',1111,3000,20);
    INSERT INTO personel VALUES (7934,'EBRU','KATIP',1333,1300,10);
    INSERT INTO personel VALUES (7956,'SIBEL','MIMAR',1333,3300,60);
    INSERT INTO personel VALUES (7933,'ZEKI','MUHENDIS',1333,4300,60);

/* -----------------------------------------------------------------------------
  task05-> SATIS ve MUHASEBE boluminde calisan personelin isimlerini ve 
  bolumunu, once bolum sonra isim sıralı olarak listeleyen query create ediniz...
------------------------------------------------------------------------------*/ 
 select personel_isim,bolum_isim,bolum.bolum_id
 from personel
 
 left join bolum
 on bolum.bolum_id=personel.bolum_id
 where bolum_isim in('muhasebe','satIs')
 order by bolum_isim , personel_isim;


/* -----------------------------------------------------------------------------
  task06-> SATIS,ISLETME ve DEPO boluminde calisan personelin isimlerini,  
  bolumini  isim sıralı olarak listeleyen query create ediniz...
  NOT: calisani olmasa bile bolum ismi gosterilmelidir.
------------------------------------------------------------------------------*/  
 
 select bolum_isim, personel_isim
 from bolum
 left join personel
 on bolum.bolum_id=personel.bolum_id
 where bolum_isim in('satIs','Isletme','depo')
 order by personel_isim;
 
 
 
/* -----------------------------------------------------------------------------
  task07-> Tüm bolumde calisan personelin isimlerini, bolum isimlerini ve 
  maaslarini bolum ters ve maas sirali listeleyen query create ediniz...
  NOT: calisani olmasa bile bolum ismi gosterilmelidir.
------------------------------------------------------------------------------*/  

-- left join
select bolum_isim,personel_isim,maas
from bolum
left join personel
on bolum.bolum_id=personel.bolum_id
order by bolum_isim desc, maas;

-- right join
select bolum_isim,personel_isim,maas
from personel
right join bolum
on bolum.bolum_id=personel.bolum_id
order by bolum_isim desc, maas;



/* -----------------------------------------------------------------------------
  task08tel_nolar-> SATIS veya MUDURLUK boluminde calisan personelin maaslari 2000'den 
  buyuk olanlarinin isim,bolum ve maas bilgilerini bolume ve isme gore
  siralayarak listeleyen query create ediniz...
------------------------------------------------------------------------------*/   
select bolum_isim,personel_isim,maas
from bolum
left join personel
on bolum.bolum_id=personel.bolum_id
where bolum_isim in ('satIs','mudurluk') and maas>2000
order by bolum_isim,personel_isim;






