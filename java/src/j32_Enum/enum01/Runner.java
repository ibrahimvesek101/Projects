package j32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //Task-> verilen yılın ayını numarasına göre kaç gun ektğini print eden code create ediniz.

      //  int ay=3;

        Aylar ay =Aylar.MART;//Aylar enum data type ay veriable tanımlanıp Aylar enum'dan MART field call edilerek atandı
        System.out.println("ay = " + ay); //MART
        System.out.println("ay.name() = " + ay.name()); //MART
        System.out.println("ay.ordinal() = " + ay.ordinal()); //2

        switch (ay){
            case OCAK:
                System.out.println("ocak 31 gundur...");
                break;
            case SUBAT:
                System.out.println("subat 28 gundur...");
                break;
            case MART:
                System.out.println("mart 31 gundur...");
                break;
            case NISAN:
                System.out.println("nısan 30 gundur...");
                break;
            case MAYIS:
                System.out.println("mayıs 31 gundur...");
                break;
            case HAZIRAN:
                System.out.println("haziran 31 gundur...");
                break;
            case TEMMUZ:
                System.out.println("temmuz 31 gundur...");
                break;
            case AGUSTOS:
                System.out.println("ağustos 31 gundur...");
                break;
        }
        System.out.println("Agam code cincix dewamkeee :) ");
    }
}
