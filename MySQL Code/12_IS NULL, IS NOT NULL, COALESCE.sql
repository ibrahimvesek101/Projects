/*===================== IS NULL, IS NOT NULL, COALESCE ========================
    
    IS NULL, ve IS NOT NULL, BOOLEAN operatörleridir. Bir ifadenin NULL olup 
    olmadığını kontrol ederler.  
    COALESCE ise bir fonksiyondur ve içerisindeki parameterelerden NULL olmayan
    ilk ifadeyi döndürür. Eğer aldığı tüm ifadeler NULL ise NULL döndürürür.
    syntax->     sutun_adi = COALESCE(column,value)
    ==============================================================================*/

    CREATE TABLE insanlar 
    (
        ssn CHAR(9), -- Social Security Number
        isim VARCHAR(50), 
        adres VARCHAR(50) 
    );

    INSERT INTO insanlar VALUES('123456789', 'Ali Can', 'Istanbul');
    INSERT INTO insanlar VALUES('234567890', 'Veli Cem', 'Ankara');
    INSERT INTO insanlar VALUES('345678901', 'Mine Bulut', 'Izmir');
    INSERT INTO insanlar  VALUES('456789012', 'Bursa');
	INSERT INTO insanlar VALUES('', 'Çin Li', 'Fizan');
    INSERT INTO insanlar (ssn, adres) VALUES('456789012', 'Bursa');
    INSERT INTO insanlar (ssn, adres) VALUES('567890123', 'Denizli');
    INSERT INTO insanlar (adres) VALUES('Sakarya');
    INSERT INTO insanlar (ssn) VALUES('999111222');

                
    select * from insanlar;
 /*----------------------------------------------------------------------------
    -- task01-> isimi null olanlari listeleyen query create ediniz...
  ----------------------------------------------------------------------------*/
  select * from insanlar 
  where  isim is null;
  
  
/*---------------------------------------------------------------------------- 
	-- task02-> isim null olmayanlari listeleyen query create ediniz...
      ----------------------------------------------------------------------------*/
        
  select * from insanlar 
  where  isim is not null; 
        
 /* ----------------------------------------------------------------------------
    -- task03-> isim 'i NULL olan kişilerin isim'ine NO NAME atayınız. 
-------------------------------------------------------------------------- */   
update insanlar -- atanacak recodlarn table' tanmland
set isim='NO NAME' -- atancak column ve value'si tanimlandi
where isim is null;-- atama için gerekli record null olma sarti tanimlandi

  -- taskcik -> insanlar table  task03 öncesine update ediniz.
update insanlar
set isim = null 
-- set isim is null --> is null boolean return ettiği için set komutuna kullanilamzzz
where isim ='NO NAME';

/* ----------------------------------------------------------------------------
 task04->    isim 'i NULL olanlara 'Henuz isim girilmedi'
            adres 'i NULL olanlara 'Henuz adres girilmedi'
            ssn 'i NULL olanlara ' no ssn' atayiniz..
            çoklu değişimde ve  WHERE isim IS NULL or adres is null....; 
            gibi ifade yazmamak için. coalesce=birleşmek
-----------------------------------------------------------------------------*/    

update insanlar
set isim=coalesce(isim,'Henuz isim girilmedi'),
	adres=coalesce(adres,'Henuz adres girilmedi'),
	ssn=coalesce(ssn,'no ssn');

 