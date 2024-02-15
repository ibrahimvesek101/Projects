package j26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE


                //   LocalDate d1=LocalDate.of(2023,2,29);

        try {
            LocalDate d2=LocalDate.of(2023,2,29);
            System.out.println("Agam bu satırı okuduysan code exception fırlatmadı ");
        } catch (DateTimeException e) {
            System.out.println("Agam hatalı girdi yaptın : "+e.getMessage());
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
    }
}
