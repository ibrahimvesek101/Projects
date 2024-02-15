 /*============================= DISTINCT =====================================
    DISTINCT komutu bir SORGU ifadesinde benzer olan satırları filtrelemek
    için kullanılır. Dolayısıyla seçilen sutun yada sutunlar için benzersiz veri
    içeren satırlar sorgulamayi sağlar.
    SYNTAX
    -------
    SELECT DISTINCT sutun_adi1, sutun_adi2, sutun_adi3
    FROM  tablo_adı;
==============================================================================*/
      
    CREATE TABLE javaManav 
    (
        isim varchar(50), 
        urun_adi varchar(50), 
        urun_miktari int 
    );
    
    INSERT INTO javaManav VALUES( 'IrmIzan', 'Elma', 5);
    INSERT INTO javaManav VALUES( 'Ipek', 'Armut', 3);
    INSERT INTO javaManav VALUES( 'Haluk', 'Elma', 2);
    INSERT INTO javaManav VALUES( 'Irecep', 'Uzum', 4);
    INSERT INTO javaManav VALUES( 'IrmIzan', 'Armut', 2);
    INSERT INTO javaManav VALUES( 'Halime', 'Elma', 3);
    INSERT INTO javaManav VALUES( 'IrmIzan', 'Uzum', 4);
    INSERT INTO javaManav VALUES( 'Irecep', 'Armut', 2);
    INSERT INTO javaManav VALUES( 'Irecep', 'Elma', 3);
    INSERT INTO javaManav VALUES( 'Haluk', 'Uzum', 4);
    INSERT INTO javaManav VALUES( 'MIstaaa', null, 2);
    select * from javaManav;


/* ----------------------------------------------------------------------------
  task01-> satılan farklı meyve türlerinin sayısını listeleyen query create ediniz...
-----------------------------------------------------------------------------*/     
-- select  count(distinct urun_adi) as farkli_urun_sayisi
select  count(distinct urun_adi) farkli_urun_sayisi
from javamanav;
    
/* -----------------------------------------------------------------------------
  task02-> satılan meyve  isimlerin farklı olanlarını listeleyen query create ediniz...
------------------------------------------------------------------------------*/
select distinct urun_adi

from javamanav;

/* ----------------------------------------------------------------------------
  task03->  satılan meyvelerin urun_miktarlarinin benzersiz  olanlarının  toplamlarini listeleyen query create ediniz...
-----------------------------------------------------------------------------*/  
select  sum(distinct urun_miktari) as farkli_urun_toplami
from javamanav;
    
    
    
    
    
    
    
