/* ====================== SELECT - REGEXP_LIKE ================================
    Daha karmaşık patternkalip ile query için REGEXP_LIKE komut kullanilir..  
     -- 'c' => case-sentisitive demektir
     -- 'i' => incase-sentisitive demektir ve default olarak incase-sensitive aktiftir..
    Syntax      REGEXP_LIKE(sutun_adı, 'pattern[] ', 'c' ] )
           
========================================================================== */

use javacan;

CREATE TABLE kelimeler
(
id int UNIQUE,
kelime VARCHAR(50) NOT NULL,
harf_sayisi int
);
   
    INSERT INTO kelimeler VALUES (1001, 'hot', 3);
    INSERT INTO kelimeler VALUES (1002, 'hat', 3);
    INSERT INTO kelimeler VALUES (1003, 'hit', 3);
    INSERT INTO kelimeler VALUES (1004, 'hbt', 3);
    INSERT INTO kelimeler VALUES (1005, 'hct', 3);
    INSERT INTO kelimeler VALUES (1006, 'abdi', 4);
    INSERT INTO kelimeler VALUES (1007, 'harika', 5);
    INSERT INTO kelimeler VALUES (1008, 'suzan', 5);
    INSERT INTO kelimeler VALUES (1009, 'hip', 3);
    INSERT INTO kelimeler VALUES (1010, 'HOT', 3);
    INSERT INTO kelimeler VALUES (1011, 'hOt', 3);
    INSERT INTO kelimeler VALUES (1012, 'h9t', 3);
    INSERT INTO kelimeler VALUES (1013, 'hoot', 4);
    INSERT INTO kelimeler VALUES (1014, 'haaat', 5);
    INSERT INTO kelimeler VALUES (1015, 'hooooot', 5);
    INSERT INTO kelimeler VALUES (1016, 'adem', 5);
    INSERT INTO kelimeler VALUES (1017, 'selim', 5);
  --   INSERT INTO kelimeler VALUES (1015, 'ebik gabik', 5);-- Error Code: 1062. Duplicate entry '1015' for key 'kelimeler.id'	

   
select * from kelimeler;
   
-- Task16-> İçerisinde 'ot' veya 'at' bulunan kelimeleri küçük harfe dikkat ederek listeleyen query create ediniz.
-- VEYA işlemi için | karakteri kullanılır.
select * from kelimeler where regexp_like(kelime, 'at|ot', 'c' );-- 'c' -> kck-byk harf duyarli


-- Task17->  İçerisinde 'ot' veya 'at' bulunan kelimeleri büyük-küçük harf duyarsiz listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, 'at|ot' );-- default -> kck-byk harf duyarsiz


-- Task18->  'ho' veya 'hi' ile başlayan kelimeleri büyük-küçük harf duyarsiz listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, '^ho|^hi' );-- default -> kck-byk harf duyarsiz
select * from kelimeler where regexp_like(kelime, '^ho|hi' );-- default -> kck-byk harf duyarsiz
-- ahan da Trick -> başlangiç ifadesi için ^ kullainilir

-- Task19->  Sonu 't' veya 'm' ile bitenleri büyük-küçük harf duyarsiz listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, 't$|m' );-- default -> kck-byk harf duyarsiz
select * from kelimeler where regexp_like(kelime, 't$|m$' );-- default -> kck-byk harf duyarsiz
-- ahan da Trick -> bitiş ifadesi için $ kullainilir
   
-- Task20->  h ile başlayıp t ile biten 3 harfli kelimeleri (h ile t küçük harfli olanlari) listeleyen query create ediniz.
select * from kelimeler where kelime like('h_t');-- default -> kck-byk harf duyarsiz
select * from kelimeler where regexp_like(kelime, 'h[a-zA-Z]t' );--  h9t gelmez [gelebilecek karakter belirtilir]
select * from kelimeler where regexp_like(kelime, 'h[a-zA-Z0-9]t' );-- h9t gelir




-- Task21->  h ile başlayıp t ile biten 4 harfli kelimeleri (h ile t küçük harfli olanlari) l listeleyen query create ediniz.

select * from kelimeler where regexp_like(kelime, 'h[a-zA-Z0-9][a-zA-Z0-9]t' );-- h9t gelir 

-- Task22->  İlk harfi h, son harfi t olup 2.harfi a veya i olan 3 harfli kelimelerin tüm bilgilerini listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, 'h[a|i]t' );
select * from kelimeler where regexp_like(kelime, 'h[ai]t' );
select * from kelimeler where regexp_like(kelime, 'h[ai]t$' );
-- ahan da Trick-> [] içine birden çok karakter girilirse veya mantiğinda çalişir

-- Task23->  İçinde m veya i veya e olan kelimelerin tüm bilgilerini listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, '[mie]' );
select * from kelimeler where regexp_like(kelime, '[m|i|e]' );



-- Task24->  a veya s ile başlayan kelimelerin tüm bilgilerini listeleyen query create ediniz.

select * from kelimeler where regexp_like(kelime, '^a|^s' );
select * from kelimeler where regexp_like(kelime, '^[as]' );



-- Task25-> içerisinde en az 2 adet oo barıdıran kelimelerin tüm bilgilerini listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, '[o][o]' );
select * from kelimeler where regexp_like(kelime, '[o]{2}' );-- [istene karakter]{istene karakter sayisi}



-- Task26->  içerisinde en az 4 adet oooo barıdıran kelimelerin tüm bilgilerini listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, '[o]{4}' );-- [istene karakter]{istene karakter sayisi}



-- Task27->  ilk harfi s veya b , 3. harfi l olan ve 5 harfli olan kelimelerin küçük harf duyarli listeleyen query create ediniz.
select * from kelimeler where regexp_like(kelime, '[sb][a-zA-Z0_9]l[a-zA-Z0_9][a-zA-Z0_9]','c' );



