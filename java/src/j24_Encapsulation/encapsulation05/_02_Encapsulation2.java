package j24_Encapsulation.encapsulation05;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_Encapsulation2 {

/* Task->
     Runner ve  Employees, class cerate ediniz
    Employees(Çalışanlar) class'ında;
    encapsulated variable'ları oluşturunuz;
    String name,
    int salary,
    String dob (date of birth) (Doğum tarihi)


    Runner class'ın içinde;
   obj ile
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000

    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.

trick: ageCalculator isminde bir method için  Şuanki tarih - doğum yılı = employee age
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı giriniz: ");
        String name = scan.nextLine();
        System.out.println("dogum yılınızı giriniz: ");
        String dob = scan.nextLine();
        System.out.println("maasınızı giriniz: ");
        int salary = scan.nextInt();


        Employees employees = new Employees();
        employees.setName(name);
        employees.setDob(dob);
        employees.setSalary(salary);

        int employee = employees.ageCalculator(dob);


        if (employee > 18) {
            System.out.println(" Welcome to our company " + name + " your salary is " + salary + ".");
        }

        if (employee < 18) {
            System.out.println("come back when you are 18 years old.");

        }

        if (employee == 18) {
            System.out.println("we can have inter with you after that you can have a " + salary + " salary");
        }

    }
}

class Employees {

    private String name;
    private String dob; // doğum tarihi
    private int salary;

    public int ageCalculator(String dob) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate bugun = LocalDate.now();


        int yas = bugun.getYear() - LocalDate.parse(dob, format).getYear();
       // return yas;
        return Period.between(LocalDate.parse(dob, format),bugun).getYears();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}