package j24_Encapsulation.encapsulation04;


import java.util.Scanner;

public class MainAna {//Main ->Ana class

    /*
        Runner ve Student classları create ediniz
        Student classı içinde;
        String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz

        Runner classın içinde;
        girilen değerleri aşagıdaki gibi print eden code create ediniz
       Örnek:
        age 48'dir.
        name Haluk'tur.

        output
        "Student name is Haluk"
        "He is 48 years old"

     */
    public static void main(String[] args) {
        // girilen değerleri...
        Scanner sc = new Scanner(System.in);
        System.out.print("agam adını giresen : ");
        String ad=sc.nextLine();
        System.out.print("agam yasını giresen : ");
        int yas =sc.nextInt();
        Student s1=new Student(ad,yas);//ad ve yas data p'li cons parametre olarak göderildi s1 obj tanımlandı
        System.out.println("student name is "+s1.getName()+"\nHe is "+s1.getAge()+" years old");


    }//main method sonu
}//class sonu

class Student {//Student Class-> inner Class
    // String name ve int age  variables encapsulated ediniz.
    private String name;
    private int age;

    public Student(String name, int age) {//full p cons.
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


