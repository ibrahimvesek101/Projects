package j24_Encapsulation.Tasks.task05;

import java.util.Scanner;

public class Book {//outher Class level
    //fields...
   private String bookName;
   private String authorName;
    //constructor...
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    //getter setter...

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }


    //toString...

    @Override
    public String toString() {
        return
                "'Aganın okudugu kitab '" + bookName + '\'' +
                ", 'Aganın kitabının yazarı ='" + authorName ;
    }
}//outher class sonu

class BookRunner {//inner Class level

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Agam hangi eseri mutalaa edirsen :) :");
        String aganınKitabı = input.nextLine();
        System.out.println("Agam eserin müellifi kimdir : ");
        String eserMuellifi = input.nextLine();
        Book b1 = new Book(aganınKitabı);
        System.out.println("b1 = " + b1);//b1 = 'Aganın okudugu kitab 'ebik', 'Aganın kitabının yazarı ='null
        b1.setAuthorName(eserMuellifi);
        System.out.println("b1 = " + b1);//b1 = 'Aganın okudugu kitab 'ebik', 'Aganın kitabının yazarı ='gabık
    }
}//inner class sonu
































