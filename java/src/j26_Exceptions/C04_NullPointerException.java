package j26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null atamsı yapılna bir String variable length() math call edildiğinde oluşan RTE

        String str1 = "";
        System.out.println("str1.length() = " + str1.length());//0

        String str2 = null;
        //System.out.println("str2.length() = " + str2.length());//RTE : NullPointerException code kırılır...

        try {
            System.out.println("str2.length() = " + str2.length());// catch exception fırlatır
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı..");
       }catch (NullPointerException e) {
       // }catch (ArithmeticException e) { RTE : NullPointerException code kırıl
            System.out.println("Agam try exception fırlattı habarıng olsun ");
            System.out.println("Agam hele nerde görülmüş dutluk boyutu  TEEE ELLLAMMM YAA :(");
        }
        try {
            System.out.println("str1.length() = " + str1.length());//0 RTE exception fırlatmaz
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı..");
        }catch (NullPointerException e) {

            System.out.println("Agam hele nerde görülmüş dutluk boyutu  TEEE ELLLAMMM YAA :(");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
    }
}
