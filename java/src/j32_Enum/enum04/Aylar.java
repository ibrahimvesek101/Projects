package j32_Enum.enum04;

public enum Aylar {


    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);
int gunSayısı;

   // Aylar(int gunSayısı,String mevsim,String birthday) { //enum field'lara paramtere cons. tanımlandı
    Aylar(int gunSayısı) { //enum field'lara paramtere cons. tanımlandı
        this.gunSayısı = gunSayısı;
    }

    void  gunMiktarı(){
        System.out.println(gunSayısı);
    }
}
