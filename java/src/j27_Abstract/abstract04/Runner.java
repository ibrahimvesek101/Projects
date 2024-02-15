package j27_Abstract.abstract04;

public class Runner {
    public static void main(String[] args) {
      Baklava havucDilimi=new Baklava();
      havucDilimi.name="bolcana fistuklu ";
      havucDilimi.madeIn();// made in Turkey -> yerli ve milli
        System.out.println("havucDilimi = " + havucDilimi);// havucDilimi = name='bolcana fistuklu
        havucDilimi.taste();//good, sugar, sweet

        System.out.println("   ***  ");

      SezarSalad s=new SezarSalad();
      s.name="gavur dağı";
      s.madeIn();// made in Italy
        System.out.println("s = " + s);//s = name='gavur dağı
    }
}
