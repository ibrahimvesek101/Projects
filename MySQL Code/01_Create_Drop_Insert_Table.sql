/* yorum satir blok
multiople yorum satir
buraya yazlan b urafa kalr asla code olarak derlenmez... :)))
*/

--  single yorum satir... ahand a ebk gabk code asla derlenmez...
use javaCAN; -- kullanlacak db atams yapildi
create table javaCAN(-- columb field'lar parametre olarak girilen javaCAn tablo create edildi
id VARCHAR(4),
javaCAN_name VARCHAR(30),
yas int
);
/***************************
      VERI GIRISI
****************************/
select * from javaCAN;
 insert into javaCAN values(null,'Nur',33);-- javaCAN tablosuna uygun siral columb record'lar girilid
 insert into javaCAN values('102','Ismail',35);
 insert into javaCAN values('103','Abdi',37);
insert into javaCAN values('104','Murat',30);
 insert into javaCAN values('105','Haluk',48);
/***************************
     TABLODAN VERI SORGULAMA
****************************/

-- syntax -> select * from table_Name
select * from javaCAN;-- javacan tabloda tum ->* field record'larn verir.

/***************************
      PARCALI VERI GIRISI
****************************/
insert  into javaCAN(id,javaCAN_name) values('109','javvaNUR');


/***************************
      TABLOYU DB'den Silme
****************************/

-- syntax -> DROP TABLE tablo_Name;

drop table EbıkGabık;-- tablo db'den silinecek..
drop table javacan;-- tablo db'den silinecek..
select id,yas from javacan;-- javacan tabloda sadece id ve yas field record'larn verir

